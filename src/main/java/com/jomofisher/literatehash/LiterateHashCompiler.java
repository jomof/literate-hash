package com.jomofisher.literatehash;

import java.util.*;

/**
 * Build a Literate hash instance that can be used to convert numbers to mnemonic phrases so that they might be more
 * easily remembered.
 */
public class LiterateHashCompiler {
    private final Map<String, String[]> groups = new HashMap<>();
    private boolean allowLiteralTextInPattern = false;
    private List<String> patterns = new ArrayList<>();

    LiterateHashCompiler() {
        this.groups.put(DefaultWordGroup.SINGULAR_PRONOUN_CODE, DefaultWordGroup.SINGULAR_PRONOUNS);
    }

    private static void assertThatArrayIsAllUnique(String array[]) {
        Set<String> seen = new HashSet<>();
        for (String element : array) {
            if (seen.contains(element)) {
                throw new RuntimeException(String.format(
                        "Compilation failed because word '%s' appears more than once", element));
            }
            seen.add(element);
        }
    }

    private static void assertThatArrayHasNoSpaces(String array[]) {
        for (String element : array) {
            if (element.contains(" ")) {
                throw new RuntimeException(String.format("Compilation failed because word has a space '%s'", element));
            }
        }
    }

    public LiterateHashCompiler setAdjectives(String adjectives[]) {
        assertThatArrayIsAllUnique(adjectives);
        assertThatArrayHasNoSpaces(adjectives);
        this.groups.put(DefaultWordGroup.ADJECTIVE_CODE, adjectives);
        return this;
    }

    public LiterateHashCompiler setSingularNouns(String singularNouns[]) {
        assertThatArrayIsAllUnique(singularNouns);
        assertThatArrayHasNoSpaces(singularNouns);
        this.groups.put(DefaultWordGroup.SINGULAR_NOUN_CODE, singularNouns);
        return this;
    }

    public LiterateHashCompiler setThirdPersonSingularNouns(String thirdPersonSingularNouns[]) {
        assertThatArrayIsAllUnique(thirdPersonSingularNouns);
        assertThatArrayHasNoSpaces(thirdPersonSingularNouns);
        this.groups.put(DefaultWordGroup.THIRD_PERSON_SINGULAR_VERB_CODE, thirdPersonSingularNouns);
        return this;
    }

    public LiterateHashCompiler allowLiteralTextInPattern() {
        this.allowLiteralTextInPattern = true;
        return this;
    }

    public LiterateHashCompiler addPattern(String pattern) {
        this.patterns.add(pattern);
        return this;
    }

    private List<String[]> compilePattern(String pattern) {
        List<String[]> compiledPattern = new ArrayList<>();
        String residue = "";
        while (pattern.length() > 0) {
            String matchedCode = null;

            for (String code : groups.keySet()) {
                if (pattern.startsWith(code)) {
                    matchedCode = code;
                    break;
                }
            }

            if (matchedCode == null) {
                // No match, accumulate residue
                residue = residue + pattern.substring(0, 1);
                pattern = pattern.substring(1);
            } else {
                if (residue.length() > 0) {
                    if (!allowLiteralTextInPattern) {
                        throw new RuntimeException(String.format("Pattern has literal text '%s'. " +
                                "If this is correct then call allowLiteralTextInPattern() first.", residue));
                    }
                    if (residue.contains("{")) {
                        throw new RuntimeException(String.format("Pattern '%s' not recognized. Allowed patterns: %s",
                                residue, groups.keySet()));
                    }
                    compiledPattern.add(new String[]{residue});
                    residue = "";
                }
                compiledPattern.add(groups.get(matchedCode));
                pattern = pattern.substring(matchedCode.length());
            }
        }

        if (residue.length() > 0) {
            compiledPattern.add(new String[]{residue});
        }

        return compiledPattern;
    }

    public LiterateHash compile() {
        if (patterns.size() == 0) {
            throw new RuntimeException("Expected addPattern to have been called");
        }

        Set<String> seen = new HashSet<>();
        for (String[] group : groups.values()) {
            for (String element : group) {
                if (seen.contains(element)) {
                    throw new RuntimeException(String.format("Duplicate word '%s' seen in two different groups",
                            element));
                }
                seen.add(element);
            }
        }

        List<List<String[]>> compiledPatterns = new ArrayList<>();
        for (String pattern : patterns) {
            compiledPatterns.add(compilePattern(pattern));
        }


        return new LiterateHash(compiledPatterns);
    }
}

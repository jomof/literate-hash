package com.jomofisher.literatehash;

import java.util.List;

/**
 * Methods for converting numbers to mnemonic phrases so that they might be more easily remembered.
 */
public class LiterateHash {
    private static final LiterateHash DEFAULT_HASHER;

    static {
        DEFAULT_HASHER = newBuilder()
                .addPattern("{SingularNoun}{SingularVerb}{Adj}{SingularNoun}")
                .addPattern("{SingularNoun}{SingularNoun}{SingularVerb}{SingularNoun}")
                .addPattern("{Adj}{SingularNoun}{SingularVerb}{SingularNoun}")
                .compile();
    }

    private final List<List<String[]>> patterns;

    LiterateHash(List<List<String[]>> patterns) {
        this.patterns = patterns;
        testPattern(0);
        testPattern(-1);
        testPattern(1);
        testPattern(Integer.MAX_VALUE);
        testPattern(Integer.MIN_VALUE);
        testPattern(2147483647);
        testPattern(-1808414717);
        testPattern(856233665);
    }

    /**
     * @return a builder with some default word groups.
     */
    public static LiterateHashCompiler newBuilder() {
        return new LiterateHashCompiler()
                .setAdjectives(DefaultWordGroup.ADJECTIVES)
                .setSingularNouns(DefaultWordGroup.SINGULAR_NOUNS)
                .setThirdPersonSingularNouns(DefaultWordGroup.THIRD_PERSON_SINGULAR_VERBS);
    }

    public static String of(Object object) {
        return DEFAULT_HASHER.getLiterateHash(object.hashCode());
    }

    private void testPattern(int number) {
        String hash = fromScrambledInt(number);
        if (hash.contains("#")) {
            throw new RuntimeException(String.format("Compiled hash builder failed test of %s, returning value " +
                    "%s which has #", number, hash));
        }

        hash = fromInt(number);
        if (hash.contains("#")) {
            throw new RuntimeException(String.format("Compiled hash builder failed test of %s, returning value " +
                    "%s which has #", number, hash));
        }
    }

    private String fromInt(int number) {
        // Scramble with a large prime
        number ^= 2147483647;
        return fromScrambledInt(number);
    }

    private String fromScrambledInt(int number) {
        // Handle negative
        if (number < 0) {
            number *= 2; // maybe lose a bit here ¯\_(ツ)_/¯
            if (number < 0) {
                number = -number;
            }
        }

        // Choose a pattern to follow
        int index = number % patterns.size();
        if (index < 0) {
            throw new RuntimeException(String.format("Negative index from %s and %s", number, patterns.size()));
        }
        List<String[]> pattern = patterns.get(index);
        number /= patterns.size();

        // Follow the pattern to construct hash
        StringBuilder result = new StringBuilder();
        for (String[] wordGroup : pattern) {
            result.append(wordGroup[number % wordGroup.length]);
            number /= wordGroup.length;
        }

        if (number > 0) {
            // If there is some overflow, record it. Shouldn't happen for the default case.
            return String.format("%s#%s", result.toString(), number);
        }

        return result.toString();
    }

    public String getLiterateHash(int number) {
        return fromInt(number);
    }
}

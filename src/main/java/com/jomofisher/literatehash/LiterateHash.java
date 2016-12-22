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
        testPattern(-769513899);
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

    /**
     * Given an object, first convert it to an integer hash code by calling object.hashCode(). This integer is then
     * converted to a text phrase like "SpaceWizardHelpsDrifter". Only 32-bits of information are encoded in the
     * hash so collisions should be as likely as collisions between normal Java hash codes.
     *
     * @param object the object to hash.
     * @return an string phrase that is easier to remember.
     */
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

    private String fromScrambledInt(int num) {
        long number = num;
        // Handle negative
        if (number < 0) {
            number *= -2;
        }

        // Choose a pattern to follow
        int index = (int) (number % patterns.size());
        if (index < 0) {
            throw new RuntimeException(String.format("Negative index from %s and %s", number, patterns.size()));
        }
        List<String[]> pattern = patterns.get(index);
        number /= patterns.size();

        // Follow the pattern to construct hash
        StringBuilder result = new StringBuilder();
        for (String[] wordGroup : pattern) {
            result.append(wordGroup[(int) (number % wordGroup.length)]);
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

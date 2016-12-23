package com.example.tests;

import com.jomofisher.literatehash.LiterateHash;
import org.junit.Test;

import java.util.Random;

import static com.google.common.truth.Truth.assertThat;

public class TestLiterateHash {

    @Test
    public void testCompilerRejectsSpaceInWord() {
        try {
            LiterateHash.newBuilder()
                    .setAdjectives(new String[]{"Very happy"})
                    .compile();
        } catch (RuntimeException e) {
            if (e.getMessage().contains("space")) {
                return;
            }
            throw e;
        }
        throw new RuntimeException("Expected failure");
    }

    @Test
    public void testCompilerRejectsDuplicateWord() {
        try {
            LiterateHash.newBuilder()
                    .setAdjectives(new String[]{"Happy", "Happy"})
                    .compile();
        } catch (RuntimeException e) {
            if (e.getMessage().contains("more than once")) {
                return;
            }
            throw e;
        }
        throw new RuntimeException("Expected failure");
    }

    @Test
    public void testCompilerRejectsDuplicateWordsBetweenGroups() {
        try {
            LiterateHash.newBuilder()
                    .addPattern("{SingularNoun}{SingularVerb}{Adj}{SingularNoun}")
                    .addPattern("{SingularNoun}{SingularNoun}{SingularVerb}{SingularNoun}")
                    .addPattern("{Adj}{SingularNoun}{SingularVerb}{SingularNoun}")
                    .setAdjectives(new String[]{"Happy"})
                    .setSingularNouns(new String[]{"Happy"})
                    .compile();
        } catch (RuntimeException e) {
            if (e.getMessage().contains("uplicate")) {
                return;
            }
            throw e;
        }
        throw new RuntimeException("Expected failure");
    }

    @Test
    public void testLiteralTextNotAllowed() {
        try {
            LiterateHash.newBuilder()
                    .addPattern("{SingularPronoun}{SingularVerb}The{Adj}{SingularNoun}{SingularNoun}")
                    .compile();
        } catch (RuntimeException e) {
            if (e.getMessage().contains("literal text")) {
                return;
            }
            throw e;
        }
        throw new RuntimeException("Expected failure");
    }

    @Test
    public void testLiteralTextAllowed() {
        String hash =
                LiterateHash.newBuilder()
                        .allowLiteralTextInPattern()
                        .addPattern("{SingularPronoun}{SingularVerb}The{Adj}{SingularNoun}{SingularNoun}")
                        .compile()
                        .getLiterateHash(192);
        assertThat(hash).contains("The");
    }

    @Test
    public void testLiteralTextAllowedAtEnd() {
        String hash =
                LiterateHash.newBuilder()
                        .allowLiteralTextInPattern()
                        .addPattern("{SingularPronoun}{SingularVerb}{Adj}{SingularNoun}{SingularNoun}TheEnd")
                        .compile()
                        .getLiterateHash(192);
        assertThat(hash).contains("TheEnd");
    }

    @Test
    public void testLiteralTextWithCurlyAllowed() {
        String hash =
                LiterateHash.newBuilder()
                        .allowLiteralTextInPattern()
                        .addPattern("{SingularPronoun}{SingularVerb}{Adj}{SingularNoun}{SingularNoun}{TheEnd}")
                        .compile()
                        .getLiterateHash(192);
        assertThat(hash).contains("{TheEnd}");
    }

    @Test
    public void testCompileWithNoAddPattern() {
        try {
            LiterateHash.newBuilder()
                    .compile();
        } catch (RuntimeException e) {
            if (e.getMessage().contains("addPattern")) {
                return;
            }
            throw e;
        }
        throw new RuntimeException("Expected failure");
    }

    @Test
    public void testNewBuilder() {
        LiterateHash hash = LiterateHash.newBuilder()
                .allowLiteralTextInPattern()
                .addPattern("{SingularNoun}{SingularVerb}The{Adj}{SingularNoun}")
                .addPattern("{SingularNoun}{SingularNoun}{SingularVerb}{SingularNoun}")
                .addPattern("{Adj}{SingularNoun}{SingularVerb}{SingularNoun}")
                .compile();
        String result = hash.getLiterateHash(192);
        assertThat(result).doesNotContain("#");
    }

    @Test
    public void testInsufficientWordSpace() {
        try {
            LiterateHash hash = LiterateHash.newBuilder()
                    .allowLiteralTextInPattern()
                    .addPattern("{SingularNoun}{SingularVerb}The{Adj}{SingularNoun}")
                    .compile();
            String result = hash.getLiterateHash(192);
            assertThat(result).doesNotContain("#");
        } catch (RuntimeException e) {
            if (e.getMessage().contains("which has #")) {
                return;
            }
            throw e;
        }
        throw new RuntimeException("Expected failure");
    }

    @Test
    public void testInsufficientWordSpaceUnscrambled() {
        try {
            LiterateHash hash = LiterateHash.newBuilder()
                    .allowLiteralTextInPattern()
                    .addPattern("{SingularNoun}{SingularVerb}The{Adj}{SingularNoun}")
                    .compile();
            String result = hash.getLiterateHash(192 ^ 2147483647);
            assertThat(result).doesNotContain("#");
        } catch (RuntimeException e) {
            if (e.getMessage().contains("which has #")) {
                return;
            }
            throw e;
        }
        throw new RuntimeException("Expected failure");
    }

    @Test
    public void testOfInt() {
        String result = LiterateHash.of(192);
        assertThat(result).doesNotContain("#");
    }

    @Test
    public void testOfString() {
        String hash = LiterateHash.of(
                "Beware the Jabberwock, my son!" +
                        "The jaws that bite, the claws that catch!" +
                        "Beware the Jubjub bird, and shun" +
                        "The frumious Bandersnatch! ");
        assertThat(hash).isEqualTo("TidyRadioThrillsLead");
    }

    //@Test
    public void testSelfHash() {
        String current = "";
        String last = "hello";
        while (!last.equals(current)) {
            last = current;
            current = LiterateHash.of(last);
        }
        System.out.printf("Found self hash: %s", last);

    }

    @Test
    public void testRandomHash() {
        Random rand = new Random();
        int maxLength = 0;
        String longest = "";
        for (int i = 0; i < 1000; ++i) {
            int r = rand.nextInt();
            String result;
            try {
                result = LiterateHash.of(r);
            } catch (Throwable e) {
                throw new RuntimeException(String.format("MatchingHash(%s)", r));
            }
            assertThat(result).named("Hash(%s)", r).doesNotContain("#");
            if (result.length() > maxLength) {
                longest = result;
                maxLength = result.length();
            }

            //System.out.printf("%s\n", result);
        }
        System.out.printf("Longest was %s characters: %s", maxLength, longest);
    }
}

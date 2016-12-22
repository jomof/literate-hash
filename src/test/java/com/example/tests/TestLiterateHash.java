package com.example.tests;

import com.jomofisher.literatehash.LiterateHash;
import org.junit.Test;

import java.util.Random;

import static com.google.common.truth.Truth.assertThat;

public class TestLiterateHash {
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

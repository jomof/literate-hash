package com.example.tests;

import com.jomofisher.literatehash.LiterateHash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Random;

import static com.google.common.truth.Truth.assertThat;

@RunWith(JUnit4.class)
public class TestLiterateHash {
//    @Test
//    public void testNewBuilder() {
//        LiterateHash.newBuilder().compile();
//    }

    @Test
    public void testOfInt() {
        String result = LiterateHash.of(192);
        assertThat(result).doesNotContain("#");
    }


    //@Test
    public void testRandomHash() {
        Random rand = new Random();
        int maxLength = 0;
        String longest = "";
        for (int i = 0; i < 50000; ++i) {
            int r = rand.nextInt();
            String result;
            try {
                result = LiterateHash.of(r);
            } catch (Throwable e) {
                throw new RuntimeException(String.format("Hash(%s)", r));
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

package com.jomofisher.literatehash;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Set;

@RunWith(JUnit4.class)
public class TestDefaultWordGroup {
    private static void assertThatArrayIsAllUnique(String array[]) {
        Set<String> seen = Sets.newHashSet();
        for (String element : array) {
            if (seen.contains(element)) {
                throw new RuntimeException(String.format("Array contains duplicate value %s", element));
            }
            seen.add(element);
        }
    }

    @Test
    public void testUniqueAdjectives() {
        assertThatArrayIsAllUnique(DefaultWordGroup.ADJECTIVES);
    }

    @Test
    public void testUniqueVerbs() {
        assertThatArrayIsAllUnique(DefaultWordGroup.THIRD_PERSON_SINGULAR_VERBS);
    }

    @Test
    public void testUniqueNouns() {
        assertThatArrayIsAllUnique(DefaultWordGroup.SINGULAR_NOUNS);
    }

    @Test
    public void testAdjectivesThatCanBeSafelyRemoved() {
        List<String> words = Lists.newArrayList(DefaultWordGroup.ADJECTIVES);
        List<String> removeable = Lists.newArrayList();
        words.sort(new StringLengthListSort());
        Random rand = new Random();
        for (int i = 0; i < 10; ++i) {
            String candidate = words.get(0);
            words.remove(0);
            String newWords[] = words.toArray(new String[words.size() - 1]);

            LiterateHash hash = LiterateHash.newBuilder()
                    .setAdjectives(newWords)
                    .addPattern("{SingularNoun}{SingularVerb}{Adj}{SingularNoun}")
                    .addPattern("{SingularNoun}{SingularNoun}{SingularVerb}{SingularNoun}")
                    .addPattern("{Adj}{SingularNoun}{SingularVerb}{SingularNoun}")
                    .compile();
            for (int j = 0; j < 5000000; ++j) {
                int r = rand.nextInt();
                String result;
                result = hash.getLiterateHash(r);

                if (result.contains("#")) {
                    System.out.printf("Can remove: %s\n", removeable);
                    return;
                }
            }


            removeable.add(candidate);
        }
        System.out.printf("Can remove: %s\n", removeable);
    }

    @Test
    public void testNounsThatCanBeSafelyRemoved() {
        List<String> words = Lists.newArrayList(DefaultWordGroup.SINGULAR_NOUNS);
        List<String> removeable = Lists.newArrayList();
        words.sort(new StringLengthListSort());
        Random rand = new Random();
        for (int i = 0; i < 10; ++i) {
            String candidate = words.get(0);
            words.remove(0);
            String newWords[] = words.toArray(new String[words.size() - 1]);

            LiterateHash hash = LiterateHash.newBuilder()
                    .setSingularNouns(newWords)
                    .addPattern("{SingularNoun}{SingularVerb}{Adj}{SingularNoun}")
                    .addPattern("{SingularNoun}{SingularNoun}{SingularVerb}{SingularNoun}")
                    .addPattern("{Adj}{SingularNoun}{SingularVerb}{SingularNoun}")
                    .compile();
            for (int j = 0; j < 10000000; ++j) {
                int r = rand.nextInt();
                String result;
                try {
                    result = hash.getLiterateHash(r);
                } catch (Throwable e) {
                    throw new RuntimeException(String.format("Error with %s", r), e);
                }

                if (result.contains("#")) {
                    System.out.printf("Hit limit, can remove: %s\n", removeable);
                    return;
                }
            }
            //if (candidate.endsWith("ite") || candidate.endsWith("ium"))
            removeable.add(candidate);
        }
        System.out.printf("Can remove: %s\n", removeable);
    }

    class StringLengthListSort implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return s2.length() - s1.length();
        }
    }
}

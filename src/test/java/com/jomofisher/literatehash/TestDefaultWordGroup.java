package com.jomofisher.literatehash;

import com.google.common.collect.Sets;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

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
        assertThatArrayIsAllUnique(DefaultWordGroup.VERBS);
    }

    @Test
    public void testUniqueNouns() {
        assertThatArrayIsAllUnique(DefaultWordGroup.NOUNS);
    }
}

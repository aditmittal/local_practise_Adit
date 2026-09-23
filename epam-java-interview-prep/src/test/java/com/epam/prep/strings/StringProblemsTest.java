package com.epam.prep.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProblemsTest {

    @Test
    void testPalindrome() {

        assertTrue(
                StringProblems.isPalindrome("madam")
        );

        assertFalse(
                StringProblems.isPalindrome("hello")
        );
    }

    @Test
    void testReverseString() {

        assertEquals(
                "olleh",
                StringProblems.reverseString("hello")
        );
    }

    @Test
    void testAnagram() {

        assertTrue(
                StringProblems.isAnagram("listen", "silent")
        );

        assertFalse(
                StringProblems.isAnagram("hello", "world")
        );
    }
}

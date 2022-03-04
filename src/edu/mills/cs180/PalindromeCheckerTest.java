package edu.mills.cs180;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

class PalindromeCheckerTest {

    @Test
    void isPalindrome_True_EmptyString() {
        String s = "";
        assertTrue(PalindromeChecker.isPalindrome(s));
    }

    @ParameterizedTest
    @ValueSource(strings = {"AMA", "racecar", "x"})
    void isPalindrome_True(String s) {
        assertTrue(PalindromeChecker.isPalindrome(s));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Java", "abc", "spatula"})
    void isPalindrome_False(String s) {
        assertFalse(PalindromeChecker.isPalindrome(s));
    }

}

package util;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import util.exceptions.EmptyStringException;

public class StringUtilsTest {

    @Test
    void testPalindromeTrue() {
        assertTrue(StringUtils.isPalindrome("racecar"));
    }

    @Test
    void testPalindromeFalse() {
        assertFalse(StringUtils.isPalindrome("hello"));
    }

    @Test
    void testEmptyStringException() {
        assertThrows(EmptyStringException.class, () -> {
            StringUtils.isPalindrome("");
        });
    }
    @Test
    void testNormalizeWhitespace() {
        String result = StringUtils.normalizeWhitespace("  hello   world  ");
        assertEquals("hello world", result);
    }

    @Test
    void testReverseWords() {
        String result = StringUtils.reverseWords("hello world");
        assertEquals("world hello", result);
    }
}
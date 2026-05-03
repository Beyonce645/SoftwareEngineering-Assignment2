/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import util.exceptions.EmptyStringException;

/**
 *
 * @author const
 */
public class StringUtils {
    public static boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            throw new EmptyStringException("Input cannot be empty");
        }

        String clean = s.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static int countOccurrences(String s, char c) {
        if (s == null) return 0;

        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == c) count++;
        }
        return count;
    }

    public static String normalizeWhitespace(String s) {
        if (s == null) return null;
        return s.trim().replaceAll("\\s+", " ");
    }

    public static boolean isValidEmail(String s, PatternProvider provider) {
        if (s == null || s.isEmpty()) return false;
        return s.matches(provider.getEmailRegex());
    }

    public static String reverseWords(String s) {
        if (s == null) return null;

        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) result.append(" ");
        }

        return result.toString();
    }
}

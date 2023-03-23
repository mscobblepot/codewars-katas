package com.codewars.longestpalindrome;

import java.util.ArrayList;
import java.util.List;

public class PalindromeFinder {
    public int getLengthOfLongestPalindrome(String text) {
        List<String> substrings = getAllSubstrings(text);
        return substrings.stream()
                .filter(this::isPalindrome)
                .mapToInt(String::length)
                .max()
                .orElse(0);
    }

    private List<String> getAllSubstrings(String text) {
        List<String> substrings = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            for (int j = i + 1; j <= text.length(); j++) {
                substrings.add(text.substring(i, j));
            }
        }
        return substrings;
    }

    private boolean isPalindrome(String text) {
        return text.equals(new StringBuilder(text).reverse().toString());
    }
}

package com.codewars.longestpalindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeFinderTest {
    PalindromeFinder palindromeFinder = new PalindromeFinder();

    @CsvSource({
            "0, ''",
            "1, 'a'",
            "2, 'aa'",
            "2, 'aab'",
            "2, 'baa'",
            "1, 'abc'",
            "3, 'aaa'",
            "3, 'aba'",
            "4, 'abba'",
            "4, 'baabcd'",
            "9, 'baablkj12345432133d'"
    })

    @ParameterizedTest
    void findLongestPalindrome(int expected, String text) {
        int result = palindromeFinder.getLengthOfLongestPalindrome(text);

        assertEquals(expected, result);
    }
}
package com.codewars.wordspin;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordSpinnerTest {
    WordSpinner wordSpinner = new WordSpinner();

    @CsvSource({
            "'', ''",
            "a, a",
            "abc, abc",
            "abcd, abcd",
            "edcba, abcde",
            "emocleW, Welcome",
            "Hey wollef sroirraw, Hey fellow warriors",
            "This is a test, This is a test",
            "This is rehtona test, This is another test"
    }
    )

    @ParameterizedTest
    void spinWords(String expected, String words) {
        String result = wordSpinner.spin(words);

        assertEquals(expected, result);
    }
}
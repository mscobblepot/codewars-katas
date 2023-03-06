package com.codewars.descendingorder;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitsSorterTest {
    DigitsSorter digitSorter = new DigitsSorter();

    @CsvSource({
            "0, 0",
            "1, 1",
            "10, 10",
            "11, 11",
            "21, 12",
            "21, 21",
            "211, 112",
            "211, 121",
            "211, 211",
            "321, 123",
            "54421, 42145",
            "654321, 145263",
            "987654321, 123456789"
    }
    )

    @ParameterizedTest
    void sortDigits(int expected, int number) {
        int result = digitSorter.sortDescending(number);

        assertEquals(expected, result);
    }
}
package com.codewars.countingduplicates;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.*;

class DuplicateCounterTest {

    DuplicateCounter duplicateCounter = new DuplicateCounter();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of(0, "abcde"),
                of(1, "abcdea"),
                of(2, "aabbcde"),
                of(2, "aabBcde"),
                of(2, "aA11"),
                of(2, "ABBA"),
                of(2, "Indivisibilities"),
                of(1, "indivisibility")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void countDuplicates(int expected, String text) {
        int result = duplicateCounter.countDuplicates(text);

        assertEquals(expected, result);
    }

}
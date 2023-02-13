package com.codewars.multiples;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.*;

class MultipleFinderTest {
    MultipleFinder multipleFinder = new MultipleFinder();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of(0, 0),
                of(0, -1),
                of(0, 3),
                of(3, 4),
                of(3, 5),
                of(8, 6),
                of(23, 10),
                of(60, 16)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void sumMultiples(int expected, int number) {
        int result = multipleFinder.sumMultiplies(number);

        assertEquals(expected, result);
    }
}
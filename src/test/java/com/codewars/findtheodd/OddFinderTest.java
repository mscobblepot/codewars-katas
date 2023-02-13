package com.codewars.findtheodd;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class OddFinderTest {

    OddFinder oddFinder = new OddFinder();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of(0, new int[]{0}),
                of(1, new int[]{1}),
                of(2, new int[]{1, 1, 2}),
                of(2, new int[]{1, 2, 1}),
                of(2, new int[]{2, 1, 1}),
                of(0, new int[]{0, 1, 0, 1, 0}),
                of(5, new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}),
                of(-1, new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void findOdd(int expected, int[] numbers) {
        int result = oddFinder.findOdd(numbers);

        assertEquals(expected, result);
    }

}
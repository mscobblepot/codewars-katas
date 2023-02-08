package com.codewars.sorttheodd;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.of;


class OddSorterTest {
    OddSorter oddSorter = new OddSorter();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of(new int[]{}, new int[]{}),
                of(new int[]{1}, new int[]{1}),
                of(new int[]{1, 0}, new int[]{1, 0}),
                of(new int[]{0, 1}, new int[]{0, 1}),
                of(new int[]{0, 4, 2, 8}, new int[]{0, 4, 2, 8}),
                of(new int[]{1, 3, 5, 7}, new int[]{7, 3, 5, 1}),
                of(new int[]{1, 3, 2, 8, 5, 4}, new int[]{5, 3, 2, 8, 1, 4}),
                of(new int[]{1, 3, 5, 8, 0}, new int[]{5, 3, 1, 8, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void sortOdds(int[] expected, int[] array) {
        int[] result = oddSorter.sortOdds(array);

        assertArrayEquals(expected, result);
    }
}
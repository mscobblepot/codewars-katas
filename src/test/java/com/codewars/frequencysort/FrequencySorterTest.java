package com.codewars.frequencysort;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class FrequencySorterTest {
    FrequencySorter frequencySorter = new FrequencySorter();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of(new int[]{}, new int[]{}),
                of(new int[]{1}, new int[]{1}),
                of(new int[]{1, 2}, new int[]{1, 2}),
                of(new int[]{1, 2}, new int[]{2, 1}),
                of(new int[]{-1, 1}, new int[]{-1, 1}),
                of(new int[]{-1, 1}, new int[]{1, -1}),
                of(new int[]{2, 2, 1}, new int[]{2, 1, 2}),
                of(new int[]{2, 2, 1}, new int[]{2, 2, 1}),
                of(new int[]{2, 2, 1}, new int[]{1, 2, 2}),
                of(new int[]{3, 3, 3, 5, 5, 7, 7, 2, 9}, new int[]{2, 3, 5, 3, 7, 9, 5, 3, 7}),
                of(new int[]{1, 1, 1, 0, 0, 6, 6, 8, 8, 2, 3, 5, 9}, new int[]{1, 2, 3, 0, 5, 0, 1, 6, 8, 8, 6, 9, 1}),
                of(new int[]{9, 9, 9, 9, 4, 4, 5, 5, 6, 6}, new int[]{5, 9, 6, 9, 6, 5, 9, 9, 4, 4}),
                of(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 8}, new int[]{4, 4, 2, 5, 1, 1, 3, 3, 2, 8}),
                of(new int[]{0, 0, 4, 4, 9, 9, 3, 5, 7, 8}, new int[]{4, 9, 5, 0, 7, 3, 8, 4, 9, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void sortByFrequency(int[] expected, int[] numbers) {
        int[] result = frequencySorter.sortByFrequency(numbers);

        assertArrayEquals(expected, result);
    }
}
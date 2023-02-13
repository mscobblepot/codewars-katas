package com.codewars.arraydifference;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class ArraySubtractorTest {
    ArraySubtractor arrayComparator = new ArraySubtractor();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of(new int[]{}, new int[]{}, new int[]{}),
                of(new int[]{}, new int[]{}, new int[]{1}),
                of(new int[]{1}, new int[]{1}, new int[]{}),
                of(new int[]{}, new int[]{1}, new int[]{1}),
                of(new int[]{2, 2}, new int[]{1, 2, 2}, new int[]{1}),
                of(new int[]{1}, new int[]{1, 2, 2}, new int[]{2})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void subtractList(int[] expected, int[] first, int[] second) {
        int[] result = arrayComparator.subtractArray(first, second);

        assertArrayEquals(result, expected);
    }
}
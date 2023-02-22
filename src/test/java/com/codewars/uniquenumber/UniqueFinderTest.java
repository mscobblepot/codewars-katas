package com.codewars.uniquenumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class UniqueFinderTest {
    UniqueFinder uniqueFinder = new UniqueFinder();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of(1.0, new double[]{0, 0, 1}),
                of(1.0, new double[]{0, 1, 0}),
                of(1.0, new double[]{1, 0, 0}),
                of(2.0, new double[]{2, 1, 1, 1}),
                of(2.0, new double[]{1, 2, 1, 1}),
                of(2.0, new double[]{1, 1, 2, 1}),
                of(2.0, new double[]{1, 1, 1, 2})
                );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void findUnique(double expected, double[] numbers) {
        double result = uniqueFinder.findUnique(numbers);

        double precision = 0.0000000000001;
        assertEquals(expected, result, precision);
    }

}
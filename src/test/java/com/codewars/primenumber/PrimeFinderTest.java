package com.codewars.primenumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

class PrimeFinderTest {
    PrimeFinder primeFinder = new PrimeFinder();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of(false, 0),
                of(false, 1),
                of(true, 2),
                of(false, 10),
                of(true, 5099),
                of(false, -1),
                of(false, -10)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void isPrime(boolean expected, int number) {
        boolean result = primeFinder.isPrime(number);

        assertEquals(expected, result);
    }

}
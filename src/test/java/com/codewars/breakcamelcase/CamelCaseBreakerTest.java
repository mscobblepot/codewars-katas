package com.codewars.breakcamelcase;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.*;

class CamelCaseBreakerTest {
    CamelCaseBreaker camelCaseBreaker = new CamelCaseBreaker();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of("", ""),
                of("a", "a"),
                of("a Ba", "aBa"),
                of("aa Bb Cc", "aaBbCc")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void CamelCaseBreaker(String expected, String word) {
        String result = camelCaseBreaker.breakCamelCase(word);

        assertEquals(expected, result);
    }

}
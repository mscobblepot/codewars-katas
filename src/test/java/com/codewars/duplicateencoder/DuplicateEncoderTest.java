package com.codewars.duplicateencoder;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

class DuplicateEncoderTest {
    DuplicateEncoder duplicateEncoder = new DuplicateEncoder();
    public static Stream<Arguments> parameters() {
        return Stream.of(
                of("(", " "),
                of("(", "a"),
                of("(", "A"),
                of("))", "aa"),
                of("))", "AA"),
                of("))", "aA"),
                of("))", "Aa"),
                of("((", "ab"),
                of("((", "AB"),
                of("((", "aB"),
                of("((", "Ab"),
                of("())", "abb"),
                of("())", "aBb"),
                of("())", "abB"),
                of("())", "aBB"),
                of("))(", "aab"),
                of("))(", "aAb"),
                of("))(", "Aab"),
                of("))(", "aaB"),
                of("()()()", "recede"),
                of(")())())", "Success"),
                of("))((", "(( @")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void encode(String expected, String text) {
        String result = duplicateEncoder.encode(text);

        assertEquals(expected, result);
    }
}
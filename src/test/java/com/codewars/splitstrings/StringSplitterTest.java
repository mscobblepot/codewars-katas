package com.codewars.splitstrings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

class StringSplitterTest {
    StringSplitter stringSplitter = new StringSplitter();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of(new String[]{}, ""),
                of(new String[]{"ab", "c_"}, "abc"),
                of(new String[]{"ab", "cd", "ef"}, "abcdef"),
                of(new String[]{"ab", "cd", "ef", "g_"}, "abcdefg")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void setStringSplitter(String[] expected, String text) {
        String[] result = stringSplitter.splitString(text);

        assertArrayEquals(expected, result);
    }
}
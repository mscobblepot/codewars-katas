package com.codewars.converttocamelcase;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

class CamelCaseConverterTest {
    CamelCaseConverter camelCaseConverter = new CamelCaseConverter();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of("", ""),
                of(" ", " "),
                of("textToConvert", "text-to-convert"),
                of("textToConvert", "text_to_convert"),
                of("TextToConvert", "Text-To-Convert"),
                of("TextToConvert", "Text_to_convert")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void convertCamelCase(String expected, String text) {
        String result = camelCaseConverter.convertToCamelCase(text);

        assertEquals(expected, result);
    }

}
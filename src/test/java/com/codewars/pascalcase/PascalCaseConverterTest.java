package com.codewars.pascalcase;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PascalCaseConverterTest {
    PascalCaseConverter pascalCaseConverter = new PascalCaseConverter();

    @CsvSource({
            "'', ''",
            "'A', 'a'",
            "'A', 'A'",
            "'Aa', 'aa'",
            "'Aa', 'Aa'",
            "'Aa', 'aA'",
            "'Aa', 'AA'",
            "'AA', 'a a'",
            "'AaA', 'aa a'",
            "'AaA', 'aa  a'",
            "'AaA', ' aa a'",
            "'AaA', 'aa a '"
    })

    @ParameterizedTest
    void convertToPascalCase(String expected, String text) {
        String result = pascalCaseConverter.convertToPascalCase(text);

        assertEquals(expected, result);
    }

}
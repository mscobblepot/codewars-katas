package com.codewars.morezerosthanones;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

class BinaryConverterTest {
    BinaryConverter binaryConverter = new BinaryConverter();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of(new char[] {'a'}, "a"),
                of(new char[] {'a','b','d'}, "abcde"),
                of(new char[] {'h', 'b', 'p', 'a', 'd'}, "thequickbrownfoxjumpsoverthelazydog"),
                of(new char[] {'T','H','E','Q','I','C','B','R','F','X','J','P','L', 'A','D'}, "THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG"),
                of(new char[] {'a','b','d','h','p','A','B','C','D','E','F','H','I','J','L','P','Q','R','T','X','0'}, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890_")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void getCharactersWithMoreZeroes(char[] expected, String text) {
        char[] result = binaryConverter.getCharactersWithMoreZeros(text);

        assertArrayEquals(expected, result);
    }

}
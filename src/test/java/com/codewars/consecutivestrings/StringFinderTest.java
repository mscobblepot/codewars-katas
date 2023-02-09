package com.codewars.consecutivestrings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class StringFinderTest {

    StringFinder stringFinder = new StringFinder();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of("", new String[]{}, 0),
                of("", new String[]{}, 1),
                of("", new String[]{"it"}, 0),
                of("", new String[]{"it"}, 2),
                of("", new String[]{"it"}, -1),
                of("it", new String[]{"it"}, 1),
                of("ixoyx3452zzzzzzzzzzzz", new String[]{"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3),
                of("folingtrashy", new String[]{"tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"}, 2),
                of("abigailtheta", new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void findLongestString(String expected, String[] strings, int numberOfStrings) {
        String result = stringFinder.getLongestString(strings, numberOfStrings);

        assertEquals(expected, result);
    }

}
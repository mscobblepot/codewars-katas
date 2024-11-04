package com.codewars.displaylikes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.of;

class LikeDisplayTest {
    LikeDisplay likeDisplay = new LikeDisplay();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of("No one likes this", new String[]{}),
                of("Peter likes this", new String[]{"Peter"}),
                of("Jacob and Alex like this", new String[]{"Jacob", "Alex"}),
                of("Max, John and Mark like this", new String[]{"Max", "John", "Mark"}),
                of("Alex, Jacob and 2 others like this", new String[]{"Alex", "Jacob", "Mark", "Max"}),
                of("Alex, Jacob and 3 others like this", new String[]{"Alex", "Jacob", "Mark", "Max", "Peter"})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void displayLikes(String expected, String[] names) {
        String result = likeDisplay.displayLikes(names);

        assertEquals(expected, result);
    }
}
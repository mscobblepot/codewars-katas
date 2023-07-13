package com.codewars.characterrepetition;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class CharacterFinderTest {
    CharacterFinder characterFinder = new CharacterFinder();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of(new Object[]{"", 0}, ""),
                of(new Object[]{"a", 1}, "a"),
                of(new Object[]{"a", 2}, "aa"),
                of(new Object[]{"a", 1}, "ab"),
                of(new Object[]{"a", 2}, "aab"),
                of(new Object[]{"b", 2}, "abb"),
                of(new Object[]{"a", 2}, "aabb"),
                of(new Object[]{"b", 2}, "a abb"),
                of(new Object[]{"a", 4}, "aaaabb"),
                of(new Object[]{"a", 4}, "bbbaaabaaaa"),
                of(new Object[]{"u", 3}, "cbdeuuu900"),
                of(new Object[]{"b", 5}, "abbbbb")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void findLongestRepetition(Object[] expected, String text) {
        Object[] result = characterFinder.getLongestConsecutiveRepeatingCharacter(text);

        assertArrayEquals(expected, result);
    }
}
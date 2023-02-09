package com.codewars.consecutivestrings;

import java.util.Arrays;
import java.util.stream.IntStream;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.joining;

public class StringFinder {
    public String getLongestString(String[] strings, int numberOfStrings) {
        return (strings.length < numberOfStrings || numberOfStrings <= 0) ? "" : findLongestConsecutiveString(strings, numberOfStrings);
    }

    public String findLongestConsecutiveString(String[] strings, int numberOfStrings) {
        return IntStream.rangeClosed(0, strings.length - numberOfStrings)
                .mapToObj(i -> Arrays.stream(strings, i, i + numberOfStrings)
                        .collect(joining()))
                .max(comparingInt(String::length))
                .orElse("");
    }
}

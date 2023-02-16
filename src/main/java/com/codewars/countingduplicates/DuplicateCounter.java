package com.codewars.countingduplicates;

import java.util.Arrays;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class DuplicateCounter {
    public int countDuplicates(String text) {
        return (int) Arrays.stream(text.toLowerCase().split(""))
                .collect(groupingBy(identity(), counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .count();
    }
}

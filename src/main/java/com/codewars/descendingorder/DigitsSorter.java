package com.codewars.descendingorder;

import java.util.Arrays;

import static java.util.Collections.reverseOrder;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.joining;

public class DigitsSorter {
    public int sortDescending(int number) {
        return Arrays.stream(String.valueOf(number).split(""))
                .sorted(reverseOrder())
                .collect(collectingAndThen(joining(), Integer::parseInt));
    }
}

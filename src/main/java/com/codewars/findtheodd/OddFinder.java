package com.codewars.findtheodd;

import java.util.Arrays;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class OddFinder {

    public int findOdd(int[] numbers) {
        return Arrays.stream(numbers)
                .boxed()
                .collect(groupingBy(identity(), counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() % 2 == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(0);
    }
}

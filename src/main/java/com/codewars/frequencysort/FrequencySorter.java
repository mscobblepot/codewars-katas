package com.codewars.frequencysort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.Comparator.naturalOrder;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FrequencySorter {
    public int[] sortByFrequency(int[] numbers) {
        Map<Integer, Long> frequencies = getFrequencies(numbers);

        return Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.<Integer, Long>comparing(frequencies::get).reversed()
                        .thenComparing(naturalOrder()))
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private Map<Integer, Long> getFrequencies(int[] numbers) {
        return IntStream.of(numbers)
                .boxed()
                .collect(groupingBy(identity(), counting()));
    }
}
package com.codewars.multiples;

import java.util.stream.IntStream;

public class MultipleFinder {
    public int sumMultiplies(int number) {
        return IntStream.range(0, number)
                .filter(e -> e % 3 == 0 || e % 5 == 0)
                .sum();
    }
}

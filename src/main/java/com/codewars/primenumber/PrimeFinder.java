package com.codewars.primenumber;

import java.util.stream.IntStream;

public class PrimeFinder {
    public boolean isPrime(int number) {
        return number > 1 && IntStream.rangeClosed(2, number / 2)
                .noneMatch(i -> number % i == 0);
    }
}

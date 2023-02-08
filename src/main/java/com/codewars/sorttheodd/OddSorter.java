package com.codewars.sorttheodd;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toCollection;

public class OddSorter {

    public int[] sortOdds(int[] numbers) {
        Queue<Integer> sortedOddNumbers = collectSortedOdd(numbers);
        return IntStream.of(numbers)
                .map(number -> isOdd(number) ? sortedOddNumbers.poll() : number)
                .toArray();
    }

    public Queue<Integer> collectSortedOdd(int[] numbers) {
        return IntStream.of(numbers)
                .filter(this::isOdd)
                .sorted()
                .boxed()
                .collect(toCollection(LinkedList::new));
    }

    private boolean isOdd(int numbers) {
        return numbers % 2 != 0;
    }
}

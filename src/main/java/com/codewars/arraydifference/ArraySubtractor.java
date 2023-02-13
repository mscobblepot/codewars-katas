package com.codewars.arraydifference;

import java.util.Arrays;
import java.util.List;

public class ArraySubtractor {
    public int[] subtractArray(int[] first, int[] second) {
        List<Integer> secondArrayAsList = Arrays.stream(second)
                .boxed()
                .toList();
        return Arrays.stream(first)
                .filter(i -> !secondArrayAsList.contains(i))
                .toArray();
    }
}

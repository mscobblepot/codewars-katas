package com.codewars.morezerosthanones;

import java.util.stream.Collectors;

public class BinaryConverter {
    public char[] getCharactersWithMoreZeros(String text) {
        return text.chars()
                .filter(this::hasMoreZerosThanOnes)
                .distinct()
                .mapToObj(entry -> (char) entry)
                .map(String::valueOf)
                .collect(Collectors.joining())
                .toCharArray();
    }

    private boolean hasMoreZerosThanOnes(int number) {
        return getNumberOfZeros(number) > getNumberOfOnes(number);
    }

    private int getNumberOfZeros(int number) {
        return Integer.toBinaryString(number).length() - getNumberOfOnes(number);
    }

    private int getNumberOfOnes(int number) {
        return Integer.bitCount(number);
    }
}
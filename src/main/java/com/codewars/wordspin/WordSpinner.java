package com.codewars.wordspin;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

public class WordSpinner {
    private final int lengthToStartSpinning = 4;

    public String spin(String text) {
        return Arrays.stream(text.split(" "))
                .map(word -> word.length() > lengthToStartSpinning ? reverse(word) : word)
                .collect(joining(" "));
    }

    public String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
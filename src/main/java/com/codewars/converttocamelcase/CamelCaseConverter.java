package com.codewars.converttocamelcase;

import java.util.Arrays;

public class CamelCaseConverter {
    public String convertToCamelCase(String text) {
        String[] words = text.split("[-_]");
        return Arrays.stream(words)
                .skip(1)
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .reduce(words[0], String::concat);
    }
}

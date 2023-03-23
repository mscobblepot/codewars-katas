package com.codewars.pascalcase;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

public class PascalCaseConverter {
    public String convertToPascalCase(String text) {
        String[] words = text.trim().split("\\s+");
        return Arrays.stream(words)
                .map(word -> word.length() > 1 ? word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() : word.toUpperCase())
                .collect(joining());
    }
}

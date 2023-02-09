package com.codewars.countingduplicates;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.frequency;

public class DuplicateCounter {
    public int countDuplicates(String text) {
        List<String> characters = Arrays.asList(text.toLowerCase().split(""));
        return characters.stream()
                .filter(character -> frequency(characters, character) > 1)
                .collect(Collectors.toSet())
                .size();
    }
}

package com.codewars.countingduplicates;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCounter {
    public int countDuplicates(String text) {
      /*  List<String> characters = Arrays.asList(text.toLowerCase().split(""));
        return characters.stream()
                .filter(character -> frequency(characters, character) > 1)
                .collect(Collectors.toSet())
                .size();*/
        return Stream.of(text.toLowerCase().split(""))
                .collect(Collectors.groupingBy(e->e, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .toList().size();
    }
}

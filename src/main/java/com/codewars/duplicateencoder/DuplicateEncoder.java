package com.codewars.duplicateencoder;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Arrays.stream;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class DuplicateEncoder {
    public String encode(String text) {
        Set<String> duplicates = getDuplicates(text);
        return stream(text.split(""))
                .map(character -> duplicates.contains(character.toLowerCase()) ? ")" : "(")
                .collect(joining(""));
    }

    public Set<String> getDuplicates(String text) {
        return stream(text.toLowerCase().split(""))
                .collect(groupingBy(identity(), counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(toSet());
    }
}

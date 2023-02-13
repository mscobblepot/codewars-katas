package com.codewars.breakcamelcase;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

public class CamelCaseBreaker {
    public String breakCamelCase(String word) {
        return Arrays.stream(word.split(""))
                .map(w -> w.matches("[A-Z]") ? " " + w : w)
                .collect(joining(""));
    }

    /*
    public String breakCamelCase(String word) {
        return word.replaceAll("([A-Z])", " $1");
    }*/
}

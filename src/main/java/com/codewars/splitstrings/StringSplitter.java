package com.codewars.splitstrings;

public class StringSplitter {
    public String[] splitString(String text) {
        if (text.length() % 2 == 1) {
            text += "_";
        }
        return text.isEmpty() ? new String[]{} : text.split("(?<=\\G..)");
    }
}

package com.codewars.characterrepetition;

import java.util.regex.MatchResult;

import static java.util.Comparator.comparingInt;
import static java.util.regex.Pattern.compile;

public class CharacterFinder {
    public Object[] getLongestConsecutiveRepeatingCharacter(String text) {
        String consecutiveCharacters = findLongestConsecutiveRepeatingCharacter(text);
        String character = consecutiveCharacters.split("")[0];
        int length = consecutiveCharacters.length();
        return new Object[]{character, length};
    }

    private String findLongestConsecutiveRepeatingCharacter(String text) {
        return compile("(.)\\1*").matcher(text).results()
                .map(MatchResult::group)
                .max(comparingInt(String::length))
                .orElse("");
    }
}

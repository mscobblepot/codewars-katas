package com.codewars.displaylikes;

public class LikeDisplay {
    private static final String NOBODY = "No one likes this";
    private static final String ONE_PERSON = "%s likes this";
    private static final String TWO_PEOPLE = "%s and %s like this";
    private static final String THREE_PEOPLE = "%s, %s and %s like this";
    private static final String MULTIPLE_PEOPLE = "%s, %s and %d others like this";

    public String displayLikes(String... names) {
        int length = names.length;
        return switch (length) {
            case 0 -> NOBODY;
            case 1 -> String.format(ONE_PERSON, names[0]);
            case 2 -> String.format(TWO_PEOPLE, names[0], names[1]);
            case 3 -> String.format(THREE_PEOPLE, names[0], names[1], names[2]);
            default -> String.format(MULTIPLE_PEOPLE, names[0], names[1], length - 2);
        };
    }
}

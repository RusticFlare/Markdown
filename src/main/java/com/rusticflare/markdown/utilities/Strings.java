package com.rusticflare.markdown.utilities;

import java.util.Optional;

public final class Strings {

    private Strings() {
    }

    public static String removeTrailingWhitspace(String string) {
        while (hasWhitespaceLastCharacter(string)) {
            string = removeLastCharacter(string);
        }
        return string;
    }

    private static boolean hasWhitespaceLastCharacter(String string) {
        return getLastCharacter(string)
                .map(Character::isWhitespace)
                .orElse(false);
    }

    private static Optional<Character> getLastCharacter(String string) {
        if (string.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(string.charAt(string.length() - 1));
    }

    private static String removeLastCharacter(String string) {
        if (string.isEmpty()) {
            throw new IllegalArgumentException("String must not be empty");
        }
        return string.substring(0, string.length() - 1);
    }

}

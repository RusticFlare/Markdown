package com.rusticflare.markdown.utilities;

import java.util.Optional;

public final class Strings {

    private Strings() {
    }

    public static String trimTrailingWhitspace(String string) {
        while (lastCharacterIsWhitespace(string)) {
            string = removeLastCharacter(string);
        }
        return string;
    }

    private static String removeLastCharacter(String string) {
        return string.substring(0, string.length() - 1);
    }

    private static Boolean lastCharacterIsWhitespace(String string) {
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

}

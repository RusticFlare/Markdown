package com.rusticflare.markdown;

import static com.rusticflare.markdown.Language.NONE;
import static java.util.stream.Collectors.joining;

import java.util.stream.Collector;
import java.util.stream.Stream;

import com.rusticflare.markdown.utilities.Strings;

public class GitHubMarkdown {

    private static final String NEWLINE = "\n";
    private static final String TRIPLE_TICK = "```";
    private static final String END_CODE_BLOCK = NEWLINE + TRIPLE_TICK + NEWLINE;

    private static final String SPACE = " ";
    private static final String DOUBLE_SPACE = SPACE + SPACE;
    private static final String DOUBLE_NEWLINE = NEWLINE + NEWLINE;

    private static final String OPEN_BRACKET = "[";
    private static final String CLOSE_BRACKET = "]";
    private static final String OPEN_PARENTHESES = "(";
    private static final String CLOSE_PARENTHESES = ")";

    private static final String BOLD_TAG = "**";
    private static final String ITALICS_TAG = "_";
    private static final String CODE_TAG = "`";
    private static final String HEADER_ONE_TAG = "#" + SPACE;
    private static final String HEADER_TWO_TAG = "##" + SPACE;
    private static final String HEADER_THREE_TAG = "###" + SPACE;
    private static final String HEADER_FOUR_TAG = "####" + SPACE;
    private static final String HEADER_FIVE_TAG = "#####" + SPACE;
    private static final String BULLET = NEWLINE + "-" + SPACE;
    private static final String HORIZONTAL_RULE = "---";

    public static String bold(String string) {
        return BOLD_TAG + string + BOLD_TAG;
    }

    public static String italic(String string) {
        return ITALICS_TAG + string + ITALICS_TAG;
    }

    public static String code(String string) {
        return CODE_TAG + string + CODE_TAG;
    }

    public static String link(String text, String url) {
        return OPEN_BRACKET + text + CLOSE_BRACKET
                + OPEN_PARENTHESES + url + CLOSE_PARENTHESES;
    }

    public static String headerOne(String string) {
        return HEADER_ONE_TAG + string + NEWLINE;
    }

    public static String headerTwo(String string) {
        return HEADER_TWO_TAG + string + NEWLINE;
    }

    public static String headerThree(String string) {
        return HEADER_THREE_TAG + string + NEWLINE;
    }

    public static String headerFour(String string) {
        return HEADER_FOUR_TAG + string + NEWLINE;
    }

    public static String headerFive(String string) {
        return HEADER_FIVE_TAG + string + NEWLINE;
    }

    public static String horizontalRule() {
        return HORIZONTAL_RULE;
    }

    public static String bulletList(String... strings) {
        return Stream.of(strings)
                .map(Strings::removeTrailingWhitspace)
                .map(GitHubMarkdown::indent)
                .collect(toBulletList());
    }

    public static String codeBlock(String string) {
        return codeBlock(string, NONE);
    }

    public static String codeBlock(String string, Language language) {
        return TRIPLE_TICK + language.tag + NEWLINE + string + END_CODE_BLOCK;
    }

    private static String indent(String string) {
        return string.replace(NEWLINE, NEWLINE + DOUBLE_SPACE);
    }

    private static Collector<CharSequence, ?, String> toBulletList() {
        return joining(BULLET, BULLET, DOUBLE_NEWLINE);
    }

}

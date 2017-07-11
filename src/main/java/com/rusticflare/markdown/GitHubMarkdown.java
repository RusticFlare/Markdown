package com.rusticflare.markdown;

public class GitHubMarkdown {

    private static final String SPACE = " ";
    private static final String NEWLINE = "\n";

    private static final String BOLD_TAG = "**";
    private static final String ITALICS_TAG = "_";
    private static final String CODE_TAG = "`";
    private static final String HEADER_ONE_TAG = "#" + SPACE;
    private static final String HEADER_TWO_TAG = "##" + SPACE;
    private static final String HEADER_THREE_TAG = "###" + SPACE;
    private static final String HEADER_FOUR_TAG = "####" + SPACE;
    private static final String HEADER_FIVE_TAG = "#####" + SPACE;

    public static String bold(String string) {
        return BOLD_TAG + string + BOLD_TAG;
    }

    public static String italic(String string) {
        return ITALICS_TAG + string + ITALICS_TAG;
    }

    public static String code(String string) {
        return CODE_TAG + string + CODE_TAG;
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


}

package com.rusticflare.markdown;

public enum Language {
    NONE(""),
    JAVA("java");

    public final String tag;

    Language(String tag) {
        this.tag = tag;
    }

}

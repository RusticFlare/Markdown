package com.rusticflare.markdown;

public class MarkdownBuilder {

    private final StringBuilder markdownBuilder = new StringBuilder();

    public MarkdownBuilder() {};

    public String getAsString() {
        return markdownBuilder.toString();
    }

    /**
     * Appends the given markdown formated text to the end
     * of the
     *
     * @param markdown
     *      The pre-formated markdown to be
     *
     * @return itself
     */
    public MarkdownBuilder add(String markdown) {
        markdownBuilder.append(markdown);
        return this;
    }

}

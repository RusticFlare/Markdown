package com.rusticflare.markdown;

import static java.util.Objects.requireNonNull;

public class MarkdownBuilder {

    private final StringBuilder markdownBuilder = new StringBuilder();

    public MarkdownBuilder() {};

    @Override
    public String toString() {
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
    public MarkdownBuilder append(String markdown) {
        requireNonNull(markdown);

        markdownBuilder.append(markdown);
        return this;
    }

}

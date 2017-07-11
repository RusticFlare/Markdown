package com.rusticflare.markdown;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class MarkdownBuilderTest {

    @Test
    public void testMarkdownBuilderClassIsPublic() {
        assertThat(MarkdownBuilder.class)
                .isPublic();
    }

    @Test
    public void testMarkdownBuilderHasNoArgumentConstuctor() {
        assertThat(new MarkdownBuilder())
                .isNotNull();
    }

    @Test
    public void testGetAsStringReturnsEmptyStringForNewMarkdownBuilder() {
        assertThat((new MarkdownBuilder()).toString())
                .isEmpty();
    }

    @Test
    public void testAppend() {
        MarkdownBuilder markdownBuilder = new MarkdownBuilder();
        markdownBuilder.append("text");
        assertThat(markdownBuilder.toString()).isEqualTo("text");
    }

    @Test
    public void testAppendChain() {
        MarkdownBuilder markdownBuilder = new MarkdownBuilder();
        markdownBuilder.append("te").append("xt");
        assertThat(markdownBuilder.toString()).isEqualTo("text");
    }

}

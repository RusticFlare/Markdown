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
        assertThat((new MarkdownBuilder()).getAsString())
                .isEmpty();
    }

}

package com.rusticflare.markdown.utilities;

import static com.rusticflare.markdown.utilities.Strings.removeTrailingWhitspace;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import org.junit.Test;

public class StringsTest {

    @Test
    public void testRemoveTrailingWhitspace() {
        assertSoftly(softly -> {
            softly.assertThat(removeTrailingWhitspace("")).isEmpty();
            softly.assertThat(removeTrailingWhitspace(" ")).isEmpty();
            softly.assertThat(removeTrailingWhitspace("text")).isEqualTo("text");
            softly.assertThat(removeTrailingWhitspace("\ntext")).isEqualTo("\ntext");
            softly.assertThat(removeTrailingWhitspace("text\n")).isEqualTo("text");
            softly.assertThat(removeTrailingWhitspace("text\n ")).isEqualTo("text");
        });
    }

}

package com.rusticflare.markdown.utilities;

import static com.rusticflare.markdown.utilities.Strings.trimTrailingWhitspace;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import org.junit.Test;

public class StringsTest {

    @Test
    public void testTrimEnd() {
        assertSoftly(softly -> {
            softly.assertThat(trimTrailingWhitspace("")).isEmpty();
            softly.assertThat(trimTrailingWhitspace(" ")).isEmpty();
            softly.assertThat(trimTrailingWhitspace("text")).isEqualTo("text");
            softly.assertThat(trimTrailingWhitspace("\ntext")).isEqualTo("\ntext");
            softly.assertThat(trimTrailingWhitspace("\ntext\n")).isEqualTo("\ntext");
            softly.assertThat(trimTrailingWhitspace("\ntext\n ")).isEqualTo("\ntext");
        });
    }

}

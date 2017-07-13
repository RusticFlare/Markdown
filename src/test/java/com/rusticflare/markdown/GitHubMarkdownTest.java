package com.rusticflare.markdown;

import static com.rusticflare.markdown.GitHubMarkdown.bold;
import static com.rusticflare.markdown.GitHubMarkdown.bulletList;
import static com.rusticflare.markdown.GitHubMarkdown.code;
import static com.rusticflare.markdown.GitHubMarkdown.headerFive;
import static com.rusticflare.markdown.GitHubMarkdown.headerFour;
import static com.rusticflare.markdown.GitHubMarkdown.headerOne;
import static com.rusticflare.markdown.GitHubMarkdown.headerThree;
import static com.rusticflare.markdown.GitHubMarkdown.headerTwo;
import static com.rusticflare.markdown.GitHubMarkdown.italic;
import static com.rusticflare.markdown.GitHubMarkdown.link;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class GitHubMarkdownTest {

    @Test
    public void testBold() {
        assertThat(bold("text")).isEqualTo("**text**");
    }

    @Test
    public void testItalics() {
        assertThat(italic("text")).isEqualTo("_text_");
    }

    @Test
    public void testCode() {
        assertThat(code("text")).isEqualTo("`text`");
    }

    @Test
    public void testLink() {
        assertThat(link("text", "http://example.com/"))
                .isEqualTo("[text](http://example.com/)");
    }

    @Test
    public void testHeaderOne() {
        assertThat(headerOne("text")).isEqualTo("# text\n");
    }

    @Test
    public void testHeaderTwo() {
        assertThat(headerTwo("text")).isEqualTo("## text\n");
    }

    @Test
    public void testHeaderThree() {
        assertThat(headerThree("text")).isEqualTo("### text\n");
    }

    @Test
    public void testHeaderFour() {
        assertThat(headerFour("text")).isEqualTo("#### text\n");
    }

    @Test
    public void testHeaderFive() {
        assertThat(headerFive("text")).isEqualTo("##### text\n");
    }

    @Test
    public void testBulletListNoEntries() {
            assertThat(bulletList()).isEqualTo("\n- \n");
    }

    @Test
    public void testBulletListOneEntry() {
            assertThat(bulletList("text")).isEqualTo("\n- text\n");
    }

    @Test
    public void testBulletListTwoEntries() {
            assertThat(bulletList("text", "text")).isEqualTo("\n- text\n- text\n");
    }

}

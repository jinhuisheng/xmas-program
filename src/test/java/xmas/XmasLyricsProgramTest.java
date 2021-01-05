package xmas;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class XmasLyricsProgramTest {
    @Test
    void should_generate_one_day_lyric() {
        assertThat(XmasLyricsProgram.generate(Arrays.asList("partridge")))
                .isEqualTo("On the first day of Christmas\n" +
                        "My true love gave to me:\n" +
                        "A partridge in a pear tree.\n");
    }

    @Test
    void should_generate_two_day_lyrics() {
        assertThat(XmasLyricsProgram.generate(Arrays.asList("partridge", "turtle doves")))
                .isEqualTo("On the first day of Christmas\n" +
                        "My true love gave to me:\n" +
                        "A partridge in a pear tree.\n" +
                        "\n" +
                        "On the second day of Christmas\n" +
                        "My true love gave to me:\n" +
                        "Two turtle doves and\n" +
                        "A partridge in a pear tree.\n");
    }

    @Test
    void should_generate_three_day_lyrics() {
        assertThat(XmasLyricsProgram.generate(Arrays.asList("partridge", "turtle doves", "french hens")))
                .isEqualTo("On the first day of Christmas\n" +
                        "My true love gave to me:\n" +
                        "A partridge in a pear tree.\n" +
                        "\n" +
                        "On the second day of Christmas\n" +
                        "My true love gave to me:\n" +
                        "Two turtle doves and\n" +
                        "A partridge in a pear tree.\n" +
                        "\n" +
                        "On the third day of Christmas\n" +
                        "My true love gave to me:\n" +
                        "Three french hens\n" +
                        "Two turtle doves and\n" +
                        "A partridge in a pear tree.\n");
    }

    @Test
    void should_generate_four_day_lyrics() {
        assertThat(XmasLyricsProgram.generate(Arrays.asList("partridge", "turtle doves", "french hens", "calling birds")))
                .isEqualTo("On the first day of Christmas\n" +
                        "My true love gave to me:\n" +
                        "A partridge in a pear tree.\n" +
                        "\n" +
                        "On the second day of Christmas\n" +
                        "My true love gave to me:\n" +
                        "Two turtle doves and\n" +
                        "A partridge in a pear tree.\n" +
                        "\n" +
                        "On the third day of Christmas\n" +
                        "My true love gave to me:\n" +
                        "Three french hens\n" +
                        "Two turtle doves and\n" +
                        "A partridge in a pear tree.\n" +
                        "\n" +
                        "On the forth day of Christmas\n" +
                        "My true love gave to me:\n" +
                        "Four calling birds\n" +
                        "Three french hens\n" +
                        "Two turtle doves and\n" +
                        "A partridge in a pear tree.\n");
    }


}

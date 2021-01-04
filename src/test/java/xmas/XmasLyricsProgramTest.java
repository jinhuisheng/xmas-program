package xmas;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class XmasLyricsProgramTest {
    @Test
    void should_generate_lyrics_in_one_day() {
        String result = XmasLyricsProgram.generate(Arrays.asList("partridge"));
        assertThat(result).isEqualTo("On the first day of Christmas\n" +
                "My true love gave to me:\n" +
                "A partridge in a pear tree.\n");
    }

    @Test
    void should_generate_lyrics_in_two_days() {
        String result = XmasLyricsProgram.generate(Arrays.asList("partridge", "turtle doves"));
        assertThat(result).isEqualTo("On the first day of Christmas\n" +
                "My true love gave to me:\n" +
                "A partridge in a pear tree.\n" +
                "\n" +
                "On the second day of Christmas\n" +
                "My true love gave to me:\n" +
                "Two turtle doves and\n" +
                "A partridge in a pear tree.\n");
    }


    @Test
    void should_generate_lyrics_in_three_days() {
        String result = XmasLyricsProgram.generate(Arrays.asList("partridge", "turtle doves", "french hens"));
        assertThat(result).isEqualTo("On the first day of Christmas\n" +
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
    void should_generate_lyrics_in_four_days() {
        String result = XmasLyricsProgram.generate(Arrays.asList("partridge", "turtle doves", "french hens", "calling birds"));
        assertThat(result).isEqualTo("On the first day of Christmas\n" +
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

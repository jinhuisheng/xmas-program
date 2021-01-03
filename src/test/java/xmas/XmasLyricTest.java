package xmas;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class XmasLyricTest {
    @Test
    void should_generate_one_day_lyric() {
        XmasLyric partridge = new XmasLyric("partridge");
        String lyrics = partridge.generate();
        assertThat(lyrics).isEqualTo("On the first day of Christmas\n" +
                "My true love gave to me:\n" +
                "A partridge in a pear tree.");
    }

    @Test
    void should_generate_two_day_lyric() {
        XmasLyric partridge = new XmasLyric("partridge", "turtle doves");
        String lyrics = partridge.generate();
        assertThat(lyrics).isEqualTo("On the first day of Christmas\n" +
                "My true love gave to me:\n" +
                "A partridge in a pear tree.\n" +
                "\n" +
                "On the second day of Christmas\n" +
                "My true love gave to me:\n" +
                "Two turtle doves and\n" +
                "A partridge in a pear tree.");
    }

    @Test
    void should_generate_three_day_lyric() {
        XmasLyric partridge = new XmasLyric("partridge", "turtle doves", "french hens");
        String lyrics = partridge.generate();
        assertThat(lyrics).isEqualTo("On the first day of Christmas\n" +
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
                "A partridge in a pear tree.");
    }

}

package xmas;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class XmasLyricDayGeneratorTest {
    @Test
    void generate_one_words() {
        XmasLyricDayGenerator partridge = new XmasLyricDayGenerator(Arrays.asList("partridge"));
        String result = partridge.generateLyrics();
        String expected = "On the first day of Christmas\n" +
                "My true love gave to me:\n" +
                "A partridge in a pear tree.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void generate_two_words() {
        XmasLyricDayGenerator partridge = new XmasLyricDayGenerator(Arrays.asList("partridge", "turtle doves"));
        String result = partridge.generateLyrics();
        String expected = "On the second day of Christmas\n" +
                "My true love gave to me:\n" +
                "Two turtle doves and\n" +
                "A partridge in a pear tree.";
        assertThat(result).isEqualTo(expected);
    }


    @Test
    void generate_three_words() {
        XmasLyricDayGenerator partridge = new XmasLyricDayGenerator(Arrays.asList("partridge", "turtle doves", "french hens"));
        String result = partridge.generateLyrics();
        String expected = "On the third day of Christmas\n" +
                "My true love gave to me:\n" +
                "Three french hens\n" +
                "Two turtle doves and\n" +
                "A partridge in a pear tree.";
        assertThat(result).isEqualTo(expected);
    }


}

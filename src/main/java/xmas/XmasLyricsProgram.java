package xmas;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static xmas.Constants.*;

public class XmasLyricsProgram {

    private static final String LAST_LINE = " in a pear tree.\n";
    private List<String> dayProducts;

    private XmasLyricsProgram(List<String> dayProducts) {
        this.dayProducts = dayProducts;
    }

    public static String generate(List<String> dayProducts) {
        XmasLyricsProgram xmasLyricsProgram = new XmasLyricsProgram(dayProducts);
        return xmasLyricsProgram.generate();
    }

    private String generate() {
        return IntStream.range(0, dayProducts.size()).boxed()
                .map(this::dayLyric)
                .collect(Collectors.joining("\n"));
    }

    private String dayLyric(int index) {
        return firstLine(index) + lyricContent(index) + LAST_LINE;
    }

    private String lyricContent(int index) {
        if (index == 0) {
            return firstLyricContent();
        }
        return biggerThanZeroContent(index) + " and\n" + firstLyricContent();
    }

    private String biggerThanZeroContent(int index) {
        return IntStream.range(1, index + 1).boxed()
                .sorted((x, y) -> y - x)
                .map(productIndex -> PRODUCT_COUNT_NUMBERS[productIndex] + " " + dayProducts.get(productIndex))
                .collect(Collectors.joining("\n"));
    }

    private String firstLyricContent() {
        return PRODUCT_COUNT_NUMBERS[0] + " " + dayProducts.get(0);
    }

    private String firstLine(int index) {
        return "On the " +
                DAY_INDEX_NUMBERS[index] +
                " day of Christmas\n" +
                "My true love gave to me:\n";
    }

}

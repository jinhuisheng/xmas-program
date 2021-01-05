package xmas;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static xmas.Constants.DAY_INDEX_NUMBER_STRINGS;
import static xmas.Constants.PRODUCT_COUNT_STRINGS;

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
        return firstLine(index) + lyricProductContent(index) + LAST_LINE;
    }

    private String firstLine(int index) {
        return "On the " +
                DAY_INDEX_NUMBER_STRINGS[index] +
                " day of Christmas\n" +
                "My true love gave to me:\n";
    }

    private String lyricProductContent(int index) {
        return index == 0
                ? firstDayLyricContent()
                : biggerThanZeroDayLyricContent(index) + " and\n" + firstDayLyricContent();
    }

    private String firstDayLyricContent() {
        return lyricContentLine(0);
    }

    private String biggerThanZeroDayLyricContent(int index) {
        return IntStream.range(1, index + 1).boxed().sorted((x, y) -> y - x)
                .map(this::lyricContentLine)
                .collect(Collectors.joining("\n"));
    }

    private String lyricContentLine(Integer i) {
        return PRODUCT_COUNT_STRINGS[i] + " " + dayProducts.get(i);
    }

}

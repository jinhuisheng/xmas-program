package xmas;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class XmasLyricsProgram {
    private List<String> dayProducts;

    private XmasLyricsProgram(List<String> dayProducts) {
        this.dayProducts = dayProducts;
    }

    public static String generate(List<String> dayWords) {
        XmasLyricsProgram xmasLyricsProgram = new XmasLyricsProgram(dayWords);
        return xmasLyricsProgram.generate();
    }

    private String generate() {
        return IntStream.range(0, dayProducts.size()).boxed()
                .map(this::dayLyric)
                .collect(Collectors.joining("\n"));
    }

    private String dayLyric(int index) {
        return firstLine(index) + lyricContent(index) + Constants.LAST_STRING;
    }

    private String firstLine(int index) {
        return "On the " + Constants.INDEX_TO_NUMBERS[index] + " day of Christmas\n" + "My true love gave to me:\n";
    }

    private String lyricContent(int index) {
        return IntStream.range(0, index + 1).boxed()
                .sorted((x, y) -> y - x)
                .map(this::lyricContentLineLyric)
                .collect(Collectors.joining(""));
    }

    private String lyricContentLineLyric(int index) {
        return Constants.DAY_PRODUCT_COUNTS[index] + " " + dayProducts.get(index) + getContentLineLastString(index);
    }

    private String getContentLineLastString(int index) {
        if (index == 0) {
            return "";
        }
        if (index == 1) {
            return " and\n";
        }
        return "\n";
    }

}

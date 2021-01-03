package xmas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class XmasLyric {
    private String[] words;

    public XmasLyric(String... words) {

        this.words = words;
    }

    public String generate() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            List<String> temp = Arrays.stream(this.words).limit(i + 1).collect(Collectors.toList());
            result.append(new XmasLyricDayGenerator(temp).generateLyrics());
            if (i < this.words.length - 1) {
                result.append("\n\n");
            }
        }
        return result.toString();
    }
}

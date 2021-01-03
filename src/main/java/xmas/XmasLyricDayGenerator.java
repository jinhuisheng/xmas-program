package xmas;

import java.util.HashMap;
import java.util.List;

public class XmasLyricDayGenerator {
    private List<String> words;
    private static final HashMap<Integer, String> NUMBER_TO_ENGLISH_INDEX_MAP = new HashMap<>();
    private static final HashMap<Integer, String> NUMBER_TO_ENGLISH_MAP = new HashMap<>();

    static {
        NUMBER_TO_ENGLISH_INDEX_MAP.put(1, "first");
        NUMBER_TO_ENGLISH_INDEX_MAP.put(2, "second");
        NUMBER_TO_ENGLISH_INDEX_MAP.put(3, "third");
        NUMBER_TO_ENGLISH_INDEX_MAP.put(4, "forth");
        NUMBER_TO_ENGLISH_INDEX_MAP.put(5, "fifth");
        NUMBER_TO_ENGLISH_INDEX_MAP.put(6, "sixth");
        NUMBER_TO_ENGLISH_INDEX_MAP.put(7, "seventh");
        NUMBER_TO_ENGLISH_INDEX_MAP.put(8, "eight");
        NUMBER_TO_ENGLISH_INDEX_MAP.put(9, "ninth");
        NUMBER_TO_ENGLISH_INDEX_MAP.put(10, "tenth");
        NUMBER_TO_ENGLISH_INDEX_MAP.put(11, "eleventh");
        NUMBER_TO_ENGLISH_INDEX_MAP.put(12, "Twelfth");

        NUMBER_TO_ENGLISH_MAP.put(0, "A");
        NUMBER_TO_ENGLISH_MAP.put(1, "Two");
        NUMBER_TO_ENGLISH_MAP.put(2, "Three");
        NUMBER_TO_ENGLISH_MAP.put(3, "Four");
        NUMBER_TO_ENGLISH_MAP.put(4, "Five");
        NUMBER_TO_ENGLISH_MAP.put(5, "Six");
        NUMBER_TO_ENGLISH_MAP.put(6, "Seven");
        NUMBER_TO_ENGLISH_MAP.put(7, "Eight");
        NUMBER_TO_ENGLISH_MAP.put(8, "Nine");
        NUMBER_TO_ENGLISH_MAP.put(9, "Ten");
        NUMBER_TO_ENGLISH_MAP.put(10, "Eleven");
        NUMBER_TO_ENGLISH_MAP.put(11, "Twelve");
    }


    public XmasLyricDayGenerator(List<String> words) {
        this.words = words;
    }

    public String generateLyrics() {
        StringBuilder lyrics = generateTwoLineInFront();
        for (int index = words.size() - 1; index >= 0; index--) {
            lyrics.append(getLine(index));
        }
        return lyrics.toString();
    }

    private StringBuilder generateTwoLineInFront() {
        String firstLine = "On the " + NUMBER_TO_ENGLISH_INDEX_MAP.get(words.size()) + " day of Christmas\n";
        String secondLine = "My true love gave to me:\n";
        StringBuilder lyrics = new StringBuilder();
        lyrics.append(firstLine);
        lyrics.append(secondLine);
        return lyrics;
    }

    private String getLine(int index) {
        if (index == 0) {
            return NUMBER_TO_ENGLISH_MAP.get(index) + " " + words.get(index) + " in a pear tree.";
        } else if (index == 1) {
            return NUMBER_TO_ENGLISH_MAP.get(index) + " " + words.get(index) + " and\n";
        } else {
            return NUMBER_TO_ENGLISH_MAP.get(index) + " " + words.get(index) + "\n";
        }
    }

}

package xmas;

import java.util.HashMap;

public class IndexToNumbers {
    private static final HashMap<Integer, String> INDEX_TO_NUMBERS = new HashMap<>();

    static {
        INDEX_TO_NUMBERS.put(0, "first");
        INDEX_TO_NUMBERS.put(1, "second");
        INDEX_TO_NUMBERS.put(2, "third");
        INDEX_TO_NUMBERS.put(3, "forth");
        INDEX_TO_NUMBERS.put(4, "fifth");
        INDEX_TO_NUMBERS.put(5, "sixth");
        INDEX_TO_NUMBERS.put(6, "seventh");
        INDEX_TO_NUMBERS.put(7, "eight");
        INDEX_TO_NUMBERS.put(8, "ninth");
        INDEX_TO_NUMBERS.put(9, "tenth");
        INDEX_TO_NUMBERS.put(10, "eleventh");
        INDEX_TO_NUMBERS.put(11, "Twelfth");

    }

    public static String convert(int index) {
        return INDEX_TO_NUMBERS.get(index);
    }

}

package xmas;

import java.util.HashMap;

public class DayProductCounts {
    private static final HashMap<Integer, String> DAY_PRODUCT_COUNTS = new HashMap<>();

    static {
        DAY_PRODUCT_COUNTS.put(0, "A");
        DAY_PRODUCT_COUNTS.put(1, "Two");
        DAY_PRODUCT_COUNTS.put(2, "Three");
        DAY_PRODUCT_COUNTS.put(3, "Four");
        DAY_PRODUCT_COUNTS.put(4, "Five");
        DAY_PRODUCT_COUNTS.put(5, "Six");
        DAY_PRODUCT_COUNTS.put(6, "Seven");
        DAY_PRODUCT_COUNTS.put(7, "Eight");
        DAY_PRODUCT_COUNTS.put(8, "Nine");
        DAY_PRODUCT_COUNTS.put(9, "Ten");
        DAY_PRODUCT_COUNTS.put(10, "Eleven");
        DAY_PRODUCT_COUNTS.put(11, "Twelve");
    }

    public static String convert(int index) {
        return DAY_PRODUCT_COUNTS.get(index);
    }

}

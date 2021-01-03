package xmas;

public class XmasLyricGame {
    public static void main(String[] args) {
        XmasLyric xmasLyric = new XmasLyric(
                "partridge",
                "turtle doves",
                "french hens",
                "calling birds",
                "golden rings",
                "geese a-laying",
                "swans a-swimming",
                "maids a-milking",
                "ladies dancing",
                "lords a-leaping",
                "pipers piping",
                "drummers drumming"
        );

        System.out.println(xmasLyric.generate());
    }
}

package xmas;

import java.util.Arrays;

public class XmasLyricsProgramConsole {
    public static void main(String[] args) {

        System.out.println(XmasLyricsProgram.generate(Arrays.asList(
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
        )));
    }
}

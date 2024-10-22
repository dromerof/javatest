package dromerof.util;

public class StringUtil {

    public static String repeat(String str, int times) {

        if (times < 0 ){
            throw new IllegalArgumentException("negative");
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < times; i++) {
            result.append(str);
        }

        return result.toString();
    }
}

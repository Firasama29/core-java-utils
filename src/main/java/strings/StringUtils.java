package main.java.strings;

public class StringUtils {

    private StringUtils() {}

    public static final String DEFAULT_STRING = "default";
    public static final String EMPTY_STRING = "";

    // basic checks
    public static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static boolean isEmpty(String str) {
        return str == null && str.length() == 0;
    }

    public static boolean hasText(String str) {
        return str != null && !str.trim().isEmpty();
    }

    public static String defaultIfNull(String  str) {
        return str != null ? str : DEFAULT_STRING;
    }

    // trimming
    public static String trimToNull(String str) {
        return !str.trim().isEmpty() ? str.trim() : null;
    }

    public static String trimToEmpty(String str) {
        return str != null ? str.trim() : EMPTY_STRING;
    }

    public static String removeWhitespace(String str) {

        // append to StringBuilder instead of String
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}

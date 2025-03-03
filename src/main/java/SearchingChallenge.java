import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchingChallenge {
    // __define-ocg__
    public static String SearchingChallenge(String str) {
        String longestPattern = null;
        int maxLength = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            char currentChar = str.charAt(i);
            char nextChar = str.charAt(i + 1);

            // Check if the next character repeats
            if (nextChar == currentChar) {
                StringBuilder pattern = new StringBuilder();
                pattern.append(currentChar).append(nextChar);

                int j = i + 2;

                // Extend the pattern as long as it repeats
                while (j < str.length() && str.charAt(j) == currentChar) {
                    pattern.append(currentChar);
                    j++;
                }

                // Check if the pattern repeats at least twice
                if (pattern.length() >= 4 && (j == str.length() || str.charAt(j) == nextChar)) {
                    if (pattern.length() > maxLength) {
                        longestPattern = pattern.toString();
                        maxLength = pattern.length();
                    }
                }
            }
        }

        return maxLength >= 4 ? "yes " + longestPattern : "no null";}

    public static void main(String[] args) {
        // Test cases
        System.out.println(SearchingChallenge("aabejiabkfabed")); // yes abe
        System.out.println(SearchingChallenge("123224")); // no null
        System.out.println(SearchingChallenge("aa2bbbaacbbb")); // yes bbb
    }
}


package CodingTest;
import java.util.*;
public class StringChallenge {
    public static String StringChallenge(String str) {
        // Use a HashSet to store distinct characters
        Set<Character> distinctChars = new HashSet<>();

        // Loop through the string and add each character to the set
        for (char c : str.toCharArray()) {
            distinctChars.add(c);
        }

        // Check if the size of the set is at least 10
        if (distinctChars.size() >= 10) {
            return "true";
        } else {
            return "false";
        }
    }

    public static void main(String[] args) {
        // Keep this function call here
//        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge("abc123kkmmmm?"));
//        System.out.print(StringChallenge("12334bbmma:-6"));
//        System.out.print(StringChallenge("eeeemmmmmmmmm1000"));
//        s.close();
    }
}


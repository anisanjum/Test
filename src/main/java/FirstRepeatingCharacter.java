import java.util.HashSet;

public class FirstRepeatingCharacter {
    public static Character findFirstRepeatingCharacter(String input) {
        HashSet<Character> seenCharacters = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (seenCharacters.contains(currentChar)) {
                return currentChar;
            }
            seenCharacters.add(currentChar);
        }

        return null; // Return null if no repeating character is found
    }

    public static void main(String[] args) {
//        String testString = "swiss";
        String testString = "anis";
        Character firstRepeatingChar = findFirstRepeatingCharacter(testString);

        if (firstRepeatingChar != null) {
            System.out.println("The first repeating character is: " + firstRepeatingChar);
        } else {
            System.out.println("No repeating character found.");
        }
    }
}


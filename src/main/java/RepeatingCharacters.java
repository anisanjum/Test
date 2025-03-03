import java.util.HashMap;
import java.util.Map;

public class RepeatingCharacters {

    public static char countMostFrequentCharacter(String input) {
        HashMap<Character, Integer> hm = new HashMap();
//        int maxCount = 0;
        int mostFrequentCharacterCount = Integer.MIN_VALUE;
        char mostFrequentCharacter = input.charAt(0);
        for(char c : input.toCharArray()){
        if(c >= 'a' || c <= 'z' || c >= 'A' || c <= 'Z') hm.put(c,hm.getOrDefault(c, 0) +1);
        }
        for(Map.Entry<Character, Integer> entry : hm.entrySet()){
            if (entry.getValue() > mostFrequentCharacterCount) {
                mostFrequentCharacterCount = entry.getValue();
                mostFrequentCharacter = entry.getKey();
            }
        }
        return mostFrequentCharacter;
    }

    public static void main(String[] args) {
        String str = "examplessss DDDDAAAADstring";
        System.out.println("The most frequent character is: " + countMostFrequentCharacter(str));
    }
}

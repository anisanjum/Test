import java.util.Arrays;
import java.util.HashMap;

public class AnagramTest {
//    public void verifyAnagram() {
//
//        String s = "Race";
//        String t = "Care";
//
//        char[] news = s.toLowerCase().toCharArray();
//        char[] newt = t.toLowerCase().toCharArray();
//
//        Arrays.sort(news);
//        Arrays.sort(newt);
//
//        boolean equals = Arrays.equals(news, newt);
//
//        if (equals)
//            System.out.println("Is Anagram");
//        else System.out.println("Not Anagram");
//
//    }

    //ALITER:
    public void verifyAnagram() {

        String s = "Race";
        String t = "Care";

        char[] news = s.toLowerCase().toCharArray();
        char[] newt = t.toLowerCase().toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < news.length; i++) {
            if (!map.containsKey(news[i])) {
                map.put(news[i], 1);
            } else {
                Integer j = map.get(news[i]);
                map.put(news[i], j + 1);
            }
        }
        int i;
        for (i = 0; i < newt.length; i++) {
            if (!map.containsKey(newt[i])) {
                System.out.println("not anagram");
                break;
            }
        }
        if (i == t.length())
            System.out.println("Is Anagram");
    }
}

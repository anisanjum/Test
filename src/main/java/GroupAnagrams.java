import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args) {
        List<String> strs = new ArrayList<>(Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat"));
        GroupAnagrams ga = new GroupAnagrams();
        System.out.println(ga.getAnagram(strs));
    }

    public List<List<String>> getAnagram(List<String> strs) {

        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if (!map.containsKey((sorted))) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}

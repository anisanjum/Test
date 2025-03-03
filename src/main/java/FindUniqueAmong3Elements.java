import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindUniqueAmong3Elements {
    public int unique(ArrayList<Integer> A) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            if (hm.containsKey(A.get(i))) {
                hm.put(A.get(i), hm.get(A.get(i)) + 1);
            } else {
                hm.put(A.get(i), 1);
            }
        }
        int ans = -1;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) ans = entry.getKey();
        }
        return ans;
    }

    public static void main(String[] args) {
        FindUniqueAmong3Elements find = new FindUniqueAmong3Elements();

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(4, 5, 5, 4, 7, 6, 6, 4, 5, 6));
        int unique = find.unique(A);
        System.out.println(unique);
    }
}

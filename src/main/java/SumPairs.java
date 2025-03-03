import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SumPairs {

    //    Given a list of integers, find all pairs that sum up to a given number
//    Eg. Input: [12, 11, -5, 1, 5, 18, 19, -1, 2], sum: 13,
//    Output: [12,1], [11,2], [18,-5]

    public static void main(String[] args) {
        List<int[]> result = new ArrayList<>();
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(12, 11, -5, 1, 5, 18, 19, -1, 2));
        HashMap<Integer, Integer> map = new HashMap<>();
        int targetSum = 13;
        for (int num : A) {
            int complement = targetSum - num;
            if (map.containsKey(complement)) {
                result.add(new int[]{complement, num});
            }
//            Store num as the key and complement as the value. This allows you to check if the complement exists in the map correctly.
            map.put(num, complement);
        }

        for (int[] pair : result) {
            System.out.println("[" + pair[0] + "," + pair[1] + "]");
        }
    }
}

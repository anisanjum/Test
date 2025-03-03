import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SucceedingSum {

    // Find Index of all Elements in an array Which Are Equal to the Sum of its Succeeding Elements.
    // Eg 1: input = {7, 4, 3, 26, 17, 8, 1};
    // output = 0,3
    // Explanation:
    // 7 is sum of its succeeding elements 4 & 3 ie 4+3=7. Hence the 1st output 0 which is index of 7.
    // 26 is sum of its succeeding elements 17,8 &1 ie 17+8+1=26. Hence the 2nd output 3 which is index of 26
    // Eg 2: input = {15, 7, 5, 2,1}
    // output = 0
    // Explanation: 15 is sum of its succeeding elements 7,5,2,1 ie 7+5+2+1=15. Hence the output 0 which is index of 15.

    public static void main(String[] args) {
        System.out.println("Welcome");

        List<Integer> arr = new ArrayList<>(Arrays.asList(7, 4, 3, 26, 17, 8, 1));
//        List<Integer> arr = new ArrayList<>(Arrays.asList(15, 7, 5, 2,1));
        List<Integer> res = new ArrayList<>();

        int n = arr.size();
        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i + 1; j < n; j++) {
                sum += arr.get(j);

                if (sum == arr.get(i)) res.add(i);
            }
        }
        System.out.println(res);
    }
}

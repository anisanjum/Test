import java.util.*;

//Input: list [6,9,9,6,6], limit = 3, divisor = 3
//Output: 9
//Explanation: Every element in the list is divisible by the divisor 3. As per our task constraints,
// we can only have a maximum of limit elements divisible by 3, within any sublist. The 9 unique sublists
// which satisfy these conditions are: [6], [6,9], [6.9.9], [9,9.6], [9,6], [9,6,6], [9,9], [9] and [6.6]
//Each sublist is unique and has at most 'limit' = 3 elements divisible by 3.
//Example 2:
//Input: list [15,10,15,20], limit = 4, divisor = 5
//Output: 10
//Explanation: Every element in the list is divisible by the divisor = 5. Any sublist will have at
// most 4 elements that are divisible by 5. Because of this, there are 10 sublists that fulfill the conditions.
//Constraints:
//1. The length of the list is between 1 and 200, inclusive.
//2. The elements of the list and the divisor are between 1 and 200, inclusive.
//3. The limit is less than or equal to the length of the list.

public class DivisibilityQuest {

    public int divisibility_quest(int[] list, int limit, int divisor) {

        Set<List<Integer>> validSubLists = new HashSet<>();
        int n = list.length;

        for (int start = 0; start < n; start++) {
            for (int end = start + 1; end <= n; end++) {
                List<Integer> subLists = new ArrayList<>();
                for (int i = start; i < end; i++) {
                    subLists.add(list[i]);
                }
                System.out.println("subLists: " + subLists);
                int countDivisible = 0;
                for (int num : subLists) {
                    if (num % divisor == 0) {
                        countDivisible++;
                    }
                }
                if (countDivisible <= limit) {
                    validSubLists.add(subLists);
                }
            }
        }
        return validSubLists.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example test case 1
        int[] list1 = {6, 9, 9, 6, 6};
        int limit1 = 3;
        int divisor1 = 3;
        DivisibilityQuest solution1 = new DivisibilityQuest();
        System.out.println(solution1.divisibility_quest(list1, limit1, divisor1)); // Output: 9

        // Example test case 2
        int[] list2 = {15, 10, 15, 20};
        int limit2 = 4;
        int divisor2 = 5;
        DivisibilityQuest solution2 = new DivisibilityQuest();
        System.out.println(solution2.divisibility_quest(list2, limit2, divisor2)); // Output: 10

        int[] list3 = {2, 3, 3, 2, 2};
        int limit3 = 2;
        int divisor3 = 2;
        DivisibilityQuest solution3 = new DivisibilityQuest();
        System.out.println(solution2.divisibility_quest(list3, limit3, divisor3)); // Output: 11
    }
}

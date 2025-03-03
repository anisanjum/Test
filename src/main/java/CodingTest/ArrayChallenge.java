package CodingTest;



import java.util.*;

class ArrayChallenge {

    public static String ArrayChallenge(int[] arr) {
//        int target = arr[0]; // The target sum (first element)
//        List<String> result = new ArrayList<>(); // To store the valid pairs
//        Set<Integer> seen = new HashSet<>(); // To store the numbers we've already seen
//
//        // Traverse the array starting from the second element
//        for (int i = 1; i < arr.length; i++) {
//            int complement = target - arr[i];
//
//            // If the complement exists in the set, we found a pair
//            if (seen.contains(complement)) {
//                result.add(complement + "," + arr[i]);
//            }
//
//            // Add the current number to the set for future checks
//            seen.add(arr[i]);
//        }
//
//        // If no pairs were found, return -1
//        if (result.isEmpty()) {
//            return "-1";
//        }
//
//        // Join the pairs with a space separator and return
//        return String.join(" ", result);
//        -----------------------------------------------------------------------------------
//        int target = arr[0]; // The target sum (first element)
//        List<String> result = new ArrayList<>(); // To store the valid pairs
//        Map<Integer, Integer> seen = new HashMap<>(); // To store the numbers we've already seen and their index
//
//        // Traverse the array starting from the second element
//        for (int i = 1; i < arr.length; i++) {
//            int complement = target - arr[i];
//
//            // If the complement exists in the map, we found a pair
//            if (seen.containsKey(complement)) {
//                result.add(complement + "," + arr[i]);
//            }
//
//            // Add the current number to the map for future checks
//            seen.put(arr[i], i);
//        }
////        System.out.println("result: " + result);
//        // If no pairs were found, return -1
//        if (result.isEmpty()) {
//            return "-1";
//        }
//
//        // Join the pairs with a space separator and return
//        return String.join(" ", result);
// -----------------------------------------------------------------------------------
        int target = arr[0]; // The target sum (first element)
        List<String> result = new ArrayList<>(); // To store the valid pairs
        Set<Integer> seen = new HashSet<>(); // To store the numbers we've already seen

        // Traverse the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            int complement = target - arr[i];

            // If the complement exists in the set, we found a pair
            if (seen.contains(complement)) {
                result.add(complement + "," + arr[i]);
            }

            // Add the current number to the set for future checks
            seen.add(arr[i]);
        }
        // If no pairs were found, return -1
        if (result.isEmpty()) {
            return "-1";
        }

        // Join the pairs with a space separator and return
        return String.join(" ", result);
    }

    public static void main(String[] args) {
        // Sample input: [7, 3, 5, 2, -4, 8, 11]
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the array elements separated by space:");
//        String input = s.nextLine();
//
//        // Converting the input into an integer array
//        String[] inputStr = input.split(" ");
//        int[] arr = new int[inputStr.length];
//        for (int i = 0; i < inputStr.length; i++) {
//            arr[i] = Integer.parseInt(inputStr[i]);
//        }

        // Call the ArrayChallenge method and print the result

//        int[] arr = new int[]{7, 3, 5, 2, -4, 8, 11};
        int[] arr = new int[]{17, 4, 5, 6, 10, 11, 4, -3, -5, 3, 15, 2, 7};

        System.out.println(ArrayChallenge(arr));
    }
}


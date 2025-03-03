public class ExpandedForm {
    public static String solution(int n) {
        // Convert the integer to a string for easier manipulation
        String numStr = Integer.toString(n);
        StringBuilder expandedForm = new StringBuilder();

        int length = numStr.length();

        // Iterate through each digit and its position
        for (int i = 0; i < length; i++) {
            // Calculate the place value of the current digit
            int digit = numStr.charAt(i) - '0'; // Convert char to int
            int placeValue = length - i - 1;

            if (digit != 0) {
                if (expandedForm.length() > 0) {
                    expandedForm.append("+");
                }
                // Append the digit with its place value (e.g., 9000 for digit 9 in 9876)
                expandedForm.append(digit * (int) Math.pow(10, placeValue));
            }
        }

        // Return the result as a string
        return expandedForm.toString();
    }

    public static void main(String[] args) {
        // Test the method with example inputs
        System.out.println(solution(35));    // Output: "30+5"
        System.out.println(solution(9876));  // Output: "9000+800+70+6"
    }
}

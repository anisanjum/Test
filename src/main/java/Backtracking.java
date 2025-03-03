public class Backtracking {
    // Print the permutations
    //if input is "AB" print all the possible combinations ie AB BA
    //if input is "ABC" print all the possible combinations ie ABC ACB BAC BCA CAB CBA
    public static void printPermutation(String str, String perm, int idx) {
        if (str.length() == 0) {
            System.out.print(perm + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, perm + currChar, idx + 1);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str, "", 0);
    }
}

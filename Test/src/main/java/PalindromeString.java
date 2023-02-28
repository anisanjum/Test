public class PalindromeString {

    public boolean isPalindrome(String str) {

        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int i = 0, j = str.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }
}

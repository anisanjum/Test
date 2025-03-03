public class Palindrome {

    public boolean solution(int x) {
        if (x < 0)
            return false;
        int rev = 0;
        int y = x;
        while (y > 0) {
            int a = y % 10;
            rev = rev * 10 + a;
            y = y / 10;
        }
        System.out.println("rev: " + rev);
        if (rev == x)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Palindrome palin = new Palindrome();
        boolean isPalin = palin.solution(1234);
//        boolean isPalin = palin.solution(1234321);
        System.out.println("Is Palindrome?: " + isPalin);
    }
}

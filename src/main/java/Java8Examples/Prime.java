package Java8Examples;

import java.util.ArrayList;

public class Prime {

    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            if (isPrime(i)) {
                result.add(i);
            }
        }
        System.out.println(result);
    }

    private static boolean isPrime(int x) {
        if (x <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        if (x == 2 || x == 3) {
            return true; // 2 and 3 are prime numbers
        }
        if (x % 2 == 0 || x % 3 == 0) {
            return false; // Exclude even numbers and multiples of 3
        }
        for (int i = 5; i * i <= x; i += 2) { // Check only odd numbers up to sqrt(x)
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    // ALITER
//     private static boolean isPrime(int num) {
//        if (num <= 1) return false; // 0 and 1 are not prime numbers
//        for (int i = 2; i <= num / 2; i++) { // Check divisibility up to num/2
//            if (num % i == 0) {
//                return false; // If divisible, not a prime number
//            }
//        }
//        return true; // Prime if no divisors found
//    }
}

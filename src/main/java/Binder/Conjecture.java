package Binder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conjecture {

    // finding prime numbers in a range using sieve of Eratosthenes
    public static List<Integer> generatePrimes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    private static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void verifyGoldbachConjecture(int start, int finish) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= finish; i++) {
            if(isPrime(i)) primes.add(i);
        }
        System.out.println("primes: " + primes);

        if (start < 4) {
            System.out.println("Start should be at least 4.");
            return;
        }

        for (int n = start; n <= finish; n += 2) {
            boolean found = false;
            for (int prime : primes) {
                if (prime > n / 2) {
                    break;
                }
                int complement = n - prime;
                if (primes.contains(complement)) {
                    System.out.printf("%d = %d + %d\n", n, prime, complement);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.printf("Goldbach's conjecture failed for %d\n", n);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting even integer (>= 4): ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending even integer: ");
        int finish = scanner.nextInt();

        verifyGoldbachConjecture(start, finish);
    }
}

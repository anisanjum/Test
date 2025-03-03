public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Change this value for more terms
        System.out.println("Fibonacci Series up to " + n + " terms:");
        printFibonacci(n);
    }

    public static void printFibonacci(int n) {
        int first = 0, second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}

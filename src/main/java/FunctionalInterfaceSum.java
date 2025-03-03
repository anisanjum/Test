

@FunctionalInterface
interface Sum {
    int add(int x, int y);
}

public class FunctionalInterfaceSum {
    public static void main(String[] args) {
        Sum sum = (x, y) -> x + y;

        // Example usage
        int result = sum.add(5, 3);
        System.out.println("Sum: " + result); // Output: Sum: 8
    }
}

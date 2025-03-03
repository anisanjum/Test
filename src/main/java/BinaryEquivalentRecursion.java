public class BinaryEquivalentRecursion {
    public static int binaryConv(int n) {
        if (n == 1) {

            return 1;
        }
        return binaryConv(n / 2) * 10 + n % 2;
    }

    public static void main(String[] args) {
        int N = 20;
        System.out.println(binaryConv(N));
    }
}


import java.util.HashMap;

public class FibonacciMemoization {

    // https://www.scaler.com/topics/fibonacci-series-in-java-using-recursion/

    public static void main(String[] args) {
        int length = 6;
        for (int i = 0; i <= length; i++)
            System.out.print(fibo(i) + " ");
    }

   private static HashMap<Integer, Long> memoizeFiboCache = new HashMap<>();

    // Fibonacci with Memoization
    private static long fibo(int n) {
        if (n == 0)
            return 0;

        if (n == 1 || n == 2)
            return 1;

        // getting value from the stored result(s)
        if(memoizeFiboCache.containsKey(n))
            return memoizeFiboCache.get(n);

        long result = fibo(n - 1) + fibo(n - 2);

        // storing the result in cache
        memoizeFiboCache.put(n, result);

        return result;
    }

}

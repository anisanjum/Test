import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.List;


// 1 2 3 4 5 6 7 3 8 1 2 3 4 5 7 8 9 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9 .....
// you are given a large array of integers and a 4 core machine
// We need to write a program that adds all elements of the array concurrently and produce sum.
public class ParallelSumWithExecutorService {
    public static void main(String[] args) throws Exception {
        int[] array = new int[100000000]; // Large array
        for (int i = 0; i < array.length; i++) {
            array[i] = i % 10 + 1; // Fill array with sample values
        }

        int numThreads = 4; // Number of cores
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        int chunkSize = array.length / numThreads;
        List<Future<Long>> futures = new ArrayList<>();

        // Submit tasks to the executor
        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? array.length : start + chunkSize;
            futures.add(executor.submit(() -> computeSum(array, start, end)));
        }

        // Collect results
        long totalSum = 0;
        for (Future<Long> future : futures) {
            totalSum += future.get();
        }

        executor.shutdown();

        System.out.println("Sum of the array: " + totalSum);
    }

    private static long computeSum(int[] array, int start, int end) {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }
}

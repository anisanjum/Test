import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

// // 1 2 3 4 5 6 7 3 8 1 2 3 4 5 7 8 9 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9 .....
//  you are given a large array of integers and a 4 core machine
// We need to write a program that adds all elements of the array concurrently and produce sum.

public class ParallelSum {
    public static void main(String[] args) {
        int[] array = new int[100000000]; // Large array
        for (int i = 0; i < array.length; i++) {
            array[i] = i % 10 + 1; // Fill array with sample values
        }

        ForkJoinPool forkJoinPool = new ForkJoinPool(4); // 4-core machine
        long sum = forkJoinPool.invoke(new SumTask(array, 0, array.length));

        System.out.println("Sum of the array: " + sum);
    }
}

class SumTask extends RecursiveTask<Long> {
    private static final int THRESHOLD = 10000; // Minimum size for parallel processing
    private int[] array;
    private int start;
    private int end;

    public SumTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        int length = end - start;
        if (length <= THRESHOLD) {
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            return sum;
        }

        int mid = start + length / 2;
        SumTask leftTask = new SumTask(array, start, mid);
        SumTask rightTask = new SumTask(array, mid, end);

        leftTask.fork(); // Process left task asynchronously
        long rightResult = rightTask.compute(); // Process right task
        long leftResult = leftTask.join(); // Wait for left task result

        return leftResult + rightResult;
    }
}

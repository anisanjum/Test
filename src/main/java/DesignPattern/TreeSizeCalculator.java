package DesignPattern;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    private ExecutorService executor;
    private Node root;

    public TreeSizeCalculator(Node root, ExecutorService executor) {
        this.root = root;
        this.executor = executor;
    }

    public Integer call() throws Exception {
        if(root == null) return 0;
        TreeSizeCalculator left = new TreeSizeCalculator(root.left, executor);
        TreeSizeCalculator right = new TreeSizeCalculator(root.right, executor);

        Future<Integer> leftTreeSize = executor.submit(left);
        Future<Integer> rightTreeSize = executor.submit(right);

        return leftTreeSize.get() + rightTreeSize.get() + 1;
    }
}

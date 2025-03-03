package Binder.ValidOrderedRangeTree;

public class RangeTree {

    // Helper method to check if the range tree is ordered
    private boolean validateOrderedRangeTree(RangeTreeNode node) {
        if (node == null) {
            return true;
        }

        boolean isLeftOrdered = true;
        boolean isRightOrdered = true;

        if (node.left != null) {
            // Check condition: low of Node equals low of the left child
            if (node.range.getLow() != node.left.range.getLow()) {
                return false;
            }
            // Recursively check the left subtree
            isLeftOrdered = isOrderedRangeTree(node.left);
        }

        if (node.right != null) {
            // Check conditions:
            // - high of Node equals high of the right child
            // - low of the Node is smaller or equals to low of the right child
            if (node.range.getHigh() != node.right.range.getHigh() || node.range.getLow() > node.right.range.getLow()) {
                return false;
            }
            // Recursively check the right subtree
            isRightOrdered = isOrderedRangeTree(node.right);
        }

        // If Node has both children, check the additional condition:
        // - high of the left child is smaller than low of the right child
        if (node.left != null && node.right != null) {
            if (node.left.range.getHigh() >= node.right.range.getLow()) {
                return false;
            }
        }

        return isLeftOrdered && isRightOrdered;
    }

    // Public method to check if the range tree is ordered
    public boolean isOrderedRangeTree(RangeTreeNode root) {
        return validateOrderedRangeTree(root);
    }

    public static void main(String[] args) {
        RangeTreeNode root = new RangeTreeNode(new Range(1, 10));
        root.left = new RangeTreeNode(new Range(1, 4));
        root.left.left = new RangeTreeNode(new Range(1, 3));
        root.right = new RangeTreeNode(new Range(5, 10));
        root.right.left = new RangeTreeNode(new Range(5, 6));
        root.right.right = new RangeTreeNode(new Range(8, 10));

        RangeTree rangeTree = new RangeTree();
        System.out.println(rangeTree.isOrderedRangeTree(root)); // Should return true for this example
    }
}


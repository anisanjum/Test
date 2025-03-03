package Binder.ValidOrderedRangeTree;

class Range {
    int low;
    int high;

    public Range(int low, int high) {
        if (high <= low) {
            throw new IllegalArgumentException("High must be greater than low.");
        }
        this.low = low;
        this.high = high;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}

class RangeTreeNode {
    Range range;
    RangeTreeNode left;
    RangeTreeNode right;

    public RangeTreeNode(Range range) {
        this.range = range;
        this.left = null;
        this.right = null;
    }
}
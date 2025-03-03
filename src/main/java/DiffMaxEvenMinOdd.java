public class DiffMaxEvenMinOdd {

//    Example 1:
//    int[] A = {0, 2, 9};
//    maximum of even = 2
//    minimum of odd = 9
//    difference: 2-9 = -7

//    Example 2:
//    int[] A = {5, 17, 100, 1};
//    maximum of even = 100
//    minimum of odd = 1
//    difference: 100-1 = 99

    public int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int a : A) {
            if (a % 2 == 0) {
                if (a > max) {
                    max = a;
                }
            } else if (a < min) {
                min = a;
            }
        }
        int d = max - min;
        return d;
    }

    public static void main(String[] args) {
        int[] A = {5, 17, 100, 1};
        int[] B = {0, 2, 9};
        DiffMaxEvenMinOdd diffMaxEvenMinOdd = new DiffMaxEvenMinOdd();
        int solve = diffMaxEvenMinOdd.solve(A);
        int solve1 = diffMaxEvenMinOdd.solve(B);
        System.out.println(solve + ": :" + solve1);
    }
}

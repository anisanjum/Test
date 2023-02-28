public class RemoveDuplicatesFromSortedArray {
    public int rdfsa(int[] nums) {
        int j = 1;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[j]) {
                count++;
                nums[count] = nums[j];
//                System.out.println(nums[count]);
            }
            j++;
        }
        return count + 1;
    }
}

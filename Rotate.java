class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int i = k % length;
        while (i > 0) {
            int last = nums[length - 1];
            for (int j = length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
            i--;
        }
    }
}

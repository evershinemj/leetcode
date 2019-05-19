class Solution {
    private int removeDuplicates(int[] nums, int length) {
        for (int i = length - 1; i > 0; i--) {
            if (nums[i] == nums[i-1]) {
                for (int j = i; j <= length - 1; j++) {
                    nums[j - 1] = nums[j];
                }
                length--;
                length = removeDuplicates(nums, length);
                break;
            }
        }
        return length;
    }
    public int removeDuplicates(int[] nums) {
        if (nums == null) return 0;
        int length = removeDuplicates(nums, nums.length);
        return length;
    }
}

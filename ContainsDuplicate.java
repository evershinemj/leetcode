class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) return false;
        java.util.Arrays.sort(nums);
        if (nums[0] == nums[1] || nums[nums.length - 1] == nums[nums.length - 2]) {
            return true;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] == nums[i] || nums[i + 1] == nums[i]) {
                return true;
            }
        }
        return false;
    }
}

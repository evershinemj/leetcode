class Solution {
    private int count = 0;
    
    private int findTargetSumWays(int[] nums, int firstIndex, int S) {
        if (firstIndex == nums.length - 1) {
            if (nums[firstIndex] == S) count++;
            if (-nums[firstIndex] == S) count++;
            return count;
        }
        findTargetSumWays(nums, firstIndex + 1, S + nums[firstIndex]);
        findTargetSumWays(nums, firstIndex + 1, S - nums[firstIndex]);
        return count;
    }
    
    public int findTargetSumWays(int[] nums, int S) {
        return findTargetSumWays(nums, 0, S);
    }
}

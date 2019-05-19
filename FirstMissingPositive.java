class Solution {
    public int firstMissingPositive(int[] nums) {
        java.util.Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 1) {
                return 1;
            } else if ( nums[i] == 1) {
                int diff = i - nums[i];
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] - j != diff) {
                        return nums[j - 1] + 1;
                    }
                }
                return nums[nums.length - 1] + 1;
            }
        }
        return 1;
    }
}

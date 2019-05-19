class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (j - i <= k) {
                    if ((long) nums[i] - nums[j] <= t && (long) nums[j] - nums[i] <= t) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

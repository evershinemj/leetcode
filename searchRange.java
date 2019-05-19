class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                res[0] = i;
                int j = i;
                for (j = i; j < nums.length && nums[j] == target; j++) {
                    
                }
                res[1] = j - 1;
                return res;
            }
        }
        res[0] = -1;
        res[1] = -1;
        return res;
    }
}

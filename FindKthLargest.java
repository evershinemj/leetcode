class Solution {
    public int findKthLargest(int[] nums, int k) {
        java.util.Arrays.sort(nums);
        int res = nums[0];
        int count = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            count++;
            if (count == k) {
                res = nums[i];
                return res;
            }
//            count++;
            /*
            while (i > 0 && nums[i] == nums[i - 1]) {
                i--;   
            }
            */
        }
        return res;
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
//        int max = 0;
        int largest = 0;
        for (int i = 0; i < nums.length; i++) {
            int max = nums[i];
            // int sum = 0;
            int sum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum > max) {
                    max = sum;
                }
            }
            if (i == 0) {
                largest = max;
            }
            if (max > largest) {
                largest = max;
            }
        }
        return largest;
    }
}

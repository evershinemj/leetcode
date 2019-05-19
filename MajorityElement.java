class Solution {
    public int majorityElement(int[] nums) {
        java.util.Arrays.sort(nums);
        int count = 1;
        for (int i = 0; i <= nums.length / 2; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > nums.length / 2) {
//                int tmp = i - 1;
//                return nums[tmp];
                return nums[i];
            }
            count = 1;
        }
        return nums[0];
    }
}

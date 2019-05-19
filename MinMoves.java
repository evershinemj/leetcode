class Solution {
    public int minMoves(int[] nums) {
        int min = 0;
        while (true) {
            Arrays.sort(nums);
            if (nums[0] == nums[nums.length - 1]) break;
            min++;
            for (int i = 0; i < nums.length - 1; i++) {
                nums[i]--;
            }
        }
        return min;
    }
}

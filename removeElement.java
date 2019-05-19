class Solution {
    public int removeElement(int[] nums, int val) {
        java.util.Arrays.sort(nums);
        for (int i : nums) {
            // System.out.println(nums[i]);
            System.out.println(i);
        }
        int newLength = nums.length;
        int duplicates = 0;
        int firstDuplicateIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                firstDuplicateIndex = i;
                // for (int j = i; nums[j] == val; j++) {
                // for (int j = i; nums[j] == val && j < nums.length; j++) {
                // order matters; j < nums.length should be judged first
                // to prevent array index overflow
                for (int j = i; j < nums.length && nums[j] == val; j++) {
                    duplicates++;
                }
                break;
            }
        }
        System.out.println("duplicates: " + duplicates);
        newLength -= duplicates;
        int ceiling = nums.length - firstDuplicateIndex - duplicates;
        for (int i = 0; i < ceiling; i++) {
            nums[firstDuplicateIndex] = nums[firstDuplicateIndex + duplicates];
            firstDuplicateIndex++;
        }
        return newLength;
    }
}

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i : nums) {
            if (i == 1) {
                count++;
                if (count > max) max = count;
            } else {
                // count = 0;
                /*
                if (count > max) {
                    max = count;
                }
                */
                count = 0;
            }
        }
        return max;
    }
}

//class Solution {
//    public int findMaxConsecutiveOnes(int[] nums) {
//        int max = 0;
//        for (int i : nums) {
//            if (i == 1) max = 1;
//        }
//        out:
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                for (int k = i; k <= j; k++) {
//                    if (nums[k] != 1) {
//                        continue out;
//                    }
//                    //max = j - i + 1;
//                }
//                if (j - i + 1 > max) {
//                    max = j - i + 1;
//                }
//            }
//        }
//        return max;
//    }
//}

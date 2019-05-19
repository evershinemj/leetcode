class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int maxProduct = nums[i];
            int product = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                product *= nums[j];
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
            if (maxProduct > res) {
                res = maxProduct;
            }
        }
        return res;
    }
}

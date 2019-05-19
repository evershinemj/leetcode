class Solution {
    int[] nums;
    ArrayList<Integer> list;
    
    public Solution(int[] nums) {
        this.nums = nums;    
        list = new ArrayList<Integer>();        
    }
    
    public int pick(int target) {   
        list.clear();
        for (int i = 0; i< nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }
        Random random = new Random();
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */

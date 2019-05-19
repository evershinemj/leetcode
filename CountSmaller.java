class Solution {
    private List<Integer> list = new ArrayList<>();
    
    public List<Integer> countSmaller(int[] nums) {
        if (nums.length == 0) return list;
        for (int i = 0; i < nums.length - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            list.add(count);        
        }
        list.add(0);
        return list;
    }
}

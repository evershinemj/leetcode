class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length < 2) return null;
        int[] res = new int[2];
        res[0] = 1;
        res[1] = 2;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    res[0] = i + 1;
                    res[1] = j + 1;
                    return res;
                }
            }
        }
        return res;
    }
}

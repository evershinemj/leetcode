class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            String binary = Integer.toBinaryString(i);
            int countOfOne = 0;
            for (int j = 0; j < binary.length(); j++) {
                if (binary.charAt(j) == '1') {
                    countOfOne++;
                }
            }
            res[i] = countOfOne;
        }
        return res;
    }
}

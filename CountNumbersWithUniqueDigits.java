class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int count = 0;
        int limit = (int) Math.pow(10, n);
        out:
        //for (int i = 0; i < Math.pow(10, n); i++) {
        for (int i = 0; i < limit; i++) {
            int j = i;
            Set<Integer> set = new HashSet<>();
            while (j > 0) {
                if (set.contains(j % 10)) continue out;
                // set.add(j);
                set.add(j % 10);
                j /= 10;
            }
            count++;
        }
        return count;
    }
}

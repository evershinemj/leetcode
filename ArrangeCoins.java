class Solution {
    /**
      * (1 + k) * k / 2 <= n
      * (1 + k + 1) * (k + 1) / 2 > n
      */
    public int arrangeCoins(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        // k * k < 2n; (k + 2) * (k + 2) > 2n
        int upper = (int) Math.sqrt(2 * (long) n);
        int lower = (int) Math.sqrt(2 * (long) n) - 1;
        System.out.println("upper: " + upper + "; lower: " + lower);
        for (int i = lower; i <= upper; i++) {
            if ((long) (1 + i) * i / 2 <= n &&
                (long) (2 + i) * (1 + i) / 2 > n) {
                return i;
            }
        }
        return 0;
        /*
        int rows = 0;
        long total = 0;
        while (total <= n) {
            total += ++rows;
        }
        return --rows;
        */
    }
}

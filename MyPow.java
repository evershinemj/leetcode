class Solution {
    public double myPow(double x, int n) {
        if (n < 0) {
            return 1 / myPow(x, -n);
        } else if (n == 0) {
            return 1;
        } else {
            /*
             * double res = 1;
             * while (n > 0) {
             *     res *= x;
             *     n--;
             * }
             * return res;
             */
            if (n == 1) {
                return x;
            } else {
                n--;
                return x * myPow(x, n);
            }
        }
    }
}

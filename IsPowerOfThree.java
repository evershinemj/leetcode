class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        while (n >= 3) {
            if (n % 3 != 0) return false;
            n /= 3;
            if (n == 1) return true;
            if (n == 2) return false;
        }
        return false;
    }
}

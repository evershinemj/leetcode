class Solution {
    public boolean isPowerOfFour(int num) {
        if (num == 1) return true;
        while (num >= 4) {
            if (num % 4 != 0) return false;
            num /= 4;
            if (num == 1) return true;
        }
        return false;
    }
}

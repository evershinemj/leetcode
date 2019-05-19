class Solution {
    public int firstUniqChar(String s) {
        out:
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    continue out;
                }
            }
            return i;
        }
        return -1;
    }
}

class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        String s1 = Integer.toBinaryString(x);
        String s2 = Integer.toBinaryString(y);
        // System.out.println("s1: " + s1 + ";s2: " + s2);
        int length1 = s1.length();
        int length2 = s2.length();
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        for (int i = 0; i < 32 - length1; i++) {
            sb1.insert(0, "0");
        }
        for (int i = 0; i < 32 - length2; i++) {
            sb2.insert(0, "0");
        }
        for (int i = 0; i < 32; i++) {
            if (((sb1.charAt(i) - '0') ^ (sb2.charAt(i) - '0')) == 1) {
                count++;
            }
        }
        return count;
    }
}

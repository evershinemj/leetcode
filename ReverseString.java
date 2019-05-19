class Solution {
    private void swap(char[] s, int index1, int index2) {
        char tmp = s[index1];
        s[index1] = s[index2];
        s[index2] = tmp;
    }
    
    public void reverseString(char[] s) {
        int length = s.length;
//        for (int i = 0; i < length; i++) {
        for (int i = 0; i < length / 2; i++) {
            swap(s, i, length - 1 - i);
        }
    }
}

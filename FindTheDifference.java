class Solution {
    public char findTheDifference(String s, String t) {
//        char[] chars1 = new char[s.length()];
//        char[] chars2 = new char[t.length()];
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        for (int i = 0; i < s.length(); i++) {
            if (chars1[i] != chars2[i]) {
                return chars2[i];
            }
        }
        return chars2[t.length() - 1];
    }
}

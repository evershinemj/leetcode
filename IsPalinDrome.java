class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            // Character c = Character.valueOf(s.charAt(i));
            // if (c.isAlpha() || c.isNumber()) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                sb.append(c);
            }
        }
        System.out.println(sb);
        String original = sb.toString();
        StringBuilder reversed = sb.reverse();
        System.out.println(reversed);
        if (original.equalsIgnoreCase(reversed.toString())) {
            return true;
        } else {
            return false;
        }
    }
}

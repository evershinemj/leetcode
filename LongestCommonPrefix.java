class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        // int index = 0;
        // choose the first String as a pivot
        if (strs.length == 0) {
            return "";
        }
        for (int index = 0; index < strs[0].length(); index++) {
            char cursor = strs[0].charAt(index);
            for (String item : strs) {
                if (index > item.length() - 1) {
                    return sb.toString();
                }
                char current = item.charAt(index);
                if (current != cursor) {
                    return sb.toString();
                }
            }
            sb.append(cursor);
        }
        return sb.toString();
    }
}

class Solution {
    public String licenseKeyFormatting(String S, int K) {
        S = S.toUpperCase();
        StringBuilder sb = new StringBuilder(S);
//        sb.delete('-');
//        sb.replace("-", "");
        int index = sb.length() - 1;
        while (index >= 0) {
            if (sb.charAt(index) == '-') {
                sb.delete(index, index + 1);
            }
            index--;
        }
        System.out.println(sb);
        index = sb.length() - K;
        while (index > 0) {
            sb.insert(index, "-");
            index -= K;
        }
        return sb.toString();
    }
}

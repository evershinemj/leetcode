class Solution {
    public String reverseWords(String s) {
//        String[] words = s.split(" ");
        java.util.StringTokenizer st = new java.util.StringTokenizer(s);
        ArrayList<String> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
//        if (words.length == 0) {
        if (list.size() == 0) {
            return "";
        }
        // String[] res = new String[words.length];
        StringBuilder sb = new StringBuilder();
//      for (int i = words.length - 1, j = 0; i > 0; i--, j++) {
        for (int i = list.size() - 1, j = 0; i > 0; i--, j++) {
//            res[j] = words[i];
//            sb.append(words[i]);
            sb.append(list.get(i));
            sb.append(" ");
        }
//        sb.append(words[0]);
        sb.append(list.get(0));
        return sb.toString();
    }
}

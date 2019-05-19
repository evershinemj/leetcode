class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        int length = words.length;
        List<List<Integer>> listList = new ArrayList<>();
        List<Integer> list = null;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                String s1 = words[i] + words[j];
                String s2 = words[j] + words[i];
                StringBuilder sb1 = new StringBuilder(s1);
                StringBuilder sb2 = new StringBuilder(s2);
                String reversed1 = sb1.reverse().toString();
                String reversed2 = sb2.reverse().toString();
                if (s1.equals(reversed1)) {
                    list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    listList.add(list);
                }
                if (s2.equals(reversed2)) {
                    list = new ArrayList<>();
                    list.add(j);
                    list.add(i);
                    listList.add(list);
                }
            }
        }
        return listList;
    }
}

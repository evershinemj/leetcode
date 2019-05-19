class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int length = s.length();
        char[] arrayOfS = new char[length];
        char[] arrayOfT = new char[length];
        for (int i = 0; i < length; i++) {
            arrayOfS[i] = s.charAt(i);
            arrayOfT[i] = t.charAt(i);
        }
        Arrays.sort(arrayOfS);
        Arrays.sort(arrayOfT);
        // System.out.println(Arrays.asList(arrayOfS));
        // System.out.println(Arrays.asList(arrayOfT));
        // if (arrayOfS.equals(arrayOfT)) return true;
        for (int i = 0; i < length; i++) {
            if (arrayOfS[i] != arrayOfT[i]) return false;
        }
        return true; 
    }
}

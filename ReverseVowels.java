class Solution {
    private void swap(StringBuilder sb, int index1, int index2) {
        char tmp = sb.charAt(index1);
//      sb.charAt(index1) = sb.charAt(index2);
//      sb.charAt(index2) = tmp;
    }
    
    private void swap(char[] s, int index1, int index2) {
        char tmp = s[index1];
        s[index1] = s[index2];
        s[index2] = tmp;
    }
    
    public String reverseVowels(String s) {
        /*
         Set<Character> vowels = new HashSet<>('a', 'e', 'i', 'o', 'u',
                                              'A', 'E', 'I', 'O', 'U');
        */
        Set<Character> vowels = new HashSet<>();
        char[] vowelArray = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
//        vowels.addAll('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        // vowels.addAll(Arrays.asList(vowelArray));
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
        vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');
        int numOfVowels = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) numOfVowels++;
        }
        int count = 0;
        // StringBuilder sb = new StringBuilder(s);
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (count < numOfVowels / 2) {
            //if (!vowels.contains(sb.charAt(left))) {
            if (!vowels.contains(chars[left])) {
                left++;
                continue;
            }
            //if (!vowels.contains(sb.charAt(right))) {
            if (!vowels.contains(chars[right])) {
                right--;
                continue;
            }
            //swap(sb, left++, right--);
            swap(chars, left++, right--);
            count++;
        }
//        return sb.toString();
        String res = new String();
        for (char c : chars) {
            res += String.valueOf(c);
        }
        return res;
    }
}

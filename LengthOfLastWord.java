class Solution {
    public int lengthOfLastWord(String s) {
//        if (s.charAt(s.length() - 1) == ' ') {
        /*
        if (s.equals("") || s.charAt(s.length() - 1) == ' ') {
            return 0;
        }
        */
        /*
        if (s.equals("")) {
            return 0;
        }
        */
        /*
        java.util.ArrayList<String> list = s.split(); // error in argument
        java.util.ArrayList<String> list = s.split(" "); // error in return type
        String lastWord = list.get(list.size() - 1);
        */
        String[] words = s.split(" ");
        if (words.length == 0) {
            return 0;
        }
        String lastWord = words[words.length - 1];
        return lastWord.length();
    }
}

class Solution {
    public String decodeString(String s) {
        while (s.indexOf(']') != -1) {
            int rightBracket = s.indexOf(']');
            // int leftBracket = s.indexOf('[', rightBracket);
            int leftBracket = s.lastIndexOf('[', rightBracket);
            System.out.println("rightBracket: " + rightBracket + "; " +
                              "leftBracket: " + leftBracket);
            int i = leftBracket - 1;
            while (i >= 0 && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                i--;
            }
            // if (i == -1) i = 0;
            i++;
            int indexOfFirstNumber = i;
            System.out.println("indexOfFirstNumber: " + indexOfFirstNumber);
            int repeatedTimes = Integer.parseInt(s.substring(i, leftBracket));
            System.out.println("repeatedTimes: " + repeatedTimes);
            String repeated = new String();
            for (int j = 0; j < repeatedTimes; j++) {
                repeated += s.substring(leftBracket + 1, rightBracket);
            }
            System.out.println("repeated: " + repeated);
            s = s.substring(0, i) + repeated + 
                s.substring(rightBracket + 1, s.length());
            System.out.println(s);
        }
        return s;
    }
}

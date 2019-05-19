class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        char c = 'A';
//        while (n / 26 > 0) {
//        while (n / 26 >= 1) {
        while (n != 0) {
            /*
            if (n % 26 == 0) {
                sb.append('Z');
                n = n / 26;
                continue;
            }
            */                                                                                                                                           
            if (n % 26 == 1) {
                c = 'A';
            } else if (n % 26 == 0) {
                c = 'Z';
            } else {c = (char) ('A' - 1 + n % 26);}
            System.out.println(c);
            sb.append(c);
            if (n == 26) {
                break;
            }
            int quotient = n % 26;
            n = n / 26;
            if (quotient == 0) {
                n--;
            }
            /*
            if (quotient == 0 && n == 1) {
                break;
            }
            */
        }
    /*
        if (n % 26 == 1) c = 'A';
        if (n % 26 == 0) c = 'Z';
        c = (char) ('A' - 1 + n % 26);
        sb.append(c);
    */
        // System.out.println(sb);
        String res = sb.reverse().toString();
        return res;
    }
}

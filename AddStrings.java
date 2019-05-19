class Solution {
    public String addStrings(String num1, String num2) {
        int addOne = 0;
        int length = Math.max(num1.length(), num2.length());
        int length1 = num1.length();
        int length2 = num2.length();
        // int lastIndex1 = length1 - 1;
        // int lastIndex2 = length2 - 1;
        String zeroes = "";
        if (length1 > length2) {
            for (int i = 0; i < length1 - length2; i++) {
                zeroes += "0";
            }
            num2 = zeroes + num2;
        } else if (length2 > length1) {
            for (int i = 0; i < length2 - length1; i++) {
                zeroes += "0";
            }
            num1 = zeroes + num1;
        }
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            int digit2 = num2.charAt(i) - '0';
            sum = digit1 + digit2 + addOne;
            if (sum < 10) {
                addOne = 0;
                sb.append(sum);
            } else {
                addOne = 1;
                sb.append(String.valueOf(sum % 10));
            }
        }
        if (addOne == 1) sb.append(1);
        return sb.reverse().toString();
    }
}

class Solution {
    public int findNthDigit(int n) {
        // 9 numbers of 1 digit
        // 90 numbers of 2 digits
        // 900 numbers of 3 digits ...
        // int factor = 1;
        long input = n;
        long factor = 1;
        int digits = 1;
        // while (n > 0) {
        while (input > 0) {
            // n -= 9 * factor * digits;
            input -= 9 * factor * digits;
            factor *= 10;
            digits++;
        }
        factor /= 10;
        digits--;
        System.out.println("factor: " + factor + "; digits: " + digits);
        // n += 9 * factor * digits;
        input += 9 * factor * digits;
        n = (int) input;
        int num = (int) factor + (n - 1) / digits;
        int index = (n - 1) % digits;
        System.out.println("num: " + num + "; index: " + index);
        return String.valueOf(num).charAt(index) - '0';
        /*
        int count = 0;
        int index = 1;
        while (count < n) {
            String s = String.valueOf(index++);
            count += s.length();
        }
        // count -= String.valueOf(index).length();
        index--;
        count -= String.valueOf(index).length();
        String last = String.valueOf(index);
//        int res = (int) last.charAt(n - count - 1);
        int res = (int) (last.charAt(n - count - 1) - '0');
        return res;
        */
    }
}

// class Solution {
//     public int findNthDigit(int n) {
//         int count = 0;
//         int index = 1;
//         while (count < n) {
//             String s = String.valueOf(index++);
//             count += s.length();
//         }
//         // count -= String.valueOf(index).length();
//         index--;
//         count -= String.valueOf(index).length();
//         String last = String.valueOf(index);
// //        int res = (int) last.charAt(n - count - 1);
//         int res = (int) (last.charAt(n - count - 1) - '0');
//         return res;
//     }
// }

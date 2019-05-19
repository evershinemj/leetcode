class Solution {
//    public int reverse(int x) {
    public int reverse(int x) {
//        int backup = x;
//        System.out.println(backup);
//        if (x == 0 || x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
        int backup = x;
        x = Math.abs(x);
        if (x == 0) {
            return 0;
        } else {
            java.util.List<Integer> list = new ArrayList<>();
            while (x != 0) {
                list.add(x % 10);
                // System.out.println(x % 10);
                x /= 10;
            }   
            // int reversed = 0;
            long reversed = 0;
            // int size = list.size();
            int factor = 1;
            // for (int item : list) {
            for (int index = list.size() - 1; index >=0; index--) {
                int item = list.get(index);
                reversed += (long) item * factor;
                factor *= 10;
            }
            /*
            if (backup < 0) {
                System.out.println(reversed);
                reversed *= -1;
                System.out.println(reversed);
            }
            */
            if (backup < 0) reversed = -reversed;
            return reversed < Integer.MAX_VALUE && 
                reversed > Integer.MIN_VALUE? (int) reversed : 0;
        }
    }
}

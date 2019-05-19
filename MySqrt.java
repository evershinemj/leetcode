class Solution {
    public int mySqrt(int x) {
        int i = 0;
        /*
        for (i = 0; i * i <= x; i++) {
            
        }
        */
        // note that i * i can never exceed Integer.MAX_VALUE!
        // when x approaches Integer.MAX_VALUE, things can get tricky
        
//         while (i * i <= x) {
        while ((long) i * (long) i <= x) {
            // System.out.println(i * i);
            // System.out.println(Integer.MAX_VALUE);
            i++;
        }
        return --i;
    }
}

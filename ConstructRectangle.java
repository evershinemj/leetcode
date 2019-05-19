class Solution {
    public int[] constructRectangle(int area) {
        int sqrt = (int) Math.sqrt(area);
        int[] arr = {0, 0};
        while (sqrt <= area) {
            if (area % sqrt == 0 && sqrt >= area / sqrt) {
                int length = sqrt;
                int width = area / length;
//                arr = {length, width};
                arr[0] = length;
                arr[1] = width;
                return arr;
            }
            sqrt++;
        }
        return arr;
    }
}

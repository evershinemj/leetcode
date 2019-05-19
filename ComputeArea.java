class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int firstWidth = Math.abs(A - C);
        int firstHeight = Math.abs(B - D);
        int secondWidth = Math.abs(E - G);
        int secondHeight = Math.abs(F - H);
        int firstArea = firstWidth * firstHeight;
        int secondArea = secondWidth * secondHeight;
        int overlappedWidth = 0;
        int overlappedHeight = 0;
        if (firstWidth + secondWidth - 
            Math.max(Math.abs(G - A), Math.abs(E - C)) > 0) {
            int[] widthArr = {A, C, E, G};
            java.util.Arrays.sort(widthArr);
            overlappedWidth = widthArr[2] - widthArr[1];
        } 
        if (firstHeight + secondHeight -
           Math.max(Math.abs(F - D), Math.abs(H - B)) > 0) {
            int[] heightArr = {B, D, F, H};
            java.util.Arrays.sort(heightArr);
            overlappedHeight = heightArr[2] - heightArr[1];
        }
        //int overlappedWidth = firstWidth + secondWidth - 
        //    Math.max(Math.abs(G - A), Math.abs(E - C));
        //if (overlappedWidth < 0) overlappedWidth = 0;
        //int overlappedHeight = firstHeight + secondHeight - 
        //    Math.max(Math.abs(F - D), Math.abs(H - B));
        //if (overlappedHeight < 0) overlappedHeight = 0;
        int overlappedArea = overlappedWidth * overlappedHeight;
        return firstArea + secondArea - overlappedArea;
    }
}

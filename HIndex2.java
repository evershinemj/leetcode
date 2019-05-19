class Solution {
    public int hIndex(int[] citations) {
        int numOfPapers = citations.length;
        if (numOfPapers == 0) return 0;
        if (numOfPapers == 1) {
            if (citations[0] == 0) return 0;
            else return 1;
        }
        int h = numOfPapers;
        if (citations[0] >= h) return h;
        h--;
        
        for (int i = 0; i < numOfPapers - 1; i++) {
            if (citations[numOfPapers - h] >= h
               && citations[numOfPapers - h - 1] <= h) {
                return h;
            }
            h--;
        }
        return 0;
    }
}

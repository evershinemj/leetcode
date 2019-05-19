class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int numOfPapers = citations.length;
        int h = numOfPapers;
        if (numOfPapers == 0) return 0;
        
        if (numOfPapers == 1) {
            if (citations[0] == 0) return 0;
            else return 1;
        }
        
        int count = 0;
        for (int i : citations) {
            // if (i >= h) return h;
            if (i >= h) count++;
        }
        if (count == numOfPapers) return h;
        
        h--;
        System.out.println("h = " + h);
        for (int i : citations) System.out.println(i);
        
        for (int i = 0 ; i < citations.length - 1; i++) {
            if (citations[numOfPapers - h] >= h && 
                citations[numOfPapers - 1 - h] <= h) {
                return h;
            }
            h--;
        }
        return 0;
    }
}

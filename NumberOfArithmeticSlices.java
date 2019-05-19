class Solution {
    private boolean isArithmetic(int[] arr, int index1, int index2) {
        if ((arr[index2] - arr[index1]) % (index2 - index1) != 0) return false;
        int difference = (arr[index2] - arr[index1]) / (index2 - index1);
        for (int i = index1; i < index2; i++) {
            if (arr[i + 1] - arr[i] != difference) return false;
        }
        return true;
    }
    
    public int numberOfArithmeticSlices(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length - 2; i++) {
            for (int j = i + 2; j < A.length; j++) {
                if (isArithmetic(A, i, j)) count++;
            }
        }
        return count;
    }
}

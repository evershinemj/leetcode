class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);
        int leftIndex = (merged.length - 1) / 2;
        int rightIndex = merged.length / 2;
        double median = (double) (merged[leftIndex] + merged[rightIndex]) / 2;
        return median;
        // System.out.println(merged.length);
        /*
        for (int i : merged) {
            System.out.println(i);
        }
        return 0.0;
        */
    }
}

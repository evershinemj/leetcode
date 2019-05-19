class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tmp = new int[m + n];
        int left = 0;
        int right = 0;
        int index = 0;
        while ( left < m && right < n) {
            if (nums1[left] <= nums2[right]) {
                tmp[index] = nums1[left];
                index++;
                left++;
            } else {
                tmp[index] = nums2[right];
                index++;
                right++;
            }
        }
        System.arraycopy(nums1, left, tmp, index, m - left);
        System.arraycopy(nums2, right, tmp, index, n - right);
        System.arraycopy(tmp, 0, nums1, 0, m + n);
    }
}

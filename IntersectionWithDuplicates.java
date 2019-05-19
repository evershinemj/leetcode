class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int nums1Left = 0;
        int nums2Left = 0;
        List<Integer> list = new ArrayList<>();
        while (nums1Left < nums1.length && nums2Left < nums2.length) {
            if (nums1[nums1Left] == nums2[nums2Left]) {
                list.add(nums1[nums1Left]);
                nums1Left++;
                nums2Left++;
            } else if (nums1[nums1Left] < nums2[nums2Left]) {
                nums1Left++;
            } else if (nums1[nums1Left] > nums2[nums2Left]) {
                nums2Left++;
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) res[i] = list.get(i);
        return res;
        // return list.toArray();
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        int p = m - 1;
        int q = n - 1;

        while (p >= 0 && q >= 0) {
            if (nums2[q] > nums1[p]) {
                nums1[k] = nums2[q];
                q--;
                k--;
            } else {
                nums1[k] = nums1[p];
                p--;
                k--;
            }
        }

        while (q >= 0) {
            nums1[k] = nums2[q];
            q--;
            k--;
        }
    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] mergeArray = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                mergeArray[k++] = nums1[i++];
            } else {
                mergeArray[k++] = nums2[j++];
            }
        }

        // If there are remaining elements in nums1, copy them to the merged array
        while (i < m) {
            mergeArray[k++] = nums1[i++];
        }

        // If there are remaining elements in nums2, copy them to the merged array
        while (j < n) {
            mergeArray[k++] = nums2[j++];
        }

        // Print the merged array
        for (int num : mergeArray) {
            System.out.print(num + " ");
        }

        // Find the median
        int mid = (m + n) / 2;
        if ((m + n) % 2 == 0) {
            // If the total length is even, return the average of the middle elements
            return (mergeArray[mid - 1] + mergeArray[mid]) / 2.0;
        } else {
            // If the total length is odd, return the middle element
            return mergeArray[mid];
        }
    }
}

class MergeSortedArrays {


    public void merge(int[] num1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        int index1 = m - 1;
        int index2 = n - 1;

        while (index1 >= 0 && index2 >= 0) {
            if (num1[index] < nums2[index2]) {
                num1[index] = nums2[index2];
                index2--;
            } else {
                num1[index] = num1[index1];
                index1--;
            }
            index--;
        }

        System.arraycopy(nums2, 0, nums1, 0, index2 + 1);

    }

}
class RotateArray {
    public void rotate(int[] nums, int k) {
        helper(nums, 0, nums.length);
        helper(nums, 0, k - 1);
        helper(nums, k, nums.length - 1);
    }

    private void helper(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
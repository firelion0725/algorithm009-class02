class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int first = 0;
        int second = first + 1;
        while (second < nums.length) {
            if (nums[first] == nums[second]) {
                second++;
            } else {
                first++;
                nums[first] = nums[second];
            }
        }
        return first + 1;
    }
}
class MoveZeros {

    public void moveZeroes(int[] nums) {
        int lastNoZeroIndex = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNoZeroIndex] = nums[i];
                lastNoZeroIndex++;
                count++;
            }
        }

        int zeroCount = nums.length - count;
        for (int i = nums.length - 1; i > nums.length - 1 - zeroCount; i--) {
            nums[i] = 0;
        }
    }

}
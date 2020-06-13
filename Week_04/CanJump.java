class CanJump {
    private boolean canJump(int[] nums){
        if(nums.length == 1){
            return true;
        }
        int next = 0;
        for (int i = 0; i < nums.length; i++) {
            if( next < i){
                return false
            }
            next = Math.max(next , nums[i]+i);
        }
    }
}
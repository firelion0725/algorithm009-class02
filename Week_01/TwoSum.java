import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int data = nums[i];
            if (map.get(target - data) == null) {
                map.put(data, i);
            } else {
                result[0] = i;
                result[1] = map.get(target - data);
                return result;
            }
        }
        return result;
    }
}
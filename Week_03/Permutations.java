class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArraayList<>();
        backTrance(result);
        return result;
    }

    private void backTrance(List<List<Integer>> result, int[] nums, List<Integer> list) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
        }

        for (int i = 0; i < nums.length; i++) {
            if (list.constants(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            backTrance(result, nums, list);
            list.remove(list.size() - 1);
        }
    }
}
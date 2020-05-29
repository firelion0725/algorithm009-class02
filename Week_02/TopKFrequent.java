class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1, n2) -> count.get(n1) - count.get(n2));
        for (Integer key : map.keySet()) {
            if (heap.size() < k) {
                heap.add(key)
            } else {
                if (map.get(key) > map.get(heap.peek())) {
                    heap.remove();
                    heap.add(key);
                }
            }
        }

        for (int i = 0; i < k; i++) {
            result[i] = heap.remove();
        }

        return result;
    }
}
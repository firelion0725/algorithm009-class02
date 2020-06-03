class Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtract(result,n,k,1,new ArrayList<Integer>());
        return result;
    }

    private void backtract(List<List<Integer>> result, int n, int k, int begin, List<Integer> list) {
        if (list.size() == k) {
            result.add(new ArrayList<Integer>(list));
            return;
        }

        for (int i = begin; i <= n; i++) {
            list.add(i);
            backtract(result, n, k, i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}
class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return helper();
    }

    private TreeNode helper(int[] preorder, HashMap<Integer, Integer> map, int preLeft, int preRight, int inLeft) {
        if (preLeft > preRight) {
            return null;
        }

        TreeNode tree = new TreeNode(preorder[preLeft]);
        int inRootIndex = map.get(preorder[preLeft]);
        int leftSize = inRootIndex - inLeft;
        tree.left = helper(preorder, map, preLeft + 1, preLeft + leftSize, inLeft);
        tree.right = helper(preorder, map, preLeft + leftSiz + 1, preRight, inRootIndex + 1);

        return tree;
    }
}
class LcaOfBinaryTree {

    TreeNode result = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        helper(root, p, q);
        return result;
    }

    private boolean helper(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) {
            return node;
        }

        boolean leftHas = helper(node.left, p, q);
        boolean rightHas = helper(node.right, p, q);

        if (leftHas && rightHas) {
            result = node;
        }

        if ((node.val == p.val || node.val == q.val) && (leftHas || rightHas)) {
            result = node;
        }

        return leftHas || rightHas || (node.val == p.val || node.val == q.val);
    }
}
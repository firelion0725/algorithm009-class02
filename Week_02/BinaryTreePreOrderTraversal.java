import model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreOrderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(result, root);
        return result;
    }

    private void helper(List<Integer> list, TreeNode node) {
        if (node != null) {
            list.add(node.val);
            if (node.left != null) {
                helper(list, node.left);
            }

            if (node.right != null) {
                helper(list, node.right);
            }
        }
    }
}

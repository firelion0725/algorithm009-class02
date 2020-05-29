import model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(result, root);
        return result;
    }

    private void helper(List<Integer> list, TreeNode node) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            helper(list, node.left);
        }
        list.add(node.val);
        if (node.right != null) {
            helper(list, node.right);
        }
    }


}

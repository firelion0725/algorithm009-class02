import model.Node;

import java.util.ArrayList;
import java.util.List;

public class NTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, root, 0);
        return result;
    }

    private void helper(List<List<Integer>> list, Node node, int level) {
        if (node == null) {
            return;
        }
        if (list.size() <= level) {
            list.add(new ArrayList<>());
        }

        list.get(level).add(node.val);
        for (Node n : node.children) {
            helper(list, n, level + 1);
        }
    }

}

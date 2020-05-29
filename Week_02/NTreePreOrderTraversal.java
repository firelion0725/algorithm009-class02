
import model.Node;

import java.util.ArrayList;
import java.util.List;

public class NTreePreOrderTraversal {

    public List<Integer> preOrder(Node node) {
        List<Integer> result = new ArrayList<>();
        helper(result, node);
        return result;
    }

    private void helper(List<Integer> result, Node node) {
        if(node == null){
            return;
        }
        result.add(node.val);
        if (node.children == null) {
            return;
        }
        for (Node n : node.children) {
            helper(result, n);
        }
    }

}

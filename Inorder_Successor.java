/**
 *
 *
 * */

public class Inorder_Successor {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node parent;
    };

    public Node inorderSuccessor(Node node) {
        if (node.right != null) {
            Node cur = node.right;

            while (cur.left != null)
                cur = cur.left;
            return cur;
        }

        while (node.parent != null) {
            if (node.parent.left == node)
                return node.parent;
            node = node.parent;
        }

        return null;
    }
}

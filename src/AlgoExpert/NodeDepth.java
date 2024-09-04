package AlgoExpert;

public class NodeDepth {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public static int nodeDepths(BinaryTree root) {
            return Helper(root, -1, 0);
        }

        public static int Helper(BinaryTree node, int counter, int result) {
            if (node == null) {
                return result + 0;
            }
            int depth = counter + 1;
            result = Helper(node.left, depth, result);
            result = Helper(node.right, depth, result);
            return result + depth;
        }
    }
}

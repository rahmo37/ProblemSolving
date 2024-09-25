package AlgoExpert;

class FindSuccessor {
    public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
        if(node.left == null && node.right == null && node.parent == null) {
            return null;
        }
        if (node.right != null) {
            BinaryTree curr = node.right;
            while (curr.left != null) {
                curr = curr.left;
            }
            return curr;
        } else if (node.parent.left == node) {
            return node.parent;
        } else if(node.parent.right == node) {
            BinaryTree curr = node.parent;
            BinaryTree prev = null;
            while (curr.parent != null) {
                prev = curr;
                curr = curr.parent;
            }
            if(curr.left == prev) {
                return tree;
            } else {
                return null;
            }
        }
        return null;
    }

    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;
        public BinaryTree parent = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}

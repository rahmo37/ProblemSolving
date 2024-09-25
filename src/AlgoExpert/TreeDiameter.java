package AlgoExpert;

public class TreeDiameter {
    public int maxDia = 0;

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public int binaryTreeDiameter(BinaryTree tree) {
        // Write your code here.
        helper(tree);
        return maxDia;
    }

    public int helper(BinaryTree root) {
        if(root == null) {
           return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        maxDia = Math.max(maxDia, left + right);
        return Math.max(left, right);
    }
}

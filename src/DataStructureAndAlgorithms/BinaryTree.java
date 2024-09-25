package DataStructureAndAlgorithms;

public class BinaryTree {
    TreeNode root;

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        bt.root.left = second;
        bt.root.right = third;
        second.left = fourth;
        second.right = fifth;

        bt.preOrderTraversal(bt.root);

    }

    private static class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    private void preOrderTraversal(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
}

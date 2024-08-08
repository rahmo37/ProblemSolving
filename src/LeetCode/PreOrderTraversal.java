package LeetCode;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class PreOrderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    private void preorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        // Visit the root
        result.add(node.val);

        // Traverse the left subtree
        preorderHelper(node.left, result);

        // Traverse the right subtree
        preorderHelper(node.right, result);
    }

    public static void main(String[] args) {
        // Example 1
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);

        PreOrderTraversal solution = new PreOrderTraversal();
        System.out.println(solution.preorderTraversal(root1)); // Output: [1, 2, 3]

        // Example 2
        TreeNode root2 = null;
        System.out.println(solution.preorderTraversal(root2)); // Output: []

        // Example 3
        TreeNode root3 = new TreeNode(1);
        System.out.println(solution.preorderTraversal(root3)); // Output: [1]
    }
}


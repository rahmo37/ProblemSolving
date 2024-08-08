package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {

    public List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderHelper(root, result);
        return result;
    }

    private void postorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        // Traverse the left subtree
        postorderHelper(node.left, result);

        // Traverse the right subtree
        postorderHelper(node.right, result);

        // Visit the root
        result.add(node.val);
    }

    public static void main(String[] args) {
        // Example 1
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);

        PostOrderTraversal solution = new PostOrderTraversal();
        System.out.println(solution.postOrderTraversal(root1)); // Output: [3,2,1]

        // Example 2
        TreeNode root2 = null;
        System.out.println(solution.postOrderTraversal(root2)); // Output: []

        // Example 3
        TreeNode root3 = new TreeNode(1);
        System.out.println(solution.postOrderTraversal(root3)); // Output: [1]
    }
}


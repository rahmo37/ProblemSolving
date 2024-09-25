package LeetCode;


import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {

    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    private void inorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        // Traverse the left subtree
        inorderHelper(node.left, result);

        // Visit the root
        result.add(node.val);

        // Traverse the right subtree
        inorderHelper(node.right, result);


    }

    public static void main(String[] args) {
        // Example 1
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        InOrderTraversal solution = new InOrderTraversal();
        System.out.println(solution.inOrderTraversal(root1)); // Output: [2, 1, 3]

        // Example 2
        TreeNode root2 = null;
        System.out.println(solution.inOrderTraversal(root2)); // Output: []

        // Example 3
        TreeNode root3 = new TreeNode(1);
        System.out.println(solution.inOrderTraversal(root3)); // Output: [1]
    }
}



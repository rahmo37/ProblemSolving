package AlgoExpert;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public static List<Integer> branchSums(BinaryTree root) {
            List<Integer> sumsList = new ArrayList<>();
            sumHelper(root, sumsList, 0);
            return sumsList;
        }

        public static void sumHelper(BinaryTree node, List sumList, int sum) {
            int initSum = sum;
            if(node == null) {
                return;
            }
            initSum += node.value;
            if(node.left == null && node.right == null) {
                sumList.add(initSum);
                return;
            }
            sumHelper(node.left, sumList, initSum);
            sumHelper(node.right, sumList, initSum);
        }
    }
}

package AlgoExpert;


public class InvertBinaryTree {
    public static void main(String[] args) {

    }

//    Bottom to Top approach
    public static void invertBinaryTree(BinaryTree tree) {
        if (tree == null) {
            return;
        }
        if (tree.left == null && tree.right == null) {
            return;
        }
        invertBinaryTree(tree.left); // 2
        invertBinaryTree(tree.right); // 3

        BinaryTree tempTree = tree.left;
        tree.left = tree.right;
        tree.right = tempTree;


//      Top to bottom approach
//        if (tree == null) {
//            return;
//        }
//
//        BinaryTree tempTree = tree.left;
//        tree.left = tree.right;
//        tree.right = tempTree;
//
//        invertBinaryTree(tree.left);
//        invertBinaryTree(tree.right);


    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}

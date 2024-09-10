package AlgoExpert;

public class EvaluateExpressionTree {
    public int evaluateExpressionTree(BinaryTree tree) {
//      Base case, This means the current value is an operand
        if(tree.value >= 0) {
           return tree.value;
        }
//        Otherwise we know that it's an operator, So first we have to recursively search the left and right operand
        int leftValue = evaluateExpressionTree(tree.left);
        int rightValue = evaluateExpressionTree(tree.right);

        if(tree.value == -1) {
            return leftValue  + rightValue;
        }
        if(tree.value == -2) {
            return leftValue  - rightValue;
        }
        if(tree.value == -3) {
            return (int) Math.floor(leftValue / rightValue);
        }
        return leftValue * rightValue;
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}

package MISCTools;

public class MaxAndSecondMaxNumber {

    public static void main(String[] args) {
        int[] numArr = {5, 5, 5, 5};
        int maxNum = Integer.MIN_VALUE;
        int secondMaxNum = Integer.MIN_VALUE;

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] > maxNum) {
                secondMaxNum = maxNum;
                maxNum = numArr[i];
            } else if (numArr[i] > secondMaxNum) {
                secondMaxNum = numArr[i];
            }
        }
        if (secondMaxNum == Integer.MIN_VALUE) {
            secondMaxNum = 0;
        }
        System.out.println("First max num: " + maxNum);
        System.out.println("Second max num: " + secondMaxNum);
    }

}

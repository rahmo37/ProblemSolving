package CodeForce;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split("\\+");
        System.out.println(printOrder(nums));
    }

    private static String printOrder(String[] nums) {
        for (int j = 1; j < nums.length; j++) {
            int key = Integer.parseInt(nums[j]);
            int i = j - 1;
            while (i >= 0 && Integer.parseInt(nums[i]) > key) {
                nums[i + 1] = nums[i];
                i = i - 1;
            }
            nums[i + 1] = Integer.toString(key);
        }
        return String.join("+",nums);
    }
}

package CodeForce;

import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        int n = Integer.parseInt(nums[0]);
        int k = Integer.parseInt(nums[1]);
        for(int i = k; i > 0; i--) {
            if((n % 10) != 0) {
                n = n - 1;
            } else {
                n = n / 10;
            }
        }
        System.out.println(n);
    }
}

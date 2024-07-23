package CodeForce;

import java.util.Scanner;


public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int friendHouse = sc.nextInt();
        System.out.println((int) Math.ceil(friendHouse / 5.0));
    }
}

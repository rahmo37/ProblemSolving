package CodeForce;

import java.util.Scanner;

public class GameWithSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nNdm = sc.nextLine().split(" ");
        int min = Math.min(Integer.parseInt(nNdm[0]), Integer.parseInt(nNdm[1]));
        System.out.println(min % 2 == 0 ? "Malvika" : "Akshat");
    }
}

package CodeForce;

import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfForces = Integer.parseInt(sc.nextLine());
        int x = 0, y = 0, z = 0;
        for (int i = 0; i < numberOfForces; i++) {
            String[] vectorArr = sc.nextLine().split(" ");
            x += Integer.parseInt(vectorArr[0]);
            y += Integer.parseInt(vectorArr[1]);
            z += Integer.parseInt(vectorArr[2]);
        }
        if(x == 0 && y == 0 && z == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

package CodeForce;

import java.util.Scanner;

public class XeniaAndRingroad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.nextLine().split(" ")[0]);
        String tasks[] = sc.nextLine().split(" ");
        Long t = Long.parseLong(tasks[0]) - 1;
        for (int i = 0; i < tasks.length -1; i++) {
            if (Integer.parseInt(tasks[i]) > Integer.parseInt(tasks[i + 1])) {
                t += (h - Integer.parseInt(tasks[i])) + Integer.parseInt(tasks[i + 1]);
            } else {
                t += Integer.parseInt(tasks[i + 1]) - Integer.parseInt(tasks[i]);
            }
        }
        System.out.println(t);
    }
}

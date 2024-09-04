package CodeForce;

import java.util.Scanner;

public class DubStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split("WUB");
        String result = "";
        for (String str : strArr) {
            if (!str.equals("")) {
                result += str + " ";
            }
        }
        System.out.println(result.trim());
    }
}

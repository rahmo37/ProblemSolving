package CodeForce;
import java.util.HashSet;
import  java.util.Scanner;
import java.util.Set;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] userNameArr = sc.nextLine().split("");
        Set<String> set = new HashSet<>();
        for(int i = 0; i < userNameArr.length; i++) {
            set.add(userNameArr[i]);
        }
        if(set.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}

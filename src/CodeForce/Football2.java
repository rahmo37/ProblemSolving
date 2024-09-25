package CodeForce;

import java.util.Scanner;

public class Football2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int goals = Integer.parseInt(sc.nextLine());
        String firstTeam = sc.nextLine();
        String secondTeam = "";
        int team1 = 1;
        int team2 = 0;
        for (int i = 0; i < goals - 1; i++) {
            String team = sc.nextLine();
            if (firstTeam.equals(team)) {
                team1++;
            } else {
                secondTeam = team;
                team2++;
            }
        }
        System.out.println(team1 > team2 ? firstTeam
                : secondTeam);
    }

}

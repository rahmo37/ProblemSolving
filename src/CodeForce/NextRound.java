package CodeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NextRound {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int kthPlace = Integer.parseInt(reader.readLine().split(" ")[1]) - 1;
        String[] scoreArr = reader.readLine().split(" ");
        int kthPlaceScore = Integer.parseInt(scoreArr[kthPlace]);
        int advancers = 0;

        for(int i = 0; i < scoreArr.length; i++) {
            if (kthPlaceScore == 0) {
                if(Integer.parseInt(scoreArr[i]) > kthPlaceScore) {
                    advancers++;
                }
            } else {
                if(Integer.parseInt(scoreArr[i]) >= kthPlaceScore) {
                    advancers++;
                }
            }
        }
        System.out.println(advancers);
    }
}

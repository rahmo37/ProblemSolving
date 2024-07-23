package CodeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class LineTrip {
    public static int minimumGas(int[] gasStationArr, int destination) {
        ArrayList<Integer> distanceArr = new ArrayList<>();
        for (int i = 0; i < gasStationArr.length; i++) {
            if (i == gasStationArr.length - 1) {
                distanceArr.add(Math.abs((gasStationArr[i] - destination) * 2));
            } else {
                distanceArr.add(Math.abs(gasStationArr[i] - gasStationArr[i + 1]));
            }
        }
        return Collections.max(distanceArr);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(reader.readLine());
        for (int i = 0; i < testCases; i++) {
            String secondLine = reader.readLine();
            int[] gasStationArr = new int[Integer.parseInt(secondLine.split(" ")[0]) + 1];
            int destination = Integer.parseInt(secondLine.split(" ")[1]);
            String lastLine = "0 " + reader.readLine();
            for (int j = 0; j < gasStationArr.length; j++) {
                gasStationArr[j] = Integer.parseInt(lastLine.split(" ")[j]);
            }
            System.out.println(minimumGas(gasStationArr, destination));
        }
    }
}

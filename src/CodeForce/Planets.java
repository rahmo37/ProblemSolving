package CodeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Planets {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numOfTestCase = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numOfTestCase; i++) {
            String[] firstLine = reader.readLine().split(" ");
            int numOfPlanets = Integer.parseInt(firstLine[0]);
            int costOfSecondMachineUse = Integer.parseInt(firstLine[1]);
            String[] orbitsOfThePlanets = reader.readLine().split(" ");
            System.out.println(returnMinimumTpu(numOfPlanets, costOfSecondMachineUse, orbitsOfThePlanets));
        }
    }

    public static int returnMinimumTpu(int numOfPlanets, int costOfSecondMachineUse, String[] orbitsOfThePlanets) {
        Map<Integer, Integer> orbitCounts = new HashMap<>();
        for (String orbit : orbitsOfThePlanets) {
            int orbitNum = Integer.parseInt(orbit);
            orbitCounts.put(orbitNum, orbitCounts.getOrDefault(orbitNum, 0) + 1);
        }

        int totalCost = 0;
        for (int count : orbitCounts.values()) {
            totalCost += Math.min(count, costOfSecondMachineUse);
        }
        return totalCost;
    }
}

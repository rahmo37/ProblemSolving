package CodeForce;


import java.util.*;

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int numOfCoins = Integer.parseInt(sc.nextLine());

        Comparator<String> comCoins = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(Integer.parseInt(s2), Integer.parseInt(s1));
            }
        };

        List<String> coinList = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));
        Collections.sort(coinList, comCoins);

        int totalSum = 0;
        for (String eachCoin : coinList) {
            totalSum += Integer.parseInt(eachCoin);
        }
        int strictlyLargeValue = (totalSum / 2) + 1;
        totalSum = 0;
        for(String eachCoin : coinList) {
            totalSum += Integer.parseInt(eachCoin);
            count++;
            if(totalSum >= strictlyLargeValue) {
                System.out.println(count);
                break;
            }
        }
    }
}

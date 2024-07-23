package MISCTools;

import java.util.HashMap;
import java.util.Map;

public class biggestWordWithMap {

    public static void main(String[] args) {
        int keyOfTheLargestWord = 0;
        int tempLength = Integer.MIN_VALUE;
        String[] strArr = "Current bill dite gese ashle ktha boilen".split(" ");
        Map<Integer, String> strMap = new HashMap<>();


        for (int i = 0; i < strArr.length; i++) {
            strMap.put(i, strArr[i]);
        }

        for(Map.Entry<Integer, String> eachEntry : strMap.entrySet()) {
            if(eachEntry.getValue().length() >= tempLength) {
                tempLength = eachEntry.getValue().length();
                keyOfTheLargestWord = eachEntry.getKey();
            }
        }
        System.out.println(strMap.get(keyOfTheLargestWord).length());
        System.out.println(strMap.get(keyOfTheLargestWord));
    }

}

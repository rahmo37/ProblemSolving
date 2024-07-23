package MISCTools;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfanArrayUsingGetOrDefault {

    public static void main(String[] args) {
//        Lets first demonstrate what getOrDefault method of Hashmap DS method does
        Map<Integer, String> exampleHashMap = new HashMap<>();
        exampleHashMap.put(1, "Obaedur Rahman");
        exampleHashMap.put(2, "Zarin Rafa");
        exampleHashMap.put(3, "Umme Roushan");
        exampleHashMap.put(4, "Mesbah Uddin");
        System.out.println(exampleHashMap.getOrDefault(5, "No Name Yet!"));

//      So what getOrDefault method does is it looks for value associated with the given key.
//      there are any then it returns that value, if there isn't it returns the default value

//      Now lets see how we can determine the frequency of the elements in an array
        int[] numArr = {1, 2, 2, 3, 3, 1, 4, 2, 12, 34, 12, 23, 1, 2, 21, 23, 4, 1, 3, 4};
        Map<Integer, Integer> frequencyHashMap = new HashMap<>();
        for (int i = 0; i < numArr.length; i++) {
//            if the value appeared for the first time, we are adding 1 to default value of 0,
//            if the value appeared before we are adding the 1 to the previous frequency
            frequencyHashMap.put(numArr[i], frequencyHashMap.getOrDefault(numArr[i], 0) + 1);
        }
        System.out.println(frequencyHashMap);
    }

}

package MISCTools;

import java.util.HashMap;
import java.util.Map;


// you can't iterate over a HashMap in Java exactly like you would with an array.
// Arrays have indexed elements, which makes it straightforward to iterate using a simple loop with an index.
// In contrast, HashMaps store key-value pairs and don't have indexed ordering.
//
//To iterate over a HashMap, you need to use methods like
// keySet(), values(), or entrySet() to get a collection view of the keys, values, or key-value pairs, respectively.
// Then you can iterate over these collections.

public class HashMapMethods {
    public static void main(String[] args) {
        HashMap<Integer, String> testMap = new HashMap<>();
        testMap.put(1, "Test1");
        testMap.put(2, "Test2");
        testMap.put(3, "Test3");
        testMap.put(4, "Test4");

        entrySetMethod(testMap);
        valuesMethod(testMap);
        keySetMethod(testMap);

    }

    public static void entrySetMethod(HashMap<Integer, String> testMap) {
//        Map.Entry in Java is an interface used as a way to represent a single key-value pair in a Map. Each Map.Entry contains two parts:
//        Key: The identifier used to store and retrieve the value.
//        Value: The data associated with the key.
//        When you use entrySet() on a Map, you get a set of Map.Entry objects, each representing one key-value pair in the map.
//-------------------
//        Each Map.Entry object in Java has getKey() and getValue() methods. These methods are used to access the key and the value of the entry, respectively.
//        getKey(): This method returns the key associated with the entry.
//        getValue(): This method returns the value associated with the key in the entry.

//        Getting Entry objects in each iteration since i'm using entry method
        for (Map.Entry<Integer, String> entry : testMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void valuesMethod(HashMap<Integer, String> testMap) {
//        Iterate Over the values of the hashmap
        for (String str : testMap.values()) {
            System.out.println(str);
        }
    }

    public static void keySetMethod(HashMap<Integer, String> testMap) {
        // Iterate Over the keys of the hashmap
        for (Integer num : testMap.keySet()) {
            System.out.println(num);
        }
    }
}

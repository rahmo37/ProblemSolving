package MISCTools.ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomePrimitiveCompareUsingComparator {
    public static void main(String[] args) {
//        At first lets say that we have some number elements in a list and we want to sort the list
//        How can we do it? we can easily achieve this using the collections.sort() method
        List<Integer> nums = new ArrayList<>();
        nums.add(49);
        nums.add(33);
        nums.add(24);
        nums.add(52);

//        Collections.sort(nums);

//        System.out.println(nums);
//      This is great, and it is sorting the values in ascending order. But how can we apply
//      our own logic while sorting. let's say that we want sort the numbers by their second
//      digit. How can we do this

//        Now if we want to apply our own logic we can use a comparator in the 2nd parameter
//        To the collections.sort method

//        Let's first create a comparator.
//        This is an integer comparator. Using an anonymous class, we are overriding the compare
//        method.
//        if i % 10 > j % 10, the comparator returns 1, and i will be considered greater than j for ordering purposes.
//        Otherwise, the comparator returns -1, and i will be considered less than j for ordering purposes.
//        Comparator<Integer> com = new Comparator<>() {

//            @Override
//            public int compare(Integer i, Integer j) {
//                System.out.print("i " + i);
//                System.out.println(" j " + j);
//                if (i % 10 > j % 10) {
//                    return 1;
//                } else {
//                    return -1;
//                }
//            }
//        };


//        We could also implement the lamda expression here to achieve the same thing
        Comparator<Integer> com = (i, j) -> i % 10 > j % 10 ? 1 : -1;

        Collections.sort(nums, com);
        System.out.println(nums);

    }
}

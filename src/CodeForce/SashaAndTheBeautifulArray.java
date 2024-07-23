package CodeForce;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class SashaAndTheBeautifulArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTestCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < noOfTestCases; i++) {
            int lengthOfArr = Integer.parseInt(sc.nextLine());
            String[] numArr = sc.nextLine().split(" ");
            System.out.println(sumOfArr(numArr));
        }
    }

    private static int sumOfArr(String[] arr) {
//        Arrays.sort(arr, new Comparator<String>() {...});:
//
//        Arrays.sort() is a method from the Java Arrays utility class that sorts the specified array into ascending order, according to the natural ordering of its elements or by a custom ordering defined by a Comparator.
//        The first parameter, arr, is the array of String objects you want to sort.
//                The second parameter is an anonymous class that implements the Comparator<String> interface, defining how two strings should be compared to determine their order.
//                new Comparator<String>() {...}:
//
//        This creates an instance of an anonymous class that implements the Comparator interface for the String type. The Comparator interface defines a single method, compare(), that is used to compare two objects to determine their ordering.
//        @Override public int compare(String s1, String s2):
//
//        This method overrides the compare method of the Comparator interface. It takes two String objects, s1 and s2, as parameters.
//                The purpose of this method is to define the criteria for comparing s1 and s2.
//        return Long.compare(Long.parseLong(s1), Long.parseLong(s2));:
//
//        Inside the compare method, s1 and s2 are converted from String to long using Long.parseLong(). This is necessary because the strings represent numeric values, and we want to sort them based on these numeric values rather than their lexicographical (alphabetical) order.
//                Long.compare(x, y) is a static method that compares two long values numerically and returns a value that indicates their relative order. It returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
//        The result of this comparison is returned from the compare method, which Arrays.sort() uses to determine the order of the elements in arr

//        When you use Arrays.sort() with a custom Comparator, the sorting algorithm will compare pairs of elements from the array to determine their order. The specific pairs of elements (s1 and s2) being compared depend on the progress and logic of the sorting algorithm (which can be a quicksort, mergesort, or any other algorithm, depending on the Java version and the specifics of the implementation). The sorting algorithm calls the compare() method of your Comparator multiple times, passing different pairs of elements from the array to it, to decide how to sort the entire array.
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Long.compare(Long.parseLong(s1), Long.parseLong(s2));
            }
        });
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]) - Integer.parseInt(arr[i - 1]);
        }
        return sum;
    }


}

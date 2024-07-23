package CodeForce;

// if n is divisible by 3 then, x = 1, y = 4, z = n - (x + y), because if n % 3 = 0, then (n - 3 (x = 1 , y = 2) ) % 3 = 0. Thats why we take y = 4
// if n is not divisible by 3 then, x = 1, y = 2, z = n - (x + y), because if, n % 3 = !0, then (n - 3 (x = 1 , y = 2) ) % 3 = !0.
// n <= 6 and n = 9, will return "NO"; because, it will either create distinct number issue or divisible by 3 issue

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfThree1886A {

    public static void sumOfThree(int n) {

//      Rakib Vai
        if (n <= 6 || n == 9) {
            System.out.println("NO");
            return;
        } else {
            System.out.println("YES");
        }
        int x = 1;
        int y = 0;
        int z = 0;
        if (n % 3 == 0) {
            y = 4;
        } else {
            y = 2;

        }
        z = n - (x + y);
        System.out.println(x + " " + y + " " + z);

//        System.out.println(arrayOfNonDivisibles);
//        Arnob
//        for (int i = 0; i < arrayOfNonDivisibles.size(); i++) {
//            for (int j = i + 1; j < arrayOfNonDivisibles.size(); j++) {
//                for (int k = j + 1; k < arrayOfNonDivisibles.size(); k++) {
//                    if ((arrayOfNonDivisibles.get(i) + arrayOfNonDivisibles.get(j) + arrayOfNonDivisibles.get(k)) == n) {
//                        System.out.println("YES");
//                        System.out.println(arrayOfNonDivisibles.get(i) + " " + arrayOfNonDivisibles.get(j) + " " + arrayOfNonDivisibles.get(k));
//                        return;
//                    }
//                }
//            }
//        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numOfInput = Integer.parseInt(reader.readLine());
        int[] inputArr = new int[numOfInput];
        int i = 0;
        while (i < numOfInput) {
            inputArr[i] = Integer.parseInt(reader.readLine());
            i++;
        }
        for (int j = 0; j < inputArr.length; j++) {
            sumOfThree(inputArr[j]);
        }
//        System.out.println(Arrays.toString(inputArr));
    }
}

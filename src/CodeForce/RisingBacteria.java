package CodeForce;


import java.util.Scanner;

public class RisingBacteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(countBacteria(x));
        scanner.close();
    }

// Since each bacterium divides itself every night, we need to determine how close one bacterium can get to x by doubling.
// For example, if x is 50, one bacterium can reach 32 before it exceeds x (32 is 2^5).
// This means we need to manually place more bacteria to cover the remaining difference.
// Another bacterium placed strategically can get us from 32 to 48 (adding 16, which is 2^4).
// Finally, we need a last bacterium to cover the remaining 2 to reach exactly 50.
// So, we need to add bacteria at positions corresponding to the binary representation of x.

// The binary representation of 50 is 110010.
// Each 1 in the binary representation indicates where we need to place a bacterium manually.
// To determine the positions of the 1s, we use the following algorithm.
// The number of 1s in the binary representation is the answer.

    public static int countBacteria(int x) {
        int count = 0; // Initialize the counter for the number of bacteria to place manually
        while (x > 0) {
            if (x % 2 == 1) { // Check if the least significant bit is 1
                count++; // Increment the counter if the bit is 1
            }
            System.out.println(" X = " + x); // Print the current value of x (for debugging or informational purposes)
            x /= 2; // Right shift x by dividing by 2 to check the next bit
        }
        return count; // Return the total number of 1s in the binary representation of x
    }
}

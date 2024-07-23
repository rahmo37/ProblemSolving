//        Truth Table

//        && AND
//        1 & 1 = 1 (Chips and salsa? Party time!)
//        1 & 0 = 0 (Just chips? Nah, too dry.)
//        0 & 1 = 0 (Just salsa? What do I dip?)
//        0 & 0 = 0 (Nothing? Guess I'll just dance.)

//        || OR
//        1 | 1 = 1 (Chips and salsa? Double happiness!)
//        1 | 0 = 1 (Just chips? Better than nothing!)
//        0 | 1 = 1 (Just salsa? Let's get creative.)
//        0 | 0 = 0 (Nothing again? Back to dancing.)

//        ^ XOR (Exclusive OR)
//        1 ^ 1 = 0 (Chips and salsa? Too much, can't decide!)
//        1 ^ 0 = 1 (Just chips? Awesome, I'll take it!)
//        0 ^ 1 = 1 (Just salsa? Perfect, let's be adventurous.)
//        0 ^ 0 = 0 (Neither? Looks like I'm sticking to just chatting.)

//        Left Shift, a << n = a * 2^n

package MISCTools;

public class BitWiseOperators {
    public static void main(String[] args) {
        byte a = -6;
        int b = 9;

        // Let's first look at AND
        int result = a & b;
        System.out.println(result);

        // Let's then look at OR
        result = a | b;
        System.out.println(result);

        // Let's then look at XOR
        result = a ^ b;
        System.out.println(result);

        // Let's explore left shift
        result = a << 3; // same as a * 2^3
        System.out.println(result);

        // Let's explore right shift
        result = a >> 1; // same as Math.floor(a / 2^Whatever the value of shift is)
        System.out.println(result);
    }
}

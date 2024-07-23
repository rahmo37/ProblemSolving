package LeetCode;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle(2147483647));

    }

    public static String convertToTitle(int columnNumber) {
        String[] letters = {
                "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y"
        };
        int LETTERLENGTH = letters.length;
        int cn = columnNumber;
        int remainder = 0;
        String result = "";
        while (cn != 0) {
            remainder = cn % LETTERLENGTH;
            result = letters[remainder] + result;
            cn = cn / LETTERLENGTH;
            if (remainder == 0) {
                cn = cn - 1;
            }
        }
        return result;
    }
//    Explanation for the 1
//    based index and cn - 1;
//    The line if (remainder == 0) { cn = cn - 1; } is there to handle the specific behavior of Excel column numbering, which is essentially a 1-based index system but behaves as if it were 0-based in some cases.
//
//    Here's an explanation:
//
//    Excel Column Numbering: In Excel, the columns are labeled "A", "B", ..., "Z", "AA", "AB", ..., "AZ", "BA", ..., etc. This can be thought of as a base-26 number system, but with letters.
//
//    Zero-Based Adjustment: In a typical base-26 system, you would have digits from 0 to 25. However, Excel's system is 1-based, meaning "A" is 1, not 0. This creates an off-by-one issue when converting a number to a column label.
//
//    Handling 'Z': When the remainder is 0, it means you have hit a boundary case like the end of a cycle. For example, in decimal, 1000 follows 999. In Excel's column system, "Z" (which is 26) should be followed by "AA" (which is 27). When you get a remainder of 0, you need to decrement the column number to adjust for the fact that you are effectively carrying over.
//
//    Here's a step-by-step breakdown with the decrement:
//
//    When cn % LETTERLENGTH == 0, it means you've completed a cycle, and you need to account for the carry-over.
//    Decrementing cn ensures the next iteration processes the higher order digit correctly.
//    Let's clarify with a small example, converting column number 52 to its Excel column label:
//
//    Column number = 52
//    LETTERLENGTH = 26
//    First Iteration:
//
//    remainder = 52 % 26 = 0
//    result = letters[0] + result = "Z"
//    cn = 52 / 26 = 2
//            if (remainder == 0) cn = cn - 1 => cn = 1
//    Second Iteration:
//
//    remainder = 1 % 26 = 1
//    result = letters[1] + result = "AZ"
//    cn = 1 / 26 = 0
//    The resulting column label is "AZ".
//
//    Without the decrement, you'd incorrectly calculate labels when remainders are 0.
//

//Another Algorithm
//    public String convertToTitle(int columnNumber) {
//        StringBuffer sb=new StringBuffer();
//
//        while(columnNumber>0){
//            columnNumber--;
//            sb.append((char)('A'+(columnNumber%26)));
//            columnNumber/=26;
//        }
//        return sb.reverse().toString();
//    }
}

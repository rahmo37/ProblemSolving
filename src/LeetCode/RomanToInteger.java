package LeetCode;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        int num = 0;
//        String s = "MCMXCIV";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                try {
                    if (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X') {
                        num += romanValues.get(s.charAt(i + 1)) - 1;
                        i++;
                    } else {
                        num += 1;
                    }
                } catch (Exception e) {
                    num += 1;
                }
            } else if (s.charAt(i) == 'V') {
                num += 5;
            } else if (s.charAt(i) == 'X') {
                try {
                    if (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C') {
                        num += romanValues.get(s.charAt(i + 1)) - 10;
                        i++;
                    } else {
                        num += 10;
                    }
                } catch (Exception e) {
                    num += 10;
                }
            } else if (s.charAt(i) == 'L') {
                num += 50;
            } else if (s.charAt(i) == 'C') {
                try {
                    if (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M') {
                        num += romanValues.get(s.charAt(i + 1)) - 100;
                        i++;
                    } else {
                        num += 100;
                    }
                } catch (Exception e) {
                    num += 100;
                }
            } else if (s.charAt(i) == 'D') {
                num += 500;
            } else {
                num += 1000;
            }

        }
        return num;
    }

}
//class Solution {
//    public int romanToInt(String s) {
//        int value=0,prev=0;
//        for(char ch: s.toCharArray())
//        {
//            switch(ch)
//            {
//                case 'I': value+=1;prev=1;break;
//                case 'V': value+=(prev==1)?3:5;prev=5;break;
//                case 'X': value+=(prev==1)?8:10;prev=10;break;
//                case 'L': value+=(prev==10)?30:50;prev=50;break;
//                case 'C': value+=(prev==10)?80:100;prev=100;break;
//                case 'D': value+=(prev==100)?300:500;prev=500;break;
//                case 'M': value+=(prev==100)?800:1000;prev=1000;break;
//            }
//        }
//        return value;
//    }
//}
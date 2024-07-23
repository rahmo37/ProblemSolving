package MISCTools;

public class StringClass {
    public static void main(String[] args) {
        String str = "HowAreYouTodayPleaseTellMe";
        String str2 = "Hello";
        int sz_before = 14;
        char[] charArr = str.toCharArray();
//        System.out.println(charArr.length);
//        System.out.println(Arrays.toString(charArr));
        System.out.println(new String(charArr, Math.max(0,sz_before - 10), Math.min(10,sz_before)));

    }
}

package CodeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrickyTemplate {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int noOfTestCases = Integer.parseInt(reader.readLine());

        for (int i = 0; i < noOfTestCases; i++) {
            int lenOfChar = Integer.parseInt(reader.readLine());
            String str1 = reader.readLine();
            String str2 = reader.readLine();
            String str3 = reader.readLine();
            System.out.println(templateFound(lenOfChar, str1, str2, str3));

        }
    }

    public static String templateFound(int len, String str1, String str2, String str3) {
        for(int i = 0; i < len; i++) {
            if(str1.charAt(i) == str2.charAt(i)) {
                if(str3.charAt(i) != str1.charAt(i)) {
                    return "YES";
                }
            }
            else if(str1.charAt(i) != str2.charAt(i)
                    && str3.charAt(i) != str1.charAt(i) && str3.charAt(i) != str2.charAt(i)) {
                return "YES";
            }
        }
        return "NO";
    }
}

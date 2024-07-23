package CodeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class UnattractivePairs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine().trim();

            Map<Character, Integer> freq = new HashMap<>();
            int maxFreq = 0;

            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
                maxFreq = Math.max(maxFreq, freq.get(ch));
            }

            if (maxFreq > n / 2) {
                System.out.println(n - (n - maxFreq) * 2);
            } else {
                System.out.println(n % 2);
            }
        }
    }
}

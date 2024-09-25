package CodeForce;

import java.util.*;

public class Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sNdn = sc.nextLine().split(" ");
        int s = Integer.parseInt(sNdn[0]);
        int n = Integer.parseInt(sNdn[1]);
        List<int[]> pairs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] xNdy = sc.nextLine().split(" ");
            int x = Integer.parseInt(xNdy[0]);
            int y = Integer.parseInt(xNdy[1]);
            pairs.add(new int[]{x, y});
        }
        Collections.sort(pairs, new Comparator<int[]>() {
                    @Override
                    public int compare(int[] pair1, int[] pair2) {
                        // Compare first elements only
                        return Integer.compare(pair1[0], pair2[0]);
                    }
                });
        for (int[] pair : pairs) {
            if(s > pair[0]) {
                s += pair[1];
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}

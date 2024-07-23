package DataStructureAndAlgorithms;

public class TimeComplexityOfAlgorithms {
    public static void main(String[] args) {
        double start = System.currentTimeMillis();
        TimeComplexityOfAlgorithms obj = new TimeComplexityOfAlgorithms();
        System.out.println(obj.findSum(99999));
        System.out.println("Time Taken - " + (System.currentTimeMillis() - start) + " millisecs.");
    }

    //    Algorithm 1
    public int findSum(int n) {
        return n * (n + 1) / 2;
    }

    //    Algorithm 2
//    public int findSum(int n) {
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        return sum;
//    }
}

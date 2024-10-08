
// Not my solution and not analyzed. PLease analyze the algorithm

package CodeForce;

// Don't place your source in a package


import javax.swing.*;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.util.stream.Stream;



// Please name your class Main
public class RemoveExtraOne {
    static FastScanner fs=new FastScanner();
    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        public String next() {
            while (!st.hasMoreElements())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }
        int Int() {
            return Integer.parseInt(next());
        }

        long Long() {
            return Long.parseLong(next());
        }

        String Str(){
            return next();
        }
    }


    public static void main (String[] args) throws java.lang.Exception {
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        //reading /writing file
        //Scanner sc=new Scanner(new File("input.txt"));
        //PrintWriter pr=new PrintWriter("output.txt");


        int T=1;
        for(int t=0;t<T;t++){
            int n=Int();
            int A[]=Arr(n);
            Solution sol=new Solution(out);
            sol.solution(A);
        }
        out.close();

    }




    public static int[] Arr(int n){
        int A[]=new int[n];
        for(int i=0;i<n;i++)A[i]=Int();
        return A;
    }
    public static int Int(){
        return fs.Int();
    }
    public static long Long(){
        return fs.Long();
    }
    public static String Str(){
        return fs.Str();
    }

}








class Solution {
    PrintWriter out;
    int INF = Integer.MAX_VALUE;
    int MOD = 1000000007;
    int mod = MOD;
    public Solution(PrintWriter out) {
        this.out = out;
    }




    public void solution(int A[]) {
        int arr[]=new int[A.length+2];
        Map<Integer,Integer>f=new HashMap<>();
        FenWick fen = new FenWick(arr);
        int mx = 0;
        int cnt = 0;
        int B[]=new int[A.length];
        //Arrays.fill(B,-1);
        for(int i = 0;i<A.length;i++){
            int sum =fen.sumRange(A[i]+1,arr.length-1);

            if(sum==0){
                cnt++;
            }
            else if(sum==1){
                B[i]=mx;
                if(!f.containsKey(mx))f.put(mx,0);
                f.put(mx,f.get(mx)+1);
            }
            else{
                B[i]=-1;
            }

            fen.update(A[i],1);
            mx=Math.max(mx,A[i]);
        }


        mx=0;int res=Integer.MAX_VALUE;

        for(int i = 0;i<A.length;i++){
            int a = 0;
            if(f.containsKey(A[i])){
                a=f.get(A[i]);
            }

            if(B[i]==0)a--;

            if(a+cnt>=mx){
                if(a+cnt>mx){
                    mx=a+cnt;res=A[i];
                }
                else{
                    res=Math.min(res,A[i]);
                }
            }

            if(f.containsKey(B[i])){
                f.put(B[i],f.get(B[i])-1);
            }
        }


        //System.out.println(Arrays.toString(B)+"  "+cnt);
        // System.out.println(mx);
        out.println(res);
    }
}


class FenWick {
    int tree[];//1-index based
    int A[];
    public FenWick(int[] A) {
        this.A=A;
        tree=new int[A.length+1];
        int sum=0;
    }

    public void update(int i, int val) {
        i++;
        while(i<tree.length){
            tree[i]+=val;
            i+=(i&-i);
        }
    }

    public int sumRange(int i, int j) {
        return pre(j+1)-pre(i);
    }

    public int pre(int i){
        int sum=0;
        while(i>0){
            sum+=tree[i];
            i-=(i&-i);
        }
        return sum;
    }
}

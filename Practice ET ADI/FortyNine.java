import java.util.*;
public class FortyNine {
    /*
    Climbing Stairs
    5
    8

    13
    377
     */
    public static int fib(int n){
        if(n==0 || n==1 || n==2)
            return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
        // int dp[]=new int[n];
        // if(n==1){
        //     System.out.println(1);
        //     return;
        // }
        // dp[0]=1;
        // dp[1]=2;
        // for(int i=2;i<n;i++){
        //     dp[i]=dp[i-1]+dp[i-2];
        // }
        // System.out.println(dp[n-1]);
        
    }
}

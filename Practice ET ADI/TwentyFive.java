import java.util.*;
/* 
ip:4
op:7

ip:14
op:3136

*/
public class TwentyFive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int dp[]=new int[d+1];
        dp[0]=1;
        if(d>=1)    
            dp[1]=1;
        if(d>=2)
            dp[2]=2;
        for(int i=3;i<=d;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }        
        System.out.println(dp[d]);
    }
}

import java.util.*;
public class FortySeven {
    /*
    Eggs Dropping Puzzle
    Input: k = 1, n = 2
    Output: 2

    Input: k = 2, n = 6
    Output: 3
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int dp[]=new int[k+1];
        int moves=0;
        while(dp[k]<n){
            moves++;
            for(int j=k;j>0;j--){
                dp[j]+=dp[j-1]+1;
            }
        }
        System.out.println(moves);
    }
}

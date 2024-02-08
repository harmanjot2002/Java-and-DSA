// package Practice;
/*
/*
input:
4 // Number of Items
1 1 // Item 1 weight and profit
3 4 // Item 2 weight and profit
4 5 // Item 3 weight and profit
5 7 // Item 4 weight and profit
7 // capacity of the bag
Sample Output 2
9 // Maximum possible profit


Sample Input 1
3 // Number of Items
2 10 // Item 1 weight and profit
3 5 // Item 2 weight and profit
5 15 // Item 3 weight and profit
8 // capacity of the bag
Sample Output 1
25 // Maximum possible profit
 */
 
import java.util.*;
public class Day1 {
    public static int maxProfit(int arr[][],int n,int w){
        int pro[]=new int[n];
        int wei[]=new int[n];
        for (int i = 0; i < n; i++) {
            wei[i]=arr[i][0];
            pro[i]=arr[i][1];
        }        
        int dp[][]=new int[n+1][w+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (wei[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } 
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], pro[i - 1] + dp[i - 1][j - wei[i - 1]]);
                }
            }
        }
        return dp[n][w];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        int w=sc.nextInt();
        System.out.println(maxProfit(arr,n,w));
    }
}

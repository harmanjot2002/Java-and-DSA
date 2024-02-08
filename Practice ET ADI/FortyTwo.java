import java.util.*;

/*
Sample Input 1
4
1 2 5 10
12
Sample Output 1
15
Sample Input 2
6
1 2 5 10 2 7
12
Sample Output 2
51
 */
class FortyTwo {
    static int coinChange(int[] coins, int amount) {
        int dp[][]=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            dp[i][0]=1;
        }
        for(int i=0;i<coins.length;i++){
            for(int j=1;j<=amount;j++){
                if(i==0)
                    dp[i][j]=j%coins[i]==0?1:0;
                else if(j<coins[i])
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j]+dp[i][j-coins[i]];
            }
        }
        return dp[coins.length-1][amount];
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] coins = new int[n];
        for (int i = 0; i<n; i++) {
            coins[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        System.out.println(coinChange(coins, target));
        scanner.close();
    }
}
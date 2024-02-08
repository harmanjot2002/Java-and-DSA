// package Practice;

import java.util.Scanner;

public class Four {
    public static int maxTotalProfit(int grid[][],int r, int c){
        int dp[][]=new int[r][c];
        dp[0][0]=grid[0][0];
        for(int i=1;i<r;i++){
            dp[i][0]=dp[i-1][0]+grid[i][0];
        }
        for(int j=1;j<c;j++){
            dp[0][j]=dp[0][j-1]+grid[0][j];
        }
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[r-1][c-1];
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] grid = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

       int result = maxTotalProfit(grid, R, C);
        System.out.println(result);

        /*
        3 4
        2 5 1 3
        3 7 2 8
        4 8 3 4
        
        29
         */
    }
}

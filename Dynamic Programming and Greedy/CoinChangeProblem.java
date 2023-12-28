public class CoinChangeProblem {
    public static int coinChange(int[] coins,int w){
        int arr[][]=new int[coins.length][w+1];
        for(int i=0;i<coins.length;i++){
            arr[i][0]=1;
        }
        for(int i=0;i<coins.length;i++){
            for(int j=1;j<=w;j++){
                if(i==0){
                    arr[i][j]=j%coins[i]==0?1:0;
                }
                else if(coins[i]>j){
                    arr[i][j]=arr[i-1][j];
                }
                else{
                    arr[i][j]=arr[i-1][j]+arr[i][j-coins[i]];
                }
            }
        }
        return arr[coins.length-1][w];
    }
    public static void main(String[] args) {
        int coins[]={2,3,5,10};
        int w=15;
        System.out.println(coinChange(coins,w)); //9
    }
}

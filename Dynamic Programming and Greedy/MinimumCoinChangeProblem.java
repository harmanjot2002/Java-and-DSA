public class MinimumCoinChangeProblem {
    public static int minCoinChange(int[] coins,int w){
        int arr[][]=new int[coins.length][w+1];
        for(int i=0;i<coins.length;i++){
            arr[i][0]=0;
        }
        for(int i=0;i<coins.length;i++){
            for(int j=1;j<=w;j++){
                if(i==0){
                    arr[i][j]=j%coins[i]==0?j/coins[i]:w+1;
                }
                else if(coins[i]>j){
                    arr[i][j]=arr[i-1][j];
                }
                else{
                    arr[i][j]=Math.min(arr[i-1][j],1+arr[i][j-coins[i]]);
                }
            }
        }
        return arr[coins.length-1][w]>w?-1:arr[coins.length-1][w];
    }
    public static void main(String[] args) {
        int coins[]={2,3,5,10};
        int w=15;
        System.out.println(minCoinChange(coins,w)); //2
    }
}

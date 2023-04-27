import java.util.*;
/*
 5 4                                 
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
1 5 9 13 17 18 14 10 6 2 3 7 11 15 19 20 16 12 8 4 
 */
class sineWave{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int i,j;
        int arr[][]=new int[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(j=0;j<n;j++){
            if(j%2==0){
                for(i=0;i<m;i++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(i=m-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
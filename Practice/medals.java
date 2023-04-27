import java.util.*;
/*
 3 2 1
12 1 10 10 4 5 5 12 18
10 6 5 12 4 1 18 1 8
22
 */
class medals{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[c][3];
        int i,j,k;
        for(i=0;i<c;i++){
            for(j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<c;i++){
            for(j=0;j<3;j++){
                k=sc.nextInt();
                arr[i][j]+=k;
            }
        }
        System.out.println(arr[n-1][m-1]);
    }
}
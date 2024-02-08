import java.util.*;
/*
Sample Input 1:
5
4 9 1 32 13
Sample Output 1:
3
Sample Input 2:
3
21 1 9
Sample Output 2:
8
 */

public class MinDiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }        
        Arrays.sort(arr);
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                mini=Math.min(mini,arr[j]-arr[i]);
            }
        }
        System.out.println(mini);
    }
}

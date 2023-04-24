import java.util.*;
/*
 15
2
5

15
3
-1
 */
class kThPrime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int i=2;
        int arr[]=new int[k];
        int j=0;
        while(n>1){
            if(n%i==0){
                arr[j]=i;
                j++;
                n=n/i;
            }
            else{
                i++;
            }
        }
        if(arr[k-1]!=0)
            System.out.println(arr[k-1]);
        else
            System.out.println(-1);
    }
}
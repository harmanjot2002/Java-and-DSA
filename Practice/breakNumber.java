import java.util.*;
/*
 5
23 45 12 67 89
2 3 4 5 1 2 6 7 8 9 
 */
class breakNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i=0;
        while(n>0){
            int rem,val=0;
            arr[i]=sc.nextInt();
            while(arr[i]>0){
                rem=arr[i]%10;
                val=(val*10)+rem;
                arr[i]/=10;
            }
            while(val>0){
                rem=val%10;
                val/=10;
                System.out.print(rem+" ");
            }
            n--;
        }
    }
}
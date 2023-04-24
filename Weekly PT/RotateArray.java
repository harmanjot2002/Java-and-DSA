import java.util.*;

class RotateArray{
    static void reverse(int arr[],int low,int high){
        int i,k, t;
        while(low<high){
            t=arr[low];
            arr[low]=arr[high];
            arr[high]=t;
            low++;
            high--;
        }
        // for(int i = 0;i<high;i++){
        //     a[i] += 1;
        //     // System.out.println(a[i]);
        // }
        // return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // Left Rotate
        /*
        5 
        2
        1 2 3 4 5
        3 4 5 1 2 
         */
        // reverse(arr,0,d-1);
        // reverse(arr,d,n-1);
        // reverse(arr,0,n-1);
        //Right Rotate
        /*
        5
        2
        1 2 3 4 5
        4 5 1 2 3 
         */
        reverse(arr,d+1,n-1);
        reverse(arr,0,d);
        reverse(arr,0,n-1);
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
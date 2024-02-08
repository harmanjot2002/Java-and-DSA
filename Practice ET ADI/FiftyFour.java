import java.util.*;

public class FiftyFour {
    /*
    Selection Sort
    5
    12 23 54 67 17
    [12, 23, 54, 67, 17]
    [12, 17, 54, 67, 23]
    [12, 17, 23, 67, 54]
    [12, 17, 23, 54, 67]
     */
    public static void selectionSort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int min_ind=i;
            for(int j=i+1;j<n;j++){
                if(arr[min_ind]>arr[j]){
                    min_ind=j;
                }
            }
            int temp=arr[min_ind];
            arr[min_ind]=arr[i];
            arr[i]=temp;
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selectionSort(arr,n);
    }
}

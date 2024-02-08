import java.util.*;

public class FiftyTwo {
    /*
    K-th largest element
    9
    3 2 3 1 2 4 5 5 6
    4
    op:4
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[n-k]);
    }
}

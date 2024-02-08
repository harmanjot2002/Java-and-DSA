import java.util.*;
/* 
5
-8 2 3 -6 10
2
Output:
-8 0 -6 -6
 */
public class Ten {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for (int i = 0; i <= n - k; i++) {
            int firstNegative = 0;
            for (int j = 0; j < k; j++) {
                if (arr[i + j] < 0) {
                    firstNegative = arr[i + j];
                    break;
                }
            }
            System.out.print(firstNegative + " ");
        }
    }
}

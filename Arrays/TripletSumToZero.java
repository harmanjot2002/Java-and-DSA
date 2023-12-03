import java.util.Arrays;
import java.util.Scanner;

public class TripletSumToZero {
    public static int findTripletSumToZero(int arr[]){
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int x=arr[i];
            int left=i+1;
            int right=n-1;
            while(left<right){
                int req=arr[left]+arr[right]+x;
                if(req==0){
                    return 1;
                }
                else if(req<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); //6
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); //1 2 3 -2 -1 -3
        }

        int result = findTripletSumToZero(arr);

        System.out.println(result);

        scanner.close();
    }

    // public static int findTripletSumToZero(int[] arr) {
    //     Arrays.sort(arr);

    //     for (int i = 0; i < arr.length - 2; i++) {
    //         int left = i + 1;
    //         int right = arr.length - 1;
    //         int x = arr[i];

    //         while (left < right) {
    //             if (x + arr[left] + arr[right] == 0) {
    //                 return 1; // Triplet found
    //             } else if (x + arr[left] + arr[right] < 0) {
    //                 left++;
    //             } else {
    //                 right--;
    //             }
    //         }
    //     }

    //     return 0; // No triplet found
    // }
}

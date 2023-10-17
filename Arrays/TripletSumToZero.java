import java.util.Arrays;
import java.util.Scanner;

public class TripletSumToZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = findTripletSumToZero(arr);

        System.out.println(result);

        scanner.close();
    }

    public static int findTripletSumToZero(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            int x = arr[i];

            while (left < right) {
                if (x + arr[left] + arr[right] == 0) {
                    return 1; // Triplet found
                } else if (x + arr[left] + arr[right] < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return 0; // No triplet found
    }
}

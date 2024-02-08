import java.util.PriorityQueue;
import java.util.Scanner;
/*
Sample Input 1:
10
5 3 2 10 12 9 11 17 21 15
Sample Output 1:
5 5 5 10 12 12 12 17 21 21
Sample Input 2:
7
5 9 11 13 9 11 10
Sample Output 2:
5 9 11 13 13 13 13
 */
public class MaxInContinuousStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] stream = new int[N];
        for (int i = 0; i < N; i++) {
            stream[i] = scanner.nextInt();
        }
        findMaxInStream(stream);
        scanner.close();
    }

    private static void findMaxInStream(int[] stream) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int i = 0; i < stream.length; i++) {
            maxHeap.offer(-stream[i]);
            System.out.print(-maxHeap.peek() + " ");
        }
    }
}

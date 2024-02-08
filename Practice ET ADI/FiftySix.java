import java.util.*;

public class FiftySix {
    /*
    Heapify
    5
    12 534 32 2 123
    op:[2, 12, 32, 534, 123]
     */
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            pq.offer(sc.nextInt());
        }
        System.out.print(pq);
    }
}

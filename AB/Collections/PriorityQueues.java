import java.util.*;

class PriorityQueues{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(98);
        pq.add(34);
        pq.add(53);
        pq.add(78);
        pq.add(41);
        System.out.println(pq); //[34, 41, 53, 98, 78]
        System.out.println(pq.peek()); //34
        System.out.println(pq); //[34, 41, 53, 98, 78]
        System.out.println(pq.poll()); //34
        System.out.println(pq); //[41, 53, 98, 78]
    }
}
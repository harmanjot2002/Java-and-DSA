// package Queues;
import java.util.*;

public class one {
    public static void main(String[] args) {
        // Queue<Integer> q=new Queue<>();//gives error because queue is abstract class and hence cannot be instantiated,so we can use ArrayDeque or LinkedList instead.
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.isEmpty());//false
        System.out.println(q.size());//5
        System.out.println(q); //[1, 2, 3, 4, 5]
        q.remove();
        System.out.println(q); //[2, 3, 4, 5]
        q.poll();
        System.out.println(q); //[3, 4, 5]
        System.out.println(q.element()); //3
        System.out.println(q.peek()); //3

        Queue<Integer> q2=new ArrayDeque<>();
        while(q.size()>0){
            System.out.print(q.peek()+" "); //3 4 5
            q2.add(q.poll());
        }
        while(q2.size()>0){
            q.add(q2.poll());
        }
    }
}

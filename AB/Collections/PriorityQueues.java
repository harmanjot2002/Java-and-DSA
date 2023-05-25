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

        System.out.println(pq.element()); //34
        System.out.println(pq.peek()); //34
        System.out.println(pq); //[34, 41, 53, 98, 78]
        
        System.out.println(pq.poll()); //34
        System.out.println(pq); //[41, 53, 98, 78]
        System.out.println(pq.remove()); //41
        System.out.println(pq); //[53, 78, 98]

        Iterator itr=pq.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next()); 
            /*
            53
            78
            98
            */ 
        }  

        System.out.println("Does the queue contain 3? " + pq.contains(3)); //false

        System.out.println("Size of queue: " + pq.size());  //3

        pq.clear();
        System.out.println(pq); //[]
        System.out.println("Size of queue: " + pq.size());  //0

        System.out.println("Is the queue empty? " + pq.isEmpty());  //true



        //Convert Priority Queue to a string representation
        PriorityQueue<String> pq1 = new PriorityQueue<String>();  
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Black");
        pq1.add("White");
        System.out.println("Original Priority Queue: "+pq1);
        String str1;
        str1 = pq1.toString();
        System.out.println("String representation of the Priority Queue: "+str1);  
    }
}
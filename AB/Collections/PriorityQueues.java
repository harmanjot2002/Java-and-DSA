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
        pq1.add("Red");
        System.out.println(Collections.frequency(pq1,"Red"));  //2
        System.out.println("Original Priority Queue: "+pq1);   //Original Priority Queue: [Black, Red, Green, White, Red]
        String str1;
        str1 = pq1.toString();
        System.out.println("String representation of the Priority Queue: "+str1);   //String representation of the Priority Queue: [Black, Red, Green, White, Red]



        //Write a Java program to change priorityQueue to maximum priority queue.
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        pq2.add(10);
        pq2.add(22);
        pq2.add(36);
        pq2.add(25);
        pq2.add(16);
        pq2.add(70);
        pq2.add(82);
        pq2.add(89);
        pq2.add(14);
        System.out.println("Original Priority Queue: "+pq2); //Original Priority Queue: [10, 14, 36, 16, 22, 70, 82, 89, 25]
        System.out.print("Maximum Priority Queue: ");
        Integer val = null;
        while( (val = pq2.poll()) != null) {
            System.out.print(val+"  "); //Maximum Priority Queue: 10  14  16  22  25  36  70  82  89
        }
        System.out.print("\n");
    }
}
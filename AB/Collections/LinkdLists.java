import java.util.*;

class LinkdLists{
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(2);
        ll.add(3);
        for(int i=2;i<5;i++){
            ll.add(i);
        }
        ll.addLast(40);
        ll.addFirst(27);
        ll.add(5,70);
        System.out.println(ll);  //[27, 2, 3, 2, 3, 70, 4, 40]
        
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);  //[2, 3, 3, 70 ,4]
        
        System.out.println(ll.size());  //5
        
        for (int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i) + " ");  //2 3 3 70 4

        System.out.println();
        Iterator itr=ll.listIterator(2);
        while(itr.hasNext())
            System.out.print(itr.next()); //3704

        System.out.println();
        ll.set(2,100);
        System.out.println(ll);  //[2, 3, 100, 70, 4]

        for (Integer i : ll)
            System.out.print(i + " "); //2 3 100 70 4

        System.out.println();
        System.out.println("Before sorting list:");
        System.out.println(ll);  //[2, 3, 100, 70, 4]
        Collections.sort(ll); 
        System.out.println("after sorting list:");
        System.out.println(ll); //[2, 3, 4, 70, 100]


        System.out.println("LinkedList: "+ ll); //LinkedList: [2, 3, 4, 70, 100]
        Object[] a = ll.toArray();
        System.out.print("After converted LinkedList to Array: ");
        for(Object o : a)
        System.out.print(o+" ");  //After converted LinkedList to Array: 2 3 4 70 100
    }
}
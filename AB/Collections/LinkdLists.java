import java.util.*;

class LinkdLists{
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(2);
        ll.add(3);
        for(int i=2;i<5;i++){
            ll.add(i);
        }
        ll.add(5,70);
        System.out.println(ll);  //[2, 3, 2, 3, 4, 70]
        
        ll.remove(3);
        System.out.println(ll);  //[2, 3, 2, 4 ,70]
        
        System.out.println(ll.size());  //5
        
        for (int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i) + " ");  //2 3 2 4 70

        System.out.println();
        Iterator itr=ll.iterator();
        while(itr.hasNext())
            System.out.print(itr.next()); //232470

        System.out.println();
        ll.set(2,100);
        System.out.println(ll);  //[2, 3, 100, 4, 70]
    }
}
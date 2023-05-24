import java.util.*;

class ArrLists{
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();

        al.add(2);
        al.add(3);
        for(int i=2;i<5;i++){
            al.add(i);
        }
        al.add(5,70);
        System.out.println(al);  //[2, 3, 2, 3, 4, 70]
        
        al.remove(3);
        System.out.println(al);  //[2, 3, 2, 4 ,70]
        
        System.out.println(al.size());  //5
        
        for (int i = 0; i < al.size(); i++)
            System.out.print(al.get(i) + " ");  //2 3 2 4 70

        System.out.println();
        Iterator itr=al.iterator();
        while(itr.hasNext())
            System.out.print(itr.next()); //232470

        System.out.println();
        al.set(2,100);
        System.out.println(al);  //[2, 3, 100, 4, 70]

        for (Integer i : al)
            System.out.print(i + " "); //2 3 100 4 70 

        System.out.println();
        System.out.println(al.get(3)); //4
        System.out.println("Before sorting list:");
        System.out.println(al); //[2, 3, 100, 4, 70]
        Collections.sort(al);
        System.out.println("after sorting list:");
        System.out.println(al); //[2, 3, 4, 70, 100]



        List<String> List1 = new ArrayList<String>();
        List1.add("1");
        List1.add("2");
        List1.add("3");
        List1.add("4");
        System.out.println("List1: " + List1); //List1: [1, 2, 3, 4]
        List<String> List2 = new ArrayList<String>();
        List2.add("A");
        List2.add("B");
        List2.add("C");
        List2.add("D");
        System.out.println("List2: " + List2); //List2: [A, B, C, D]
        // Copy List2 to List1
        Collections.copy(List1, List2);
        System.out.println("Copy List to List2,\nAfter copy:");
        System.out.println("List1: " + List1); //List1: [A, B, C, D]
        System.out.println("List2: " + List2); //List2: [A, B, C, D]
    }
}
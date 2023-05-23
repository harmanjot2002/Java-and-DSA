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
            System.out.print(itr.next());  //32470

        System.out.println();
        al.set(2,100);
        System.out.println(al);  //[2, 3, 100, 4, 70]
    }
}
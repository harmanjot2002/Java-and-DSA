import java.util.*;

class LinkedHashSets{
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add("D");
        System.out.println(lhs); //[A, B, C, D]
        
        lhs.add("A");
        lhs.add("E");
        System.out.println(lhs); //[A, B, C, D, E]

        System.out.println(lhs.size()); //5
       
        System.out.println(lhs); //[A, B, C, D, E]
        System.out.println(lhs.remove("D")); //true
        System.out.println(lhs.remove("Z")); //false
        System.out.println(lhs); //[A, B, C, E]
        
        System.out.println(lhs.contains("A")); //true
        System.out.println(lhs); //[A, B, C, E]
        
        Iterator itr=lhs.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" "); //A B C E
        }
        System.out.println();

        for(String s:lhs){
            System.out.print(s+" "); //A B C E
        }
        System.out.println();
    }
}
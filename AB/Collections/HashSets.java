import java.util.*;

class HashSets{
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("Canada");
        hs.add("India");
        hs.add("Australia");
        hs.add("South Africa");
        System.out.println(hs); //[Canada, South Africa, Australia, India]
        
        hs.add("India");
        System.out.println(hs); //[Canada, South Africa, Australia, India]
        
        System.out.println(hs.contains("India")); //true
        
        System.out.println(hs.remove("Australia")); //true
        System.out.println(hs.remove("America")); //false
        System.out.println(hs); //[Canada, South Africa, India]

        Iterator itr=hs.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
            //Canada South Africa India
        }

    }
}
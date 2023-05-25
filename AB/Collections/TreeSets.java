import java.util.*;

class TreeSets{
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>();
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");
        System.out.println(ts); //[For, Geek, Geeks]

        String check="Geek";
        System.out.println(ts.contains(check)); //true
        
        System.out.println(ts.first()); //For
        System.out.println(ts.last()); //Geeks

        String val="Geek";
        System.out.println(ts.higher(val)); //Geeks
        System.out.println(ts.lower(val)); //For

        ts.add("A");
        ts.add("B");
        ts.add("C");
        System.out.println(ts); //[A, B, C, For, Geek, Geeks] 
        ts.remove("B"); 
        System.out.println(ts); //[A, C, For, Geek, Geeks]

        ts.pollFirst();
        System.out.println(ts); //[C, For, Geek, Geeks]
        ts.pollLast();
        System.out.println(ts); //[C, For, Geek]

        for(String str:ts){
            System.out.print(str+" "); //C For Geek
        }
        System.out.println();

        Iterator it = ts.descendingIterator();
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
            /*
            Elements in Reverse Order:
            Geek
            For
            C
             */
        }
    }
}
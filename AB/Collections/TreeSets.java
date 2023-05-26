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



        TreeSet <Integer>tree_num = new TreeSet<Integer>();
        tree_num.add(10);
        tree_num.add(22);
        tree_num.add(36);
        tree_num.add(25);
        tree_num.add(16);
        tree_num.add(70);
        tree_num.add(86);
        tree_num.add(89);
        tree_num.add(14);
        System.out.println("Greater than or equal to 86 : "+tree_num.ceiling(86)); //89
        System.out.println("Greater than or equal to 29 : "+tree_num.ceiling(29)); //36
        System.out.println("Less than or equal to 86 : "+tree_num.floor(86)); //82
        System.out.println("Less than or equal to 29 : "+tree_num.floor(29)); //25
        System.out.println("Strictly greater than 86 : "+tree_num.higher(86)); //89
        System.out.println("Strictly greater than 89 : "+tree_num.higher(89)); //null
        System.out.println("Strictly less than 69 : "+tree_num.lower(69)); //36
        System.out.println("Strictly less than 12 : "+tree_num.lower(12)); //10



        //Write a Java program to find numbers less than 25 in a tree set.
        TreeSet<Integer> nts=new TreeSet<>(tree_num.headSet(25));
        Iterator itrs=nts.iterator();
        while(itrs.hasNext()){
            System.out.print(itrs.next()+" "); //10 14 16 22 
        }

        System.out.println();
        TreeSet<Integer> nnts=new TreeSet<>(tree_num.tailSet(25));
        Iterator itrss=nnts.iterator();
        while(itrss.hasNext()){
            System.out.print(itrss.next()+" "); //25 36 70 86 89
        }
    }
}
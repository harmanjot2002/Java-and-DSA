import java.util.*;

class TreeSets{
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>();
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");
        System.out.println(ts);

        String check="Geek";
        System.out.println(ts.contains(check));
        
        System.out.println(ts.first());
        System.out.println(ts.last());

        String val="Geek";
        System.out.println(ts.higher(val));
        System.out.println(ts.lower(val));

        ts.add("A");
        ts.add("B");
        ts.add("C");
        System.out.println(ts);
        ts.remove("B");
        System.out.println(ts);

        ts.pollFirst();
        System.out.println(ts);
        ts.pollLast();
        System.out.println(ts);

        for(String str:ts){
            System.out.print(str+" ");
        }
        System.out.println();

    }
}
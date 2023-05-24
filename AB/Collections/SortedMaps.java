import java.util.*;

class SortedMaps{
    public static void main(String[] args) {
        SortedMap<String,Integer> sm=new TreeMap<>();
        sm.put("A",1);
        sm.put("C",3);
        sm.put("B",2);
        System.out.println(sm); //{A=1, B=2, C=3}

        int val=sm.get("A");
        System.out.println(val); //1

        sm.remove("B");
        for (String key : sm.keySet()) {
            System.out.println("Key: " + key + ", Value: " + sm.get(key));
            /*
            Key: A, Value: 1
            Key: C, Value: 3
             */
        }
    }
}
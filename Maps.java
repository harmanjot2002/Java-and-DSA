import java.util.*;

public class Maps{
    public static void main(String[] args) {
        Map<String,Integer> mp=new HashMap<> ();
        mp.put("Akash",21);
        mp.put("Yash",16);
        mp.put("Lav",17);
        mp.put("Pishika",19);
        mp.put("Harry",18);
        System.out.println(mp.get("Yash")); //16
        System.out.println(mp.get("Rahul")); //null
        mp.put("Akash",25);
        System.out.println(mp.get("Akash"));//25
        System.out.println(mp.remove("Akash")); //25
        System.out.println(mp.get("Akash")); //null
        System.out.println(mp.containsKey("Akash")); //false
        System.out.println(mp.containsKey("Yash")); //true
    }
}
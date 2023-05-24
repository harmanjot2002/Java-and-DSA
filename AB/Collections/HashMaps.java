import java.util.*;

class HashMaps{
    public static void main(String[] args) {
        Map<String,Integer> hm=new HashMap<>();
        hm.put("vishal",10);
        hm.put("sachin",20);
        hm.put("vaibhav",30);

        System.out.println(hm.size()); //3

        System.out.println(hm); //{vaibhav=30, vishal=10, sachin=20}

        System.out.println(hm.get("vishal")); //10

        hm.remove("sachin");
        System.out.println(hm); //{vaibhav=30, vishal=10}

        System.out.println(hm.containsKey("Jim")); //false

        for(Map.Entry<String,Integer> e:hm.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
            /*
            vaibhav 30
            vishal 10
            sachin 20            
             */
        }

        if(hm.containsKey("vishal")){
            Integer a=hm.get("vishal");
            System.out.println(a); //10
        }
    }
}
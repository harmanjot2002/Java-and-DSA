import java.util.*;

class LinkedHashMaps{
    public static void main(String[] args) {
        LinkedHashMap<String,String> lhm=new LinkedHashMap<>();
        lhm.put("one","Raj");
        lhm.put("two","Raman");
        lhm.put("three","Shubham");
        System.out.println(lhm); //{one=Raj, two=Raman, three=Shubham}

        lhm.put("two", "For");
        System.out.println(lhm); //{one=Raj, two=For, three=Shubham}

        System.out.println(lhm.get("one")); //Raj
        System.out.println(lhm.size()); //3
        System.out.println(lhm.isEmpty()); //false
        System.out.println(lhm.containsKey("two")); //true
        System.out.println(lhm.containsValue("Raman")); //false
        System.out.println(lhm.remove("one")); //Raj
        System.out.println(lhm); //{two=Raman, three=Shubham}

        for(Map.Entry<String,String> ele:lhm.entrySet()){
            String key=ele.getKey();
            String value=ele.getValue();
            System.out.println(key+" "+value);
            /*
            two For
            three Shubham
             */
        }
    }
}
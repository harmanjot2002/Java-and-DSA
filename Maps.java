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
        mp.putIfAbsent("Yash",30);
        System.out.println(mp.keySet()); //[Lav, Yash, Harry, Pishika]
        System.out.println(mp.values()); //[17, 16, 18, 19]
        System.out.println(mp.entrySet()); //[Lav=17, Yash=16, Harry=18, Pishika=19]
        for(String key:mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
            /*
            Age of Lav is 17
            Age of Yash is 16
            Age of Harry is 18
            Age of Pishika is 19
            */
        }
        for(Map.Entry<String,Integer> e:mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        /*
        Age of Lav is 17
        Age of Yash is 16
        Age of Harry is 18
        Age of Pishika is 19
        */
        }
        for(var e:mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        /*
        Age of Lav is 17
        Age of Yash is 16
        Age of Harry is 18
        Age of Pishika is 19
        */
        }


        //Maximum Frequency Element in Array
        int arr[]={1,3,2,1,4,1};
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i:arr){
            if(!freq.containsKey(i)){
                freq.put(i,1);
            }
            else{
                freq.put(i,freq.get(i)+1);
            }
        }
        System.out.println("Frequnecy Map");
        System.out.println(freq.entrySet()); //[1=3, 2=1, 3=1, 4=1]
        int mxFreq=0;
        int ansKey=-1;
        for(var e:freq.entrySet()){
            if(e.getValue()>mxFreq){
                mxFreq=e.getValue();
                ansKey=e.getKey();
            }
        }
        System.out.println(ansKey+" "+mxFreq); //1 3

        /*
        Hashing:Converting any arbitrary sized key into a small sized(hashed key) via some hashing function is called hashing.
        Hash Functions can be of 2 types:
        1)Perfect Hash Function always produces unique output for every unique input.
        2)Non-Perfect Hash Function can produce same unique output for 2 different inputs.This is called Collisions.
        */


        //Valid Anagram
        
    }
}
import java.util.*;
/*
 Write a Java program that takes a string as input and counts the frequency of each word in the string. Return a collection (Map) where the keys are the unique words in the string, and the values are the corresponding frequencies. Implement this program using collections in Java.
 */
/*
I am a girl and I am studying
{I=2, a=1, am=2, and=1, girl=1, studying=1}
 */
class CfrequencyCounter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        TreeMap<String,Integer> hm=new TreeMap<>();
        
        String[] spl=str.split(" ");
        
        for(String s:spl){
            if(hm.containsKey(s)){
                hm.put(s,hm.get(s)+1);
            }
            else{
                hm.put(s,1);
            }
        }
        
        System.out.println(hm);
    }
}
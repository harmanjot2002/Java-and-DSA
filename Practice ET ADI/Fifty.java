import java.util.*;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Fifty {
    public static char maxFreq(String str){
        char ans=str.charAt(0);;
        Map<Character,Integer> hm=new HashMap<>();
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch, 1);
            }
        }
        for(var ele:hm.entrySet()){
            if(ele.getValue()>mx){
                mx=ele.getValue();
                ans=ele.getKey();
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(maxFreq(str));
    }
}

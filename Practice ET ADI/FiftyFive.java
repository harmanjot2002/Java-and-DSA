import java.util.*;

public class FiftyFive {
    /*
    Isomorphic:
    add
    egg
    true
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str2=sc.next();
        if (str.length() != str2.length()) {
            System.out.println(false);
            return;
        }
        HashMap<Character,Character> hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            char ch2=str2.charAt(i);
            if(hm.containsKey(ch)){
                if(hm.get(ch)!=ch2){
                    System.out.println(false);
                    return;
                }
            }
            else if(hm.containsValue(ch2)){
                System.out.println(false);
                return;
            }
            else{
                hm.put(ch,ch2);
            }
        }
        System.out.println(true);
    }
}
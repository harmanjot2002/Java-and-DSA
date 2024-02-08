import java.util.*;

public class FiftyOne {
    /*
    Pattern Matching:
    abbac
    cat bat bat cat rat
    true

    abba 
    cat bat bat rat
    false
     */
    public static boolean isMatch(String str, String inp){
        String words[]=inp.split(" ");
        if(str.length()!=words.length){
            return false;
        }
        
        Map<Character, String> hm1 = new HashMap<>();

        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            String st=words[i];
            if(hm1.containsKey(ch)){
                if(!hm1.get(ch).equals(st)){
                    return false;
                }
            }
            else if(hm1.containsValue(words[i])){
                    return false;
            }
            else{
                hm1.put(ch,words[i]);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        sc.nextLine();
        String inp=sc.nextLine();
        System.out.println(isMatch(str,inp));
    }
}

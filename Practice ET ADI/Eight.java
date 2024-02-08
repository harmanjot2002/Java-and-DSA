import java.util.*;
/*
Sample Input
qwertyqwertyqwerty

Sample Output
qwerty
 */
public class Eight {
    public static String crackPasscode(String str){
        int n=str.length();
        for(int len=n/2;len>0;len--){
            for(int i=0;i+len<=n;i++){
                String t=str.substring(i, i+len);
                if(str.startsWith(t) && str.endsWith(t))
                    return t;
            }
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String t=crackPasscode(str);
        if(t.isEmpty())
            System.out.println("Not so cool");
        else
            System.out.println(t);      
    }
}

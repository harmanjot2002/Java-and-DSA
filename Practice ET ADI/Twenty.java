import java.util.*;
/*
Sample Input 1
acb
Sample Output 1
a2c-1b


Sample Input 2
A12$
Sample Output 2
A-16112-14$
 */
public class Twenty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            if(i<str.length()-1){
                int diff=str.charAt(i+1)-str.charAt(i);
                sb.append(diff);
            }
        }
        System.out.println(sb.toString());       
    }
}

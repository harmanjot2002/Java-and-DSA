import java.util.*;
/*
Sample Input 1
digger
biggerdiagram
Sample Output 2
3
Sample Input 2
absolute
Itisabsentinthedrive
Sample Output 2
3
 */
public class ThirtyThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int cnt = 0;
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
                cnt++;
            }
            else   
                j++;
        }
        System.out.print(cnt);
    }
}

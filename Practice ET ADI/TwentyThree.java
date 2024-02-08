import java.util.*;
/*
Sample Input 1
abcg
Sample Output 1
badf

Sample Input 2
ABcdfg
Sample Output 2
BAdcgf
 */

public class TwentyThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(i%2==0)
                sb.append((char)(ch+1));
            else
                sb.append((char)(ch-1));
        }        
        System.out.println(sb.toString());
    }
}

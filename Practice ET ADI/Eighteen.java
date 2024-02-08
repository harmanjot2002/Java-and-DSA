import java.util.*;
/*
Sample Input 1
This is an academic paper discussing the importance of algorithms in computer science.
algorithms play a crucial role in various applications, including plagiarism detection. //
First input text (separated by space)
algorithm // Second input pattern that needs to be checked (case sensitive)

Sample Output 1
2
 */
public class Eighteen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2=sc.next();
        int cnt=0;
        int i=0;
        while(str.indexOf(str2,i)!=-1){
            i=str.indexOf(str2,i);
            if(i!=-1){
                cnt++;
            }
            i+=str2.length();
        }
        System.out.println(cnt);
    }
}

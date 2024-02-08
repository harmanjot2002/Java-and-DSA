import java.util.*;
/*
Sample Input 1
14
Sample Output 1
6

Sample Input 2
23
Sample Output 2
8
 */
public class TwentyTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        while(n>0){
            if(n%2==0){
                n=n/2;
                ans++;
            }
            else{
                n=n-1;
                ans++;
            }
        }
        System.out.println(ans);
    }
}

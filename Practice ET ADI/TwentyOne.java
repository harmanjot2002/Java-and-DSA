import java.util.*;
/*
Sample Input 1
6
Sample Output 1
true

Sample Input 2
34
Sample Output 2
false
 */
public class TwentyOne {
    public static boolean primeFactors(int n){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=2;i<=n;i++){
            while(n%i==0){
                hs.add(i);
                n=n/i;
            }
        }
        System.out.println(hs);
        for(int ele:hs){
            if(ele!=2 && ele!=3 && ele!=5){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(primeFactors(n));
    }
}

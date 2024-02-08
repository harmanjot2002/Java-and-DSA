import java.util.*;

public class FiftyThree {
    /*
    Prime Factors:
    100
    Sample Output 1
    2 2 5 5
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
    }
}

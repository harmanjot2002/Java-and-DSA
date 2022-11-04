import java.util.Scanner;

public class Lecture8{
    public static void main(String[] args) {
        //Count digits of given number.
        int n=123;
		int count = 0;
        while(n > 0) {
            count++;
            n /= 10;
        }
        System.out.println(count);

        // Find the sum of digits in a given number.
        int n1=123;
        int sum1 = 0;
        while(n1 > 0) {
            sum1 += (n1 % 10);
            n1 /= 10;
        }
        System.out.println(sum1);

        //Reverse the digits of a number.
        int n2=123;
        int ans2 = 0;
        while(n2 > 0) {
            int rewinder = n2 % 10;
            ans2 = ans2 * 10 + rewinder;
            n2 /= 10;
        }
        System.out.println(ans2);

        //Find the sum of the following series.
        //1 - 2 + 3 - 4 … n
        int n3=5;
        int ans3 = 0;
        for(int i = 1; i <= n3 ; i++) {
            if(i % 2 == 0) 
                ans3 -= i;
            else 
                ans3 += i;
        }
        System.out.println(ans3);

        // Given 2 numbers a and b. Find a raise to the power b.
        int a=3,b=5;
        int ans = 1;
        for(int i = 1; i <= b; i++) {
            ans *= a;
        }
        System.out.println(ans);

        // Print the nth factorial number.
        int n4=5;
        int fact = 1;
        for(int i = 1; i <= n4; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}

 
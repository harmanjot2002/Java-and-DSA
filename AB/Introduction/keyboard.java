import java.lang.*;
import java.util.*;

class keyboard{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Sum of 2 numbers
        /*
        int a,b,c;
        System.out.println("Enter 2 numbers ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println("Sum is "+c);
        */

        //Taking String as Input
        /*
        String name;
        System.out.println("Enter your name ");
        // name=sc.next();
        name=sc.nextLine();
        System.out.println("Hello "+name);
        */


        //Binary to Decimal using useRadix()
        sc.useRadix(2);
        int x=sc.nextInt();
        System.out.println(x);
    }
}
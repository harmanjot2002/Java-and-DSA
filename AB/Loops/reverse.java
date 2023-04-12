import java.util.*;
import java.lang.Math;

class reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            System.out.print(rem);
        }
    }
}
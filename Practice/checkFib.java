import java.util.*;

class checkFib{
    static boolean fib(int n){
        if(n==0)
            return true;
        int a=0;
        int b=1;
        int c=1;
        while(c<n){
            a=b;
            b=c;
            c=a+b;
        }
        if(c==n)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(fib(n))
            System.out.println(n+" is a fibonacci no.");
        else
            System.out.println(n+" is not a fibonacci no.");
    }
}
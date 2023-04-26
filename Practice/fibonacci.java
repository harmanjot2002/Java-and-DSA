import java.util.*;

class fibonacci{
    static void fib(int n){
        if(n==0 || n==1)
            System.out.print(n+" ");
        int a=0;
        int b=1;
        int c;
        for(int i=2;i<=n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fib(n);
    }
}
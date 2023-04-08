import java.util.Scanner;

public class Lecture10{
    public static void main(String[] args) {
        //Binary to Decimal
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int ans=0;
        int pw=1;
        while(n>0){
            int unitsDigit=n%10;
            ans+=pw*unitsDigit;
            n/=10;
            pw*=2;
        }
        System.out.println(ans);

        //Decimal to Binary
        int n1;
        n1=sc.nextInt();
        int ans1=0;
        int pw1=1;
        while(n1>0){
            int parity=n1%2;
            ans1+=pw1*parity;
            pw1*=10;
            n1/=2;
        }
        System.out.println(ans1);
    }
}
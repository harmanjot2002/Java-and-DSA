import java.util.*;

class SmithNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=SumOfDigits(n);
        int b=SumOfPrime(n);
        if(a==b){
            System.out.println("Smith Number");
        }
        else{
            System.out.println("Not Smith Number");
        }
    }
}
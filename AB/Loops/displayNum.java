import java.util.*;

class displayNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n=sc.nextInt();
        while(n>0){
            int rem=n%10;
            n=n/10;
            System.out.println(rem);
        }
    }
}
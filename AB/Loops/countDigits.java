import java.util.*;

class countDigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n=sc.nextInt();
        int cnt=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            cnt++;
        }
        System.out.println(cnt);
    }
}
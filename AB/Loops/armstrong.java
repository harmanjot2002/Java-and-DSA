import java.util.*;
import java.lang.Math;

class armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n=sc.nextInt();
        int x=n;
        int y=n;
        int cnt=0;
        int sum=0;
        while(x>0){
            int rem=x%10;
            x=x/10;
            cnt++;
        }
        while(y>0){
            int rem=y%10;
            sum+=(Math.pow(rem,cnt));
            y=y/10;
        }
        System.out.println(sum);
        if(sum==n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
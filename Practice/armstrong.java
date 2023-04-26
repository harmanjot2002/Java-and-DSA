import java.util.*;

class armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=n;
        int y=n;
        int cnt=0;
        int ans=0;
        while(x>0){
            int rem=x%10;
            x=x/10;
            cnt++;
        }
        // System.out.println(java.lang.Math.pow(2,3));
        while(y>0){
            int rem=y%10;
            y=y/10;
            ans+=(java.lang.Math.pow(rem,cnt));
        }
        if(ans==n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
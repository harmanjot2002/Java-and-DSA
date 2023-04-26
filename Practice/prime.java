import java.util.*;

class prime{
    static boolean prime(int n){
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                cnt++;
        }
        if(cnt==2)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(prime(n));           
    }
}
import java.util.*;

class prime{
    static boolean isPrime(int x){
        // int cnt=0;
        // for(int i=1;i<=x;i++){
        //     if(x%i==0){
        //         cnt++;
        //     }
        // }
        // if(cnt==2){
        //     return true;
        // }
        // else{
        //     return false;
        // }

        for(int i=2;i<x/2;i++){
            if(x%i==0)
                return false;
        }
        return true;   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPrime(n))
            System.out.println("Prime");
        else
            System.out.println("Not prime");
    }
}
import java.util.*;

class GCD{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int min,ans=0;
        if(n1<n2)
            min=n1;
        else
            min=n2;
        for(int i=1;i<=min;i++){
            if(n1%i==0 && n2%i==0){
                ans=i;
            }
        }
        System.out.println("GCD of "+n1+" and "+n2+" is "+ans);
    }
}
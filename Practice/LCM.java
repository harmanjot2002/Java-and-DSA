import java.util.*;

class LCM{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int max,ans=0;
        if(n1<n2)
            max=n2;
        else
            max=n1;
        for(int i=max;i<=n1*n2;i++){
            if(i%n1==0 && i%n2==0){
                ans=i;
                break;
            }
        }
        System.out.println("LCM of "+n1+" and "+n2+" is "+ans);
    }
}
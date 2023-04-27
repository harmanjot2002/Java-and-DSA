import java.util.*;

class farenheitToCelsius{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s,e,w;
        s=sc.nextInt();
        e=sc.nextInt();
        w=sc.nextInt();
        for(int i=s;i<=e;i+=w){
            int cel=((i-32)*5)/9;
            System.out.println(i+" "+cel);
        }
    }
}
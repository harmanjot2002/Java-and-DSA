import java.util.*;

class Area{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float area=0.0f;
        if(n==1){
            float r=sc.nextFloat();
            area=3.14f*r*r;
        }
        else if(n==2){
            float s=sc.nextFloat();
            area=s*s;
        }
        else if(n==3){
            float b=sc.nextFloat();
            float h=sc.nextFloat();
            area=0.5f*b*h;
        }
        else if(n==4){
            float l=sc.nextFloat();
            float b=sc.nextFloat();
            area=l*b;
        }
        System.out.printf("%.2f",area);
    }
}
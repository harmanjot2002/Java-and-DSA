import java.util.*;

class arithmetic{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         /* for integer values
        int a=14,b=5;
        
        int c=a/b;
        int r=a%b;
        
        System.out.println(c);
        System.out.println(r);*/
        
        
        
        /*for float values
        float a=14.3f,b=3.2f;
         
        float c=a/b;
        float r=a%b;
        
        System.out.println(c);
        System.out.println(r);*/
        
        
        
        /* for different data types
        byte a=10;
        short b=15;
        int c=a+b;
        
        float a=12.5f;
        long b=1231;
        float c=a*b;
        
        float a=12.5f;
        double b=123;
        double c=a*b;
        
        char a=40;
        int b=30;
        int c=a-b;
        System.out.println(c);
        */
        
        
        System.out.println((10+20)/2);
        System.out.println(10/(2*5));

        int a,b,c;
        double s,area;
        
        System.out.println("Enter 3 Sides of a Triangle");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        
        s=(a+b+c)/2f;
        
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        System.out.println("Area of Triangle is "+area);
        /*
        15
    1
    Enter 3 Sides of a Triangle
    5 6 7
    Area of Triangle is 14.696938456699069 
         */
    }
}
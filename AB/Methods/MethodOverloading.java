import java.lang.Math;

class MethodOverloading{
    public static int max(int a,int b){
        return a>b?a:b;
    }
    
    public static int max(int a,int b,int c){
        if(a>b && a>c) return a;
        else if(b>c) return b;
        return c;
    }

    public static void main(String[] args) {
        // Test t=new Test();
        System.out.println(max(10,5));
        System.out.println(max(10,15,5));
        System.out.println(Math.PI);
    }
}

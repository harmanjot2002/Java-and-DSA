import java.util.Scanner;

class Algebra{
    int a;
    int b;
    Algebra(int x,int y){
        System.out.println("Constructor called");
        a=x;
        b=y;
    }
    int add(){
        int ans=a+b;
        return ans;
    }
}

public class Lecture12{
    public static void main(String[] args) {
        //Non-Parametrized Constructors 
        //Algebra obj=new Algebra();
        // Scanner sc=new Scanner(System.in);
        // int x=sc.nextInt();
        // int y=sc.nextInt();
        // System.out.println("Sum of input numbers is");
        // int ans=obj.add(x,y);
        // System.out.println(ans);

        //Parametrized Constructors
        Algebra obj=new Algebra(5,7);
        int ans=obj.add();
        System.out.println(ans);

        //Standard Library Methods
        System.out.println(Math.sqrt(24));
        System.out.println(Math.floor(5.3));
        System.out.println(Math.ceil(5.3));

        

    }
}
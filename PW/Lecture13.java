import java.util.Scanner;

class Algebra{
    //Member variables:Class Level Scope(need to be declared inside class,but outside method)
    int a=5; 
    int b=10;
    int add(){
        return a+b; //15
    } 

    int sub(){
        //Method Level Scope(need to be declared inside method)
        int p=100;
        int q=200;
        return p-q; //-100
    }

    void demo(){
        //Block level scope(need to be declared inside {} curly brackets)
        int a1=50;
        System.out.println(a1); //50
        System.out.println(b1); //error
        {
            int b1=10;
            System.out.println(b1); //10
        }
        {
            int b1=20;
            System.out.println(b1); //20
        }
    }
}

public class Lecture13{
    public static void main(String[] args) {
        

    }
}
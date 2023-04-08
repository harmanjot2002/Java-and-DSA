import java.util.Scanner;

public class Lecture6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        
        //Ternary Operator:
        String ans;
        ans=(num % 2 == 0) ? "Even" : "Odd";
        System.out.println(ans);

        int age = sc.nextInt();
        if(age<=12){
            System.out.println("child");
        }
        else if(age>12 && age<18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Adult");
        }

        int course=2;
        switch(course){
            case 1:
                System.out.println("java");
            case 2:
                System.out.println("python");
            default:
                System.out.println("cpp");
        }
    }
}
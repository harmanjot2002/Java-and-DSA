import java.util.Scanner;

public class Lecture4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Entered name is "+name);

        System.out.println("Enter your number");
        int num_1=sc.nextInt();
        System.out.println("Entered number is "+num_1);

        //Add two numbers
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        System.out.println("Sum of two numbers is "+num1+num2);
        int sum=num1+num2;
        System.out.println("Sum of two numbers is "+sum);

        //Calculate simple interest
        System.out.println("Enter principle"); 
        float pri=sc.nextFloat();
        System.out.println("Enter rate");
        float rate=sc.nextFloat();
        System.out.println("Enter time");
        float time=sc.nextFloat();
        float simpleInterest=(pri*rate*time)/100;
        System.out.println("Simple interest is "+simpleInterest);

        //program to read characters using Scanner class
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);
        System.out.println("Character is "+ch);
        char c=sc.next().charAt(3);
        System.out.println("Character is "+c);
    }
}

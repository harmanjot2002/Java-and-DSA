import java.util.Scanner;

public class Assignments10{
    public static void main(String[] args) {
        //Lecture3

        //Q1 - Take 2 integer values in two variables x and y and print their product. (Easy)
        // Sample Input : x=2, y=4 (Both integers)
        // Sample Output : 8
        int x=2;
        int y=4;
        System.out.println(x+y);

        //Q2 - Print the ASCII value of character ‘U’. (Easy)
        // Sample Input : already mentioned as ‘U’
        // Sample Output : 85
        int u='U';
        System.out.println("The ascii value of U is : " + u);

        //Q3 - Write a Java program to take the length and breadth of a rectangle and print its area. (Easy)
        // Sample Input : 7, 4
        // Sample Output : 21
        int l=7;
        int b=4;
        int area=l*b;
        System.out.println("Area of recatngle is : "+area);

        //Q4 - Write a Java program to calculate the cube of a number. (Easy)
        // Sample Input : 4
        // Sample Output : 64
        // The sizeof(bool) : 1 bytes
        int c=4;
        int cube=c*c*c;
        System.out.println("Cube of number is : "+cube);

        // Q5 - Write a Java program to swap two numbers with the help of a third variable.
        // Sample Input : 2,3
        // Sample Output : 3,2
        int i=2;
        int j=3;
        int k;
        k=i;
        i=j;
        j=k;
        System.out.println("Output after swapping is : "+i+" "+k);

        //Lecture4

        //Q1 - Input name, roll number and field of interest from user and print in  the format below :
        // Name: xyz, Roll number: xyz, Field of interest: xyz
        // Input : Single line format
        // Aman Gupta 4053 Physics
        // Output :
        // Name: Aman Gupta
        // Roll Number: 4053
        // Field of interest: Physics
        Scanner scn = new Scanner(System.in);
        String first_name = scn.next();
        String last_name = scn.next();
        int roll_number = scn.nextInt();
        String field_of_interest = scn.next();
        System.out.println("Name: " + first_name + " " + last_name);
        System.out.println("Roll Number: " + roll_number);
        System.out.println("Field of interest: " + field_of_interest);

        // Q2 - Input two different string and print them in same line.
        // Input :
        // Level 
        // Up
        String str1=scn.next();
        String str2=scn.next();
        System.out.println(str1 + " " + str2);

        // Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of
        // 100), write a program to calculate his total marks and percentage marks.
        // Input :
        // 78
        // 89
        // 95
        // Output : Total marks: 262
        // Percentage marks: 87%
        System.out.println("Enter marks of three students :");
        int marks1=scn.nextInt();
        int marks2=scn.nextInt();
        int marks3=scn.nextInt();
        int total=marks1+marks2+marks3;
        int percentage=(total)/3;
        System.out.println("Total marks: "+ total);
        System.out.println("Percentage marks: "+ percentage +"%");

        // Q4 - Given two numbers, return their sum in the following format:
        // Int t representing number of test cases
        // T lines of Two integers representing the numbers to be added
        // Input :
        // 3
        // 4 5
        // 18 20
        // 49 27
        // Output :
        // 9
        // 38
        // 76
        int t = scn.nextInt();
        for(int v = 1; v <= t; v++){
            int q = scn.nextInt();
            int w = scn.nextInt();
            System.out.println(q+w);
        }

        // Q5 - Given few lines of input(number of lines unknown) where each line has two
        // strings, concatenate the strings.
        // Input :
        // Hello World
        // Happy Faces
        // Sunny Day
        // Good Morning
        // Output :
        //  LevelU
        // HappyFaces
        // SunnyDay
        // GoodMorning
        while(scn.hasNextLine()){
            String ab = scn.next();
            String ba = scn.next();
            System.out.println(ab+ba);
        }           
    }
}
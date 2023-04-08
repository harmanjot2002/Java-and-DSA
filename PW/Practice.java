import java.util.Scanner;

public class Practice{
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
        
        //Lecture5
        // Q1 - Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
        // is taken with 5 and then multiply the resultant value by 5. Display the final result.
        // Input: 2345
        // Output: 2
        int o = scn.nextInt();
        System.out.print((((o + 8) / 3) % 5) * 5);

        // Q2 - Swap two numbers without the use of third variable.
        // Input: 5 10
        // Output: 10 5
        System.out.println("Enter 1st number");
        int x1 = scn.nextInt();
        System.out.println("Enter 2nd number");
        int y1 = scn.nextInt();
        x1 = x1 + y1;
        y1 = x1 - y1;
        x1 = x1 - y1;
        System.out.println(x1);
        System.out.println(y1);

        // Q3 - Write a program to calculate the sum of the digits of a 3-digit number.
        // Input: 132
        // Output: 6
        int sum = 0;
        while(x > 0){
            sum += x % 10;
            x /= 10;
        }
        System.out.println(sum);

        // Q4 - Assign values of variables 'f' and 'g' as 55 and 70 respectively and then check if:
        // i) both the conditions 'f < 50' and 'f < g' are true.
        // ii) at least one of the conditions 'f < 50' or 'f < g' is true.
        int f = 55;
        int g = 70;
        System.out.print(f < 50 && f < g);

        // Q5 - Find the total number of bits needed to be flipped to convert x to y.
        // Input: 65 80
        // Output: 2
        // counting set bits
        // The idea is to take XOR of the given two integers. After calculating the XOR, the problem will reduce to  counting set bits in the XOR output using Brian Kernighan algorithm.
        int x2 = scn.nextInt();
        int y2 = scn.nextInt();
        int n1 = x2 ^ y2;
        int count1 = 0;
        while (n1 != 0){
            n1 = n1 & (n1 - 1);
            count1++;
        }
        System.out.print(count1);
    }
}
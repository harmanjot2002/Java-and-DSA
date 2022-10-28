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

    }
}
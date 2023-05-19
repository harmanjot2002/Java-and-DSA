/*
1. Write a Java program to reverse a given string.
2. Write a Java program to count the number of vowels in a given string.
3. Write a Java program to check if a given string is a palindrome or not.
4. Write a Java program to remove all white spaces from a given string.
5. Write a Java program to find the longest word in a given string.
6. Write a Java program to count the occurrence of a given character in a string.
7. Write a Java program to find all permutations of a given string.
8. WAP to accept a string and count the number of uppercase and lowercase and display the result.
9. WAP to accept a string and change all vowels with an asterisk and display the result.
10. WAP to accept a string and extract each character in reverse order and print in a new line.
11. WAP to handle NumberFormatException if a user enters a non-numeric value when prompting for an integer input.
12.WAP to handle InputMismatchException when a user enters an invalid data type when
prompting for a double input.
13. WAP to handle ArithmeticException when dividing a number by 0.
14. WAP to handle ArrayIndexOutOfBoundsException when accessing an index that is out of
bounds in an array.
15. Write a Java program that throws an exception if the user inputs a negative number. Handle the exception and display an error message.
16. WAP to accept two strings and check if they are anagrams or not.
17.WAP to accept a string(WORD) and display the same in alphabetical order and display the result.
18. WAP to accept a string(SENTENCE) and count number of spaces and words entered by the user and display the result.
19. WAP to accept a string(SENTENCE) and print each word in a new line and display the result.
20. WAP to accept a string and convert all `A’ to `AN’ and display the result .
 */

class ST2Practice{
    public static void main(String[] args) {
        String str="My name is Harman";
        /*
        String[] ch=str.split(" ");
        int max=0;
        String ans="";
        for(String i:ch){
            int l=i.length();
            if(max<l){
                max=l;
                ans=i;
            }
        }
        System.out.println(ans);   
        */
        
        String result = str.replaceAll("[AEIOUaeiou]", "*");
        System.out.print(result);
    }
}
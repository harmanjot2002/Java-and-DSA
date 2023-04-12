import java.util.*;
public class radixAndLeap {
    
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        //2400-Yes,1700-No
        /*
        int year=scan.nextInt();
        if((year%4==0) && (year%100!=0)){
            System.out.println("Yes");
        }
        else if(year%400==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        */  
    
    // Find Radix of a given number
    /*/
        String num;
        
        System.out.println("Enter a Number");
        num=scan.nextLine();
        
        if(num.matches("[01]+"))
        {
            System.out.println("Binary Radix=2");
        }
        else if(num.matches("[0-7]+"))            
        {
             System.out.println("Octal Radix=8");
               
        }
        else if(num.matches("[0-9]+"))            
        {
             System.out.println("Decimal Radix=10");
               
        }
        else if(num.matches("[0-9A-F]+"))            
        {
             System.out.println("Hexa Radix=16");
               
        }
        else
        {
            System.out.println("Not a Number");
        }
    */
    }   
}
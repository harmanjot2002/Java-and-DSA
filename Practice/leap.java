import java.util.*;

class leap{
    static void leap(int n){
        if(n%4==0 && n%100!=0)
            System.out.println("Leap Year");
        else if(n%400==0)
            System.out.println("Leap Year");
        else    
            System.out.println("Not leap year");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        leap(n);
    }
}
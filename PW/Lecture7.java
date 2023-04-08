import java.util.Scanner;

public class Lecture7{
    public static void main(String[] args) {
        //print 1 to n
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //Using While loop
        int num=1;
        while(num<=n){
            System.out.println(num);
            num++;
            if(num==5)
                break;
        }

        //Using For loop
        for(int num2=1;num2<=n;num2++){
            System.out.println(num2);
        }
        
        //For while loop
        int num3=20;
        do{
            System.out.println(num3);
            num3++;
        }
        while(num3<=10);

        //Print sum of stream of integers in input.
        int num4=sc.nextInt();
        int sum=0;
        while(num4!=-1){
            sum+=num4;
            num4=sc.nextInt();
        }
        System.out.println(sum);
    }
}
/*/
2
4
Smith Number
8
Not Smith Number
 */
import java.util.*;

class SmithNumber{
    static int SumOfDigits(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    } 
    static int SumOfPrime(int n){
        int i=2;
        int sum=0;
        while(n>1){
            if(n%i==0){
                sum+=SumOfDigits(i);
                n/=i;
            }
            else{
                i++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int a=SumOfDigits(n);
            int b=SumOfPrime(n);
            if(a==b)
                System.out.println("Smith Number");
            else
                System.out.println("Not Smith Number");
            t--;
        }
    }
}
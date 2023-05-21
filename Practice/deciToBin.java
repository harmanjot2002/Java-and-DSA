import java.util.*;
/*
 5
 101

100000000
101111101011110000100000000
 */
class deciToBin{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        /*
        String ans=Integer.toBinaryString(n);
        int answer=Integer.parseInt(ans);
        System.out.println(answer);
        */

        String bin = "";
        if(n == 0){
            bin = "0";
        }
        else {
            while(n > 0){
                bin = (n % 2) + bin;
                n = n / 2;
            }
        }
        System.out.println(bin);
    }
}
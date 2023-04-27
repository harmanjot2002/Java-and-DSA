import java.util.*;
/*
 5
 101
 */
class deciToBin{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans=Integer.toBinaryString(n);
        int answer=Integer.parseInt(ans);
        System.out.println(answer);
    }
}
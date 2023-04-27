import java.util.*;

/*
 101
 5
 */

class binToDeci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int ans=Integer.parseInt(str,2);
        System.out.println(ans);
    }
}
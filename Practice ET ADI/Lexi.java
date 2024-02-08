import java.util.*;
public class Lexi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n+1];
        for(int i=0;i<=n;i++){
            str[i]=Integer.toString(i);
        }
        Arrays.sort(str);
        for(int i=0;i<=n;i++){
            System.out.print(str[i]+" ");
        }
    }
}

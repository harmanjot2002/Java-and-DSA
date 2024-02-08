import java.util.*;
/*
Sample Input 1
1
100
Sample Output 1
9

Sample Input 2
23
900
Sample Output 2
7
 */
public class TwentyFour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        int cnt=0;
        for(int i=low;i<=high;i++){
            String str=Integer.toString(i);
            int len=str.length();
            if(len%2==0){
                int left=0;
                int right=0;
                for(int j=0;j<len/2;j++){
                    left+=str.charAt(j)-'0';
                    right+=str.charAt(len-j-1)-'0';
                }
                if(left==right)
                    cnt++;
            }
        }   
        System.out.println(cnt);   
    }
}

import java.util.*;
public class FortyEight {
    public static int cntSetBits(int n){
        String str=Integer.toBinaryString(n);
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n+1;i++){
            al.add(cntSetBits(i));
        }
        System.out.println(al);
    }
}

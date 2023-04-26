import java.util.*;

class table{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<=10;j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
        }
    }
}
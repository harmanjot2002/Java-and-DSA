
import java.util.*;

class circularArr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            ans[i]=0;
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=1;j<=3;j++){
                sum+=arr[(i+j)%n];
                ans[i]=sum;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]);
        }
    }
}
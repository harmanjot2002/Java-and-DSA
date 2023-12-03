import java.util.*;

public class CircularKadane {
    public static int normalMaxSum(int arr[],int n){
        // int res=arr[0];
        // int maxEnding=arr[0];
        // for(int i=1;i<n;i++){
        //     maxEnding=Math.max(arr[i],maxEnding+arr[i]);
        //     res=Math.max(res,maxEnding);
        // }
        // return res;
        int mx=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            mx=Math.max(sum,mx);
            if(sum<0){
                sum=0;
            }
        }
        return mx;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={8,-4,3,-5,4};
        int n=5;
        int max_normal=normalMaxSum(arr,n);
        if(max_normal<0)
            System.out.println(max_normal);
        int arr_sum=0;
        for(int i=0;i<n;i++){
            arr_sum+=arr[i];
            arr[i]=-arr[i]; //negate
        }
        int max_circular=arr_sum+normalMaxSum(arr,n);
        System.out.println(Math.max(max_normal,max_circular));
    }
}

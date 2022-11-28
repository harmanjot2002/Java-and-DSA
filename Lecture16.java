import java.util.Scanner;
public class Lecture16{
    public static int pairSum(int arr[],int target){
        int ans=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[]={4,7,3,21,6,5,5};
        System.out.println(pairSum(a,10));
    }
}
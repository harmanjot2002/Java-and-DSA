import java.util.*;

class AggressiveCows{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k,i;
        n=sc.nextInt();
        k=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        java.util.Arrays.sort(arr);
        int low=0;
        int high=arr[n-1];
        int mid;
        int best=0;
        while(low<=high){
            mid=(low+high+1)/2;
            int cnt=1,left=0;
            for(i=1;i<n && cnt<k;i++){
                if(arr[i]-arr[left]>=mid)
                    left=i;
                cnt++;
            }
            if(cnt>=k){
                best=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println(best);
    }
}
import java.util.*;
/*
 Input: arr[]={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}
Output: 6
 */
class water{
    static int max(int a,int b){
        if(a>b)
            return a;
        return b;
    }
    static int min(int a,int b){
        if(a<b)
            return a;
        return b;
    }
    static int volume(int arr[],int n){
        int lmax[]=new int[n];
        int rmax[]=new int[n];
        int res=0;
        lmax[0]=arr[0];
        for(int i=1;i<n;i++)
            lmax[i]=max(arr[i],lmax[i-1]);
        rmax[n-1]=arr[n-1];
        for(int i=n-2;i>0;i--)
            rmax[i]=max(rmax[i+1],arr[i]);
        for(int i=0;i<n;i++)
            res+=(min(lmax[i],rmax[i])-arr[i]);
        return res;
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int n=arr.length;
        int ans=volume(arr,n);
        System.out.println(ans);
    }
}
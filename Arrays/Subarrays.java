import java.util.*;

public class Subarrays {
    //Subarray with given sum
    public static boolean isSubarraySum(int arr[],int sum){
        int n=arr.length;
        int s=0;
        int curr_sum=arr[0];
        for(int i=1;i<n;i++){
            while(curr_sum>sum && s<i-1){
                curr_sum-=arr[s];
                s++;
            }
            if(curr_sum==sum){
                return true;
            }
            if(i<n){
                curr_sum+=arr[i];
            }
        }
        return (curr_sum==sum);
    }


    //Maximum Consecutive ones after flipping k zeroes
    public static int maxConsecutiveOnes(int arr[],int k){
        int ans=0;
        int flip=0;
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                flip++;
            }
            while(flip>k){
                if(arr[j]==0){
                    flip--;
                }
                j++;
            }
            ans=Math.max(ans,i-j+1);
        }
        return ans;
    }

    //Largest zero-sum subarray
    public static int maxZeroSumSubarray(int arr[]){
        int maxLen=0;
        int preSum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<arr.length;i++){
            preSum+=arr[i];
            if(hm.containsKey(preSum)){
                maxLen=Math.max(maxLen,i-hm.get(preSum));
            }
            else{
                hm.put(preSum,i);
            }
        }
        return maxLen;
    }

    //Longest consecutive sequence
    public static int longestConsecutiveSeq(int arr[]){
        int mx=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        for(int num:hs){
            if(!hs.contains(num-1)){
                int start=num;
                int curr=1;
                while(hs.contains(start+1)){
                    start++;
                    curr++;
                } 
                mx=Math.max(mx,curr);
            }
        }
        return mx;
    }

    //Longest k-sum subarray
    public static int longestKsumSubarray(int arr[],int k){
        int maxLen=0;
        int preSum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            preSum+=arr[i];
            int rem=preSum-k;
            if(preSum==k){
                maxLen=i+1;
            }
            else if(hm.containsKey(rem)){
                maxLen=Math.max(maxLen,i-hm.get(rem));
            }
            if(!hm.containsKey(preSum)){
                hm.put(preSum,i);
            }
        }
        return maxLen;
    }


    //Count of k-sum subarrays
    public static int countKsumSubarray(int arr[],int k){
        int cnt=0;
        int preSum=0;
        int n=arr.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<n;i++){
            preSum+=arr[i];
            int rem=preSum-k;
            if(hm.containsKey(rem)){
                cnt+=hm.get(rem);
            }
            if(hm.containsKey(preSum)){
                hm.put(preSum,hm.get(preSum)+1);
            }
            else{
                hm.put(preSum,1);
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        //Window sliding technique
        // int arr[]={1,8,30,-5,20,7};
        // int k=3;
        // int curr_sum=0;
        // for(int i=0;i<k;i++){
        //     curr_sum+=arr[i];
        // }
        // int mx_sum=curr_sum;
        // for(int i=k;i<arr.length;i++){
        //     curr_sum+=(arr[i]-arr[i-k]);
        //     mx_sum=Math.max(mx_sum,curr_sum);
        // }
        // System.out.println(mx_sum);


        //Kadane's Algorithm
        // int arr[]={1,8,30,-5,20,7};
        // int sum=0;
        // int mx=Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     sum+=arr[i];
        //     mx=Math.max(mx,sum);
        //     if(sum<0){
        //         sum=0;
        //     }
        // }
        // System.out.println(mx);


        //Subarray with given sum
        // int arr[]={1,4,20,3,10,5};
        // int sum=33;
        // System.out.println(isSubarraySum(arr, sum));

        //maximum consecutive ones after k flips
        // int arr[]={1,1,1,0,0,0,1,1,1,1,0};
        // int k=2;
        // System.out.println(maxConsecutiveOnes(arr,k));


        //Maximum zero-sum subarray
        // int arr[]={15,-2,2,-8,1,7,10};
        // System.out.println(maxZeroSumSubarray(arr));

        //Longest consecutice sequence
        // int arr[]={100,4,200,1,3,2};
        // System.out.println(longestConsecutiveSeq(arr)); //4


        //longest k-sum subarray
        // int arr[]={1,2,3,1,1,1,1};
        // int k=3;
        // System.out.println(longestKsumSubarray(arr,k)); //3


        //Count k-sum subarrays
        int arr[]={1,2,3};
        int k=3;
        System.out.println(countKsumSubarray(arr,k)); //2
    }
}

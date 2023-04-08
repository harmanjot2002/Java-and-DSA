import java.util.Scanner;
public class Lecture16{
    //Target Sum Problems
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

    public static int findTriplet(int[] a, int x) {
        int n = a.length;
        int count = 0;  
        for(int i=0;i<n;i++){   
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){ 
                    if(a[i]+a[j]+a[k]==x){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    //Array Manipulation Problems
    public static int findUnique(int[] a){
        int n = a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    a[i] = a[j] = -1;
                }
            }
        }
        for(int i=0;i<n;i++)
            if(a[i]>0)
                return a[i];
        return 1;
    }

    public static int secondLargestValue(int[] a) {
        int n = a.length;
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<a[i])
                max = a[i];
        }
        for(int i=0;i<n;i++){
            if(a[i]!=max){
                if(a[i]>smax)
                    smax = a[i];
            }
        }
        return smax;   
    }

    public static int firstRepeated(int[] a, int n) {
        for(int i = 0; i < n; i++){
            int curr = a[i];
            for(int j = i+1; j < n; j++) {
                if(a[j] == curr) 
                    return i+1;
            }
        }
        return -1;
    }

    //We have made all above methods static because static method(main) can call only static methods.
    public static void main(String[] args) {
        int a[]={4,7,3,21,6,5,5};
        System.out.println(pairSum(a,10));
        System.out.println(findTriplet(a,16));
        int b[]={21,7,3,21,5,7,5};
        System.out.println(findUnique(b));
        int c[]={3,4,5,2,1,7,8};
        System.out.println(secondLargestValue(c));
        int ans=firstRepeated(b,7 );
        System.out.println(ans);
    }
}
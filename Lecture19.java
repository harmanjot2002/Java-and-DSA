import java.util.Scanner;

public class Lecture19{
    //1.Given integers array 'a' ,return the prefix sum/running sum in same array without creating a new array.
    public int[] runningSum(int[] a) {
        for (int i = 1; i < a.length; ++i){
            a[i] += a[i - 1];
        }
        return a;
    }

    //2. Given an array of integers of size n. Answer q queries where you need to print the sum of values in a given range of indices from l to r (both included).
    //Note: The values of l and r in queries follow 1-based indexing.
    
    //3.Check if we can partitiom the array into 2 subarrays with equal sum.More formally,check that the prefix sum of a part is equal to the suffix sum of rest of the array.
    public static boolean check(int[] a) {
        int n = a.length;
        int pref = 0, total_sum = 0;
        for (int i = 0; i < n; i++) {
            total_sum += a[i];
        }
        for (int i = 0; i < n; i++) {
            pref += a[i];
            int suff = total_sum - pref;
            if (pref == suff) 
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a1={5, 4, 1, 2, 3};
        Lecture19 obj1 = new Lecture19();
        int[] ans1=obj1.runningSum(a1);
        for (int element: ans1) {
            System.out.print(element + " ");
        }

        System.out.println(" ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n+1];
        for (int i = 1; i <= n; i++) {
            a[i]=sc.nextInt();
        }
        // making a prefix sum array out of given array
        for (int i = 1; i <= n; i++) {
            a[i] += a[i - 1];
        }
        System.out.print("Enter no. of queries");
        int q = sc.nextInt();
        while (q>=0) {
            int l, r;
            l = sc.nextInt();
            r = sc.nextInt();
            // we need to find sum of values of indices from l to r (both included)
            // so that is equal to (total sum till r - total sum till l-1 )
            // note we also need to include the value at index l so subtracting only till (l-1)
            int ans = (a[r] - a[l-1]);
            System.out.println(ans);
            q--;
        }
        // 5
        // 5 1 2 3 4
        // 4
        // 1 1
        // 5
        // 1 3
        // 8
        // 4 5
        // 7
        // 1 5
        // 15

        int[] b={5, 2, 3,4};
        System.out.println(check(b));
    }
}
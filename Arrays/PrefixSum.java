// package Arrays;

public class PrefixSum {
    //1.Given integers array 'a' ,return the prefix sum/running sum in same array without creating a new array.
    public static int[] runningSum(int[] a) {
        for (int i = 1; i < a.length; ++i){
            a[i] += a[i - 1];
        }
        return a;
    }

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

    //4.Equillibrium Point
     public static int equiPoint(int[] a) {
        int n = a.length;
        int pref = 0, total_sum = 0;
        for (int i = 0; i < n; i++) {
            total_sum += a[i];
        }
        for (int i = 0; i < n; i++) {
            pref += a[i];
            int suff = total_sum - pref;
            if (pref == suff) 
                return a[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a1={5, 4, 1, 2, 3};
        int[] ans1=runningSum(a1);
        for (int element: ans1) {
            System.out.print(element + " "); //5 9 10 12 15 
        }

        System.out.println();
        int[] b={5, 2, 3,2,2};
        System.out.println(check(b)); //true

        System.out.println(equiPoint(b)); //2
    }
}

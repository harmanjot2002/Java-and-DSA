import java.util.Scanner;

public class Lecture18{
    //1.Sort 0 and 1
    public static void sortZeroesAndOne(int[] a){
        int n = a.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (a[i] == 1 && a[j] == 0) {
                a[i] = 0;
                a[j] = 1;
                i++;
                j--;
            }
            if (a[i] == 0) 
                i++;
            if (a[j] == 1) 
                j--;
        }
    }

    //2.Move even valued integers at start of array
    public static int[] sortArrayByParity(int[] a) {
        int i = 0, j = a.length-1;
        while(i < j) {
            if(a[i] % 2 == 1 && a[j] % 2 == 0) {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
            if(a[i] % 2 == 0) 
                i++;
            if(a[j] % 2 == 1) 
                j--;
        }
        return a;
    }

    //3.Given an integer array 'a' sorted in non-decreasing order,return an array of square of each number sorted in non-decreasing order.
    public int[] sortedSquares(int[] a) {
        int n = a.length, i = 0, j = n-1, k = 0;
        int[] ans = new int[n];
        while(i <= j) {
            if(Math.abs(a[i]) < Math.abs(a[j])) {
                a[j] *= a[j];
                ans[k++] = (a[j--]);
            }
            else {
                a[i] *= a[i];
                ans[k++] = (a[i++]);
            }
        }
        reverse(ans, 0, ans.length - 1);
        return ans;
    }   
    private void reverse(int[] a, int i, int j){
       int temp = 0;
       while(i < j){
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
       }
    }

    public static void main(String[] args) {
        int[] a={0,1,1,0,1,1,0};
        sortZeroesAndOne(a);
        for (int element: a) {
            System.out.print(element +" ");
        }   

        System.out.println(" ");
        int[] b={1,2,3,4,5};
        int[] ans=sortArrayByParity(b);
        for (int element: ans) {
            System.out.print(element + " ");
        }

        System.out.println(" ");
        int[] c={-10,-3,2,5,6};
        Lecture18 obj1 = new Lecture18();
        int[] ans2=obj1.sortedSquares(c);
        for (int element: ans2) {
            System.out.print(element + " ");
        }
    }
}
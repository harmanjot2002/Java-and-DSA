import java.util.Scanner;

public class Lecture17{
    //1.Swap using Temporary Variable
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value after swapping");
        System.out.println("Value of a is " + a + " and Value of b is " + b);
    }

    //2.Swap using sum and difference
    public static void swapUsingSumDiff(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Value after swapping");
        System.out.println("Value of a is " + a+ " and Value of b is " + b);
    }

    //3.Reverse an array
    public static void reverse(int[] a, int n){
        int tmp = 0;
        int i = 0, j = n-1;
        while(i < j){
            tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            i++;
            j--;
        }
    }

    //4.Rotate the array by k steps
    public static void rotate(int[] a, int k) {
        int n = a.length;
        k %= n; // k can be greater than n
        int[] ans = new int[n];
        for(int i = n-k; i <= n-1; i++) {
            ans[i-(n-k)] = a[i];
        }
        for(int i = 0; i < n-k; i++) {
            ans[i+k] = a[i];
        }
        for(int i = 0; i < n; i++) {
            a[i] = ans[i];
        }
    }

    //5.Rotate array by k steps without extra space
    public static void rotateWithoutSpace(int[] a, int k) {
        k %= a.length;
        reverse(a, 0, a.length - 1);
        reverse(a, 0, k - 1);
        reverse(a, k, a.length - 1);
    }
    private static void reverse(int[] a, int i, int j){
        int tmp = 0;
        while(i < j){
            tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            i++;
            j--;
        }
    }

    //6.Check if no. is present in array or not
    static int[] makeFrequencyArray(int[] a1){
        int[] freq=new int[100004];
        for(int i=0;i<a1.length;i++){
            freq[a1[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        swap(10,5);

        swapUsingSumDiff(10,5);
        
        int a[]={1,2,3,4,5};
        System.out.println("Original array ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        int n=a.length;
        reverse(a,n);
        System.out.println("Reversed array ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println("");
        int k=2;
        rotate(a,k);
        System.out.println("Rotated array ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
        System.out.println("");
        rotateWithoutSpace(a,k);
        System.out.println("Rotated array ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
     
        System.out.println("");
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter a1 size ");     
        int n1=sc.nextInt();   
        int[] a1 = new int[n1];   
        System.out.println("Enter "+n+" elements");
        for (int i = 0; i < n1; i++) {   
            a1[i]=sc.nextInt();
        }   
        int[] freq=makeFrequencyArray(a1);
        System.out.print("No. of queries ");
        int q = sc.nextInt();   
        while (q > 0){
            System.out.print("Enter number to be searched ");   
            int x= sc.nextInt();
            if (freq[x] > 0) {
                System.out.println("YES");
            } 
            else{
                System.out.println("NO");
            }
            q--;
        }   
    }
}
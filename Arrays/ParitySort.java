package Arrays;

public class ParitySort {
    //Move even valued integers at start of array
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
    public static void main(String[] args) {
        int[] b={1,2,3,4,5};
        int[] ans=sortArrayByParity(b);
        for (int element: ans) {
            System.out.print(element + " "); //4 2 3 1 5
        }
    }
}

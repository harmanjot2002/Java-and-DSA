import java.util.Scanner;

public class Lecture15{

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n=sc.nextInt(); //5
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt(); //5 6 7 8 9
        }
        printArray(arr); //5 6 7 8 9

        //Copy elements of arr to arr2
        int[] arr2=arr;
        printArray(arr2); //5 6 7 8 9

        //Changing values of arr2
        arr2[0]=0;
        arr2[1]=3;
        printArray(arr); //0 3 7 8 9
        printArray(arr2); //0 3 7 8 9

        //Even if we are changing elements of arr2 here,it also changes values of arr because here only copy f reference is made,not of whole memory.
    }
}
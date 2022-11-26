import java.util.Scanner;

public class Lecture15{

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void changeArray(int[] arr3){
        for(int i=0;i<arr3.length;i++){
            arr3[i]=0;
        }
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
        //Even if we are changing elements of arr2 here,it also changes values of arr because here only copy of reference is made,not of whole memory.
        //This is called "Shallow Copy".


        //Checking pass by value in arrays
        //In integers,there was only pass by value since nothing was made in heap,but in arrays copy of array will only be formed because of pass by value in Java,but it changes value in addresses in heap where arrays is stored,once that method is executed it deletes new array from stack as stack doesn't store anything in itself forever,it gets deleted once its executed.
        int[] arr3=new int[3];
        arr3[0]=5;
        arr3[1]=6;
        arr3[2]=7;
        changeArray(arr3);
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
    }
}
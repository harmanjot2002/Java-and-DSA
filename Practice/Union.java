/*
 Given two arrays A and B of size N and M respectively. The task is to find the number
of elements in the union between these two arrays.
Note - Union of the two arrays can be defined as the set containing distinct elements from both
the arrays. If there are repetitions, then only one occurrence of the element should be printed
in the union.
Input Format
The first line contains two integers N and M denoting the size of two arrays A and B.
The second line contains the array elements of A as A_1,A_2,...,A_N-1.
The third line contains the array elements of B as B_1,B_2,...B_N-1.
Output format
Print the number of elements in the union between these two arrays A and B.
Constraints
1<=N,M<=100
0<=A_i,B_i<=100
Time Limit
1 second
Example
Sample Input
5 3
1 2 3 4 5
1 2 3
Sample Output
5
Sample test case explanation
1, 2, 3, 4 and 5 are the elements which come in the union set of both arrays. So the count is 5.

Input
10 4
66 87 99 85 50 93 98
84 14 47
44 83 88 20
Output
14
 */

import java.util.*;

class Union{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of elements in both arrays:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[m];
        int arr2[]=new int[n];
        System.out.println("Enter elements of first array:");
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            arr2[j]=sc.nextInt();
        }
        int arr3[]=new int[m+n];
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(arr[i]<arr2[j]){
                // System.out.print(arr[i]+" ");
                arr3[k]=arr[i];
                k++;
                i++;
            }
            else{
                // System.out.print(arr2[j]+" ");
                arr3[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<m){
            // System.out.print(arr[i]+" ");
            arr3[k]=arr[i];
            k++;
            i++;
        }
        while(j<n){
            // System.out.print(arr2[j]+" ");
            arr3[k]=arr2[j];
            k++;
            j++;
        }
        int cnt=1;
        for(int l=1;l<arr3.length;l++){
            if(arr3[l]!=arr3[l-1])
                cnt++;
        }
        System.out.println(cnt);
    }
}
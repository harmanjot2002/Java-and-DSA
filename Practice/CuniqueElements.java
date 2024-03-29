import java.util.*;
/*
 Write a Java program that takes an array of integers as input and returns a collection (Set) containing only the unique elements from the input array. Implement this program using collections in Java.
 */
/*
6
4 7 3 4 0 2
[0, 2, 3, 4, 7]
*/
class CuniqueElements{
    public static Set<Integer> unique(int n,int arr[]){
        Set<Integer> s=new HashSet<>();
        for(int j:arr){
            s.add(j);
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println(unique(n,arr));
    }
}
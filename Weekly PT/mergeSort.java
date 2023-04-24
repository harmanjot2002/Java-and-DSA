import java.util.*;
/*
4 5
1 3 5 7
2 4 6 8 10
1 2 3 4 5 6 7 8 10 
 */
class mergeSort{
    static void merge(int arr[],int arr2[],int m,int n){
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(arr[i]<arr2[j]){
                System.out.print(arr[i]+" ");
                i++;
            }
            else{
                System.out.print(arr2[j]+" ");
                j++;
            }
        }
        while(i<m){
            System.out.print(arr[i]+" ");
            i++;
        }
        while(j<n){
            System.out.print(arr2[j]+" ");
            j++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j;
        m=sc.nextInt();
        n=sc.nextInt();
        int arr[]=new int[m];
        int arr2[]=new int[n];
        for(i=0;i<m;i++)
            arr[i]=sc.nextInt();
        for(i=0;i<n;i++)
            arr2[i]=sc.nextInt();
        merge(arr,arr2,m,n);
        
    }
}
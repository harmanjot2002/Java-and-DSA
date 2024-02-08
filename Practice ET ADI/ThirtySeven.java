import java.util.*;
public class ThirtySeven {
    /*
    Inorder Successor in BST
    Sample Input 1
    5
    50 30 70 20 40
    30

    Sample Output 1
    40
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]==k){
                System.out.println(arr[i+1]);
                return;
            }
        }
        System.out.println("No inorder successor found");
    }
}

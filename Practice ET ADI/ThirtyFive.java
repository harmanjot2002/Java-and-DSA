import java.util.*;
/*
Sample Input 1
5
1 2 3 4 5
15
Sample Output 1
true

Sample Input 2
7

3 6 1 4 7 2 9
11
Sample Output 2
false
 */
public class ThirtyFive {
    public static class Node{
        int key;
        Node left;
        Node right;
        Node(int k){
            key=k;
            left=right=null;
        }
    }
    public static Node insert(Node root,int key){
        if(root==null)
            return new Node(key);
        if(key<root.key)
            root.left=insert(root.left,key);
        else if(key>root.key)
            root.right=insert(root.right, key);
        return root;
    }
    public static boolean isPathSum(Node root,int k){
        if(root==null)
            return false;
        if(root.key==k && root.left==null && root.right==null)
            return true;
        return isPathSum(root.left,k-root.key) || isPathSum(root.right, k-root.key);  
    } 

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        Node root=null;
        for(int i=0;i<n;i++){
            root=insert(root,sc.nextInt());
        }
        int target=sc.nextInt();
        System.out.println(isPathSum(root, target));
    }
}

import java.util.*;
public class Two {
    /*
    Input:
    5 // number of nodes
    30 20 40 10 50 // values of nodes to be inserted
    Output: 
    30 20 10 40 50
     */
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            left=right=null;
            this.data=data;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null)
            return new Node(val);
        if(root.data<val)
            root.right=insert(root.right, val);
        else if(root.data>val)
            root.left=insert(root.left,val);
        return root;
    }
    public static void preorder(Node root){
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int arr[]=new int[n];
        Node root=null;
        for(int i=0;i<n;i++){
            // arr[i]=sc.nextInt();
            root=insert(root,sc.nextInt());
        }
        preorder(root);
    }
}

import java.util.*;
/*
5
3 17 35 27 8
3
17
8
27
 */
public class LeftRight {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    public static Node insert(Node root,int d){
        if(root==null)
            return new Node(d);
        if(d<root.data)
            root.left=insert(root.left, d);
        else if(d>root.data)
            root.right=insert(root.right, d);
        return root;
    }
    public static void leftView(Node root){
        if(root==null)
            return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int cnt=q.size();
            for(int i=0;i<cnt;i++){
                Node curr=q.peek();
                q.remove();
                // if(i==cnt-1)
                    System.out.println(curr.data);
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
    }
    public static void kThlevelPrint(Node root,int k){
        if(root==null)
            return;
        if(k==0)
            System.out.println(root.data);
        else{
            kThlevelPrint(root.left, k-1);
            kThlevelPrint(root.right, k-1);
        }
    }
    public static int lca(Node root,int n1,int n2){
        /*
        Sample Input 1:
        9
        8 3 10 1 6 4 7 13 14
        3 14
        Sample Output 1:
        8
        Sample Input 2:
        8
        8 3 10 1 6 4 7 13
        14 12
        Sample Output 2:
        -1
         */
        if (root==null)
            return -1;
        if (n1 <= root.data && n2 >= root.data)
            return root.data;
        else if(n1 < root.data && n2 < root.data)
            return lca(root.left, n1, n2);
        else if(n1 > root.data && n2 > root.data)
            return lca(root.right, n1, n2);
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node root=null;
        for(int i=0;i<n;i++){
            root=insert(root,sc.nextInt());
        }
        // leftView(root);
        // kThlevelPrint(root, 2);
        int p=sc.nextInt();
        int q=sc.nextInt();
        System.out.println(lca(root, p, q));
    }
}

import java.util.*;
/*
Sample Input 1
6 2 8 0 4 7 9 3 5 // (Integer Array)
2 // (Value of P)
8 // value of q
Sample Output 1
6
 */
public class Seven {
    public static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);
        return root;
    }

    public static Node lca(Node root, int p, int q) {
        if(root==null || root.data==p || root.data==q)
            return root;
        Node left=lca(root.left,p,q);
        Node right=lca(root.right,p,q);
        if(left==null)
            return right;
        else if(right==null)
            return left;
        else
            return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String strArr[] = str.split(" ");
        int intArr[] = new int[strArr.length];
        Node root = null;
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
            root = insert(root, intArr[i]);
        }
        int p = sc.nextInt();
        int q = sc.nextInt();

        Node curr=lca(root, p, q);
        System.out.println(curr.data);
    }
}

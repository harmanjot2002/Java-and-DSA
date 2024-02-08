// package Practice;

import java.util.Scanner;

public class Three {
    public static class Node {
        int data;
        Node left, right;
        public Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data)
            root.left = insert(root.left, data);
        else if (data > root.data)
            root.right = insert(root.right, data);
        return root;
    }

    public static Node deleteLeafNodes(Node root) {
        if (root == null)
            return null;

        if (root.left == null && root.right == null)
            return null;

        root.left = deleteLeafNodes(root.left);
        root.right = deleteLeafNodes(root.right);

        return root;
    }

    public static void postOrderTraversal(Node root) {
        if(root==null)
            return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }
    /*
        10 5 3 7 20 18 25
        
        5 20 10 
    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] values = new int[7];
        Node root=null;
        for (int i = 0; i < 7; i++) {
            values[i] = sc.nextInt();
            root=insert(root,values[i]);
        }
        root = deleteLeafNodes(root);
        postOrderTraversal(root);
    }
}

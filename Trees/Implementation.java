// package Trees;
import java.util.*;

public class Implementation {
    public static class Node{
        int key;
        Node left;
        Node right;
        Node(int k){
            key=k;
            left=right=null;
        }
    }
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        Node key=new Node(10);
        key.left=new Node(20);
        key.right=new Node(30);
        key.right.left=new Node(40);
        key.right.right=new Node(50);
        inorder(key);
    }
}

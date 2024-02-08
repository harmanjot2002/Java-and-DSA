import java.util.*;
/*
Sample Input 1
7
50 30 70 20 40 60 80
Sample Output 1
5
Sample Input 2
3
50 40 30
Sample Output 2
3
 */
class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

class Forty {
    Node root;

    Forty() {
        root = null;
    }

    void insert(int value) {
        root = insertRec(root, value);
    }

    Node insertRec(Node root, int value) {
        if (root == null)
            return new Node(value);
        if (value < root.data)
            root.left = insertRec(root.left, value);
        else if (value > root.data)
            root.right = insertRec(root.right, value);
        return root;
    }

    int height(Node root) {
        // Enter code here
        if(root==null)
            return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }

    int diameter(Node root) {
        if(root==null)
            return 0;
        int ld=diameter(root.left);
        int rd=diameter(root.right);
        int hd=height(root.left)+height(root.right)+1;
        return Math.max(hd,Math.max(ld,rd));
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Forty tree = new Forty();
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            tree.insert(value);
        }
        System.out.println(tree.diameter(tree.root));
        scanner.close();
    }
}
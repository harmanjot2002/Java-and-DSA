import java.util.*;
/*
Ip:7
50 30 70 20 40 60 80
op:20 40 30 60 80 70 50
 */
class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

class ThirtyOne {
    Node root;

    ThirtyOne() {
        root = null;
    }

    void insert(int value) {
        root = insertx(root, value);
    }

    Node insertx(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.data) {
            root.left = insertx(root.left, value);
        } else if (value > root.data) {
            root.right = insertx(root.right, value);
        }
        return root;
    }

    void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ThirtyOne tree = new ThirtyOne();
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            tree.insert(value);
        }
        tree.postorder(tree.root);
        scanner.close();
    }
}
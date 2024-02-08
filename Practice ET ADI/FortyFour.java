import java.util.*;
/*
 Sample Input 1
7
50 0
30 1
70 1
20 2
40 2
60 2
80 2
Sample Output 1
20 30 50 70 80
 */
class Node {
    int data;
    int depth;
    Node left, right;

    Node(int value, int d) {
        data = value;
        depth = d;
        left = right = null;
    }
}

class FortyFour {
    Node root;

    FortyFour() {
        root = null;
    }

    void insert(int value, int depth) {

        root = insertRec(root, value, depth);
    }

    Node insertRec(Node root, int value, int depth) {
        if (root == null)
            return new Node(value, depth);
        if (value < root.data)
            root.left = insertRec(root.left, value, depth + 1);
        else if (value > root.data)
            root.right = insertRec(root.right, value, depth + 1);
        return root;
    }

    void topView() {
        if (root == null)
            return;
            
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            int hd = current.depth;

            // If the horizontal distance is not present in the TreeMap, add it
            if (!treeMap.containsKey(hd))
                treeMap.put(hd, current.data);

            if (current.left != null) {
                queue.add(current.left);
                current.left.depth = hd - 1;
            }

            if (current.right != null) {
                queue.add(current.right);
                current.right.depth = hd + 1;
            }
        }

        // Print the values in the top view
        for (int value : treeMap.values()) {
            System.out.print(value + " ");
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        FortyFour tree = new FortyFour();
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            int depth = scanner.nextInt();
            tree.insert(value, depth);
        }

        tree.topView();
        scanner.close();
    }

}
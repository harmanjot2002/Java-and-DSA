import java.util.*;
/*
Sample Input 1
7
20 9 25 5 12 22 30
Sample Output 1
20 9 5
 */
class TwentySeven {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    TwentySeven() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);
        return root;

    }

    void leftView() {
        leftViewUtil(root, 1);
    }

    void leftViewUtil(Node node, int level) {
        // Write code here
        Queue<Node> q=new LinkedList<Node>();
        q.add(node);
        while(!q.isEmpty()){
            int cnt=q.size();
            for(int i=0;i<cnt;i++){
                Node curr=q.peek();
                q.remove();
                if(i==0)
                    System.out.print(curr.data+" ");
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
    }

    int maxLevel = 0;

    public static void main(String args[]) {
        TwentySeven tree = new TwentySeven();
        Scanner scanner = new Scanner(System.in);
        int numNodes = scanner.nextInt();
        for (int i = 0; i < numNodes; i++) {
            int value = scanner.nextInt();
            tree.insert(value);
        }
        tree.leftView();
        scanner.close();
    }
}
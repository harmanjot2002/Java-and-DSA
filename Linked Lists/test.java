import java.util.*;

public class test {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node kThNodeFromLast(Node head,int k){
        if(head==null || head.next==null){
            return head;
        }
        Node slow=head;
        Node fast=head;
        for(int i=0;i<k;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node head = null;
        Node tail = null;
        while (true) {
            int value = sc.nextInt();
            if (value == -1) {
                break;
            }
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        int k = sc.nextInt();
        Node result=kThNodeFromLast(head,k);
        if (result != null) {
            System.out.println(result.data);
        } else {
            System.out.println("Invalid k value.");
        }
        /*
        1 2 3 4 5 6 -1
        3
        4
         */
    }
}

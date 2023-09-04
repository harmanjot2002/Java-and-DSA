// package Linked Lists;

public class one {
    public static void insertAtEnd(Node head,int val){
        Node temp=new Node(val);
        Node t=head;
        while(t.next!=null){
            t=t.next;
        }
        t.next=temp;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
     public static void displayr(Node head){
        if(head==null)
            return;
        System.out.print(head.data+" ");
        displayr(head.next);
    }

    public static void displayrev(Node head){
        if(head==null)
            return;
        displayrev(head.next);
        System.out.print(head.data+" ");
    }

    public static int length(Node head){
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }

    public static class Node{
        int data; //Stores data
        Node next; //Stores address
        Node(int data){ //Constructor
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        System.out.println(a.next); //null
        Node b=new Node(7);
        Node c=new Node(8);
        Node d=new Node(9);
        Node e=new Node(10);
        a.next=b;
        System.out.println(a);//one$Node@28a418fc
        System.out.println(a.next);//one$Node@5305068a
        System.out.println(b);//one$Node@5305068a
        System.out.println(b.data);//7
        System.out.println(a.next.data);//7
        b.next=c;
        c.next=d;
        d.next=e;



        //Display LL
        display(a); //5 7 8 9 10 
        System.out.println();
        
        
        //Display LL recursively
        displayr(a); //5 7 8 9 10 
        System.out.println();


        //Display LL in reverse
        displayrev(a); //10 9 8 7 5
        System.out.println();

        
        //Length of LL
        int len=length(a);
        System.out.println(len); //5


        //Insert at end when head is given(O(n))
        display(a); //5 7 8 9 10
        System.out.println();
        insertAtEnd(a, 89);
        display(a); //5 7 8 9 10 89
        System.out.println();
    }
}

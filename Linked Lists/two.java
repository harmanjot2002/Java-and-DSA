import java.util.*;

public class two {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Linkedlist{
        Node head=null;
        Node tail=null;
        
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){ //if ll is empty
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
        }

        void insertAtBegin(int val){
            Node temp=new Node(val);
            if(head==null){ //if ll is empty
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }

        void insertAt(int ind,int val){
            Node t=new Node(val);
            Node temp=head;
            if(ind==0){
                insertAtBegin(val);
                return;
            }
            else if(ind==size()){
                insertAtEnd(val);
                return;
            }
            else if(ind<0 || ind>size()){
                System.out.println("Wrong index");
            }
            for(int i=0;i<ind-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }

        int getAt(int ind){
            if(ind<0 || ind>=size()){
                System.out.println("Wrong index");
                return -1;
            }
            Node temp=head;
            for(int i=0;i<ind-1;i++){
                temp=temp.next;
            }
            return temp.next.data;
        }

        void deleteAt(int ind){
            if(ind==0){
                head=head.next;
            }
            Node temp=head;
            for(int i=0;i<ind-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
        }

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }

        int size(){
            Node temp=head;
            int cnt=0;
            while(temp!=null){
                cnt++;
                temp=temp.next;
            }
            return cnt;
        }
    }
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.insertAtEnd(2);
        ll.insertAtEnd(5);
        ll.display(); //2 5
        System.out.println();
        System.out.println(ll.size()); //2
        ll.insertAtBegin(1);
        ll.display(); //1 2 5
        System.out.println();
        ll.insertAt(1,11);
        ll.display(); //1 11 2 5 
        System.out.println();
        ll.insertAt(4,13);
        ll.display(); //1 11 2 5 13
        System.out.println();
        ll.insertAt(5,15);
        ll.display(); //1 11 2 5 13 15
        System.out.println();
        ll.insertAt(0, 100);
        ll.display(); //100 1 11 2 5 13 15
        System.out.println();
        System.out.println(ll.getAt(3)); //2
        System.out.println(ll.getAt(7)); //Wrong index -1
        ll.deleteAt(3);
        ll.display();; //100 1 11 5 13 15
    }
}

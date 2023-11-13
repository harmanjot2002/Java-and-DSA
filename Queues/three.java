//Linked List implementation of queue
public class three {
    public static class Node{ //userdefined datatype
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class queueLL{
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int x){
            Node temp=new Node(x);
            if(size==0){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            size--;
            return x;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        public boolean isEmpty(){
            if(size==0)
                return true;
            else
                return false;
        }
    }
    public static void main(String[] args) {
        queueLL q=new queueLL();
        q.display(); //Queue is empty
        System.out.println(q.isEmpty()); //true
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.isEmpty()); //false
        q.add(4);
        q.add(5);
        q.display(); //1 2 3 4 5
        System.out.println(q.peek());//1
        q.remove();
        q.display();//2 3 4 5
        System.out.println(q.size); //4
    }
}

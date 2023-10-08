public class DLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    //Display DLL when head is given
    public static void display(Node head) {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    //Display DLL in reverse when tail is given
    public static void displayrev(Node tail) {
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    //Display DLL when any random node is given
    public static void displayrandom(Node random) {
        Node temp=random;
        //Move temp backwards to head
        while(temp.prev!=null){
            temp=temp.prev;
        }
         while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    //Insert at head
    public static Node insertAtHead(Node head,int x){
        Node t=new Node(x);
        t.next=head;
        head.prev=t;
        head=t;
        return head;
    }
    //Insert at tail
    public static Node insertAtTail(Node head,int x){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t=new Node(x);
        temp.next=t;
        t.prev=temp;
        return head;
    }
    //Insert at any index
    public static Node insertAtInd(Node head,int val,int ind){
         Node s=head;
         for(int i=0;i<ind-1;i++){
            s=s.next;
         }
         Node r=s.next;
         Node t=new Node(val);
         s.next=t;
         t.prev=s;
         t.next=r;
         r.prev=t;
         return head;
    }
    //Delete head
    public static Node delHead(Node head){
        head=head.next;
        head.prev=null;
        return head;
    }
    //Delete tail when head is given
    public static Node delTail(Node head){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp=temp.prev;
        temp.next=null;
        return head;
    }
    //Delete at any index when head is given
    public static Node delAny(Node head,int ind){
        Node temp=head;
        for(int i=0;i<ind-1;i++){
            temp=temp.next;   
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
        return head;
    }


    //Palindrome DLL 
    public static boolean isPalindrome(Node head) {
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(head!=temp){
            if(head.val!=temp.val)
                return false;
            head=head.next;
            temp=temp.prev;
        }
        return true;
    }

    //Two Sum in DLL
    public static void twoSum(Node head,int target){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node tail=temp;
        while(head.val<tail.val){
            if(head.val+tail.val==target){
                System.out.println(head.val+" "+tail.val);
                break;
            }
            else if(head.val+tail.val>target){
                tail=tail.prev;
            }
            else{
                head=head.next;
            }
        }
    }

    //Critical Point (max-min distance)
    


    //Flatten a Multilevel DLL
    /*
    public static Node flatten(Node head) {
        Node temp=head;
        while(temp!=null){
            Node t=temp.next;
            if(temp.child!=null){
                Node c=flatten(temp.child);
                temp.next=c;
                c.prev=temp;
                while(c.next!=null){
                    c=c.next;
                }
                c.next=t;
                if(t!=null)
                    t.prev=c;
            }
            temp.child=null;
            temp=temp.next;
        }
        return head;
    }
    */

    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        // display(a); //4 10 2 99 13 
        // displayrev(e);//13 99 2 10 4
        // displayrandom(c);//4 10 2 99 13 

        // Node newHead=insertAtHead(a, 38);
        // display(newHead); //38 4 10 2 99 13 

        // display(a);
        // insertAtTail(a, 90);
        // display(a); //4 10 2 99 13 90

        // display(a); //4 10 2 99 13
        // insertAtInd(a,100 , 3);
        // display(a); //4 10 2 100 99 13

        // Node ans=delHead(a);
        // display(ans); //10 2 100 99 13

        // display(a); //4 10 2 99 13 
        // Node ans2=delTail(a);
        // display(ans2); //4 10 2 99

        // display(a); //4 10 2 99 13
        // delAny(a, 3);
        // display(a); //4 10 2 13

        // display(a);//4 10 2 99 13
        // System.out.println(isPalindrome(a));//false
        // insertAtTail(a, 13);
        // insertAtTail(a, 99);
        // insertAtTail(a, 2);
        // insertAtTail(a, 10);
        // insertAtTail(a, 4);
        // display(a);//4 10 2 99 13 13 99 2 10 4
        // System.out.println(isPalindrome(a));//true


        display(a);
        insertAtTail(a, 19);
        display(a); //4 10 2 99 13 19
        twoSum(a, 23); //4 19



    }
}

public class three {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    //Delete node from LL when node is given
    // 4->5->2->1->90->45 .Delete 90
    public static void deleteNode(Node del){
        if(del==null){
            return;
        }
        del.data=del.next.data;
        del.next=del.next.next;
    }

    //Find mth node from end given head
    //mth node from start will be n-m+1.
    public static Node mThFromLast(Node head,int m){
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        int n=cnt-m+1;
        temp=head;
        for(int i=0;i<n-1;i++){
            temp=temp.next;
        }
        return temp;
    }

    //Find mth node from end given head
    //Using slow and fast pointers
    public static Node mThFromLastTwo(Node head,int m){
        Node slow=head;
        Node fast=head;
        for(int i=0;i<m;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }


    //Delete mth node from end given head
    public static Node DeletemThFromLast(Node head,int m){
        Node slow=head;
        Node fast=head;
        for(int i=0;i<m;i++){
            fast=fast.next;
        }
        if(fast==null){ //If m=size of linked list,then it should delete head
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }


    //Intersection of two LL
    public Node getIntersectionNode(Node headA, Node headB,int m,int n) {
        // int m=getSize(headA);
        // int n=getSize(headB);
        Node tempA=headA;
        Node tempB=headB;
        if(m>n){ 
            int steps=m-n;
            for(int i=0;i<steps;i++){
                tempA=tempA.next;
            }
        }
        else{
            int steps=n-m;
            for(int i=0;i<steps;i++){
                tempB=tempB.next;
            }
        }
        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
    }


    //Middle Element of LL
    public static Node MiddleELe(Node head){
        if(head.next==null) //If only one element in LL
            return null;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }


    //Delete Middle Element of LL
    public static Node DeleteMid(Node head){
        if(head.next==null)
            return null;
        Node slow=head;
        Node fast=head;
        while(fast.next.next!=null && fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }


    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(7);
        Node c=new Node(8);
        Node d=new Node(9);
        Node e=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a); //5 7 8 9 10
        System.out.println();
        Node temp=mThFromLast(a, 2);
        System.out.println(temp.data); //9
        Node temp2=mThFromLastTwo(a,2);
        System.out.println(temp2.data); //9 
        DeletemThFromLast(a, 2);
        display(a); //5 7 8 10
        System.out.println();
        a=DeletemThFromLast(a, 4);
        display(a); //7 8 10
        System.out.println();
        Node mid=MiddleELe(a);
        System.out.println(mid.data); //8
        DeleteMid(a);
        display(a); //7 10
    }   
}
public class four {
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
    public static boolean isCycle(Node head){
        if(head==null || head.next==null) return false;
        Node slow=head;
        Node fast=head;
        while(fast!=null){
            if(slow==null) return false;
            slow=slow.next;
            if(fast.next==null) return false;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }


    public Node startCycle(Node head) {
        if(head==null || head.next==null)
            return null;
        Node slow=head;
        Node fast=head;
        while(fast!=null){
            if(slow==null) return null;
            slow=slow.next;
            if(fast.next==null) return null;
            fast=fast.next.next;
            if(slow==fast)
                break;
        }
        Node temp=head;
        while(temp!=slow){
            temp=temp.next;
            if(slow==null)
                return null;
            slow=slow.next;
        }
        return slow;
    }



    //Odd Even LL
    public static Node oddEvenLL(Node head){
        Node odd=head;
        Node even=head.next;
        Node evenStart=even;
        while(odd.next!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenStart;
        return head;
    }


    //Remove duplicates from sorted LL
    public static Node deleteDuplicates(Node head) {
        Node temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }
            if(temp.next==null){
                return head;
            }
            if(temp.data!=temp.next.data){
                temp=temp.next;
            }
        }
        return head;
    }


    //Reverse LL recusrsively(O(n) Time,O(n) Space)
    public static Node reverseList(Node head) {
        if(head==null || head.next==null)
            return head;
        Node newHead=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }

    //Reverse LL Iteratively(O(n) Time,O(1) Space).
    public static Node reverseIter(Node head){
        Node curr=head;
        Node prev=null;
        Node after=null;
        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }

    //Check Palindrome LL
    public static boolean isPalindrome(Node head) {
        // write your code here
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){ //To get left middle
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp=reverseList(slow.next);
        slow.next=temp;
        Node p1=head;
        Node p2=slow.next;
        while(p2!=null){
            if(p1.data!=p2.data){
                return false;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(7);
        Node c=new Node(8);
        Node d=new Node(9);
        Node e=new Node(10);
        Node f=new Node(9);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        // Node ans=oddEvenLL(a);
        // display(ans); //5 8 10 7 9 9 
        // System.out.println();
        // Node ans2=deleteDuplicates(a);
        // display(ans2); //5 8 10 7 9 
        // System.out.println();
        // Node ans3=reverseList(a);
        // display(ans3); //9 10 9 8 7 5
        // System.out.println();
        Node ans4=reverseIter(a);
        display(ans4); //9 10 9 8 7 5 
        System.out.println(isPalindrome(ans4)); //false
    }
}

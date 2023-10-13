import java.util.*;


public class Stack2 {
    public static class Node{ //user-defined data type
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class LLStack{ //user-defined data structure
        Node head=null;
        int size=0;
        void push(int val){
            Node temp=new Node(val);
            temp.next=head;
            head=temp;
            size++;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            Node temp=head;
            head=head.next;
            size--;
            return temp.val;
        }
        int peek(){
             if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }
        int size(){ //getter
            return size;
        }
        void displayRev(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void displayRec(Node head){
            if(head==null)
                return;
            displayRec(head.next);
            System.out.print(head.val+" ");
        }
        void display(){
            displayRec(head);
            System.out.println();
        }
        boolean isEmpty(){
            if(size==0)
                return false;
            return true;
        }
    }
    // public static class Stack{
    //     int[] arr=new int[5];
    //     int idx=0;
    //     void push(int x){
    //         if(isFull()){
    //             System.out.println("Stack is full");
    //             return;
    //         }
    //         arr[idx]=x;
    //         idx++;
    //     }
    //     int peek(){
    //         if(idx==0){
    //             System.out.println("Stack is empty");
    //             return -1;
    //         }
    //         return arr[idx-1];
    //     }
    //     int pop(){
    //         if(idx==0){
    //             System.out.println("Stack is empty");
    //             return -1;
    //         }
    //         int top=arr[idx-1];
    //         arr[idx-1]=0;
    //         idx--;
    //         return top;
    //     }
    //     void display(){
    //         for(int i=0;i<=idx-1;i++){
    //             System.out.print(arr[i]+" ");
    //         }
    //         System.out.println();
    //     }
    //     int size(){
    //         return idx;
    //     }
    //     boolean isEmpty(){
    //         if(size()==0){
    //             return true;
    //         }
    //         return false;
    //     }
    //     boolean isFull(){
    //         if(idx==arr.length){
    //             return true;
    //         }
    //         return false;
    //     }
    //     int capacity(){
    //         return arr.length;
    //     }
    // }

    public static void main(String[] args) {
        LLStack st=new LLStack();
        st.push(4);
        st.push(5);
        st.push(1);
        System.out.println(st.peek()); //1
        st.display(); //4 5 1
        System.out.println(st.size()); //3
        st.pop();
        st.display(); //4 5
        st.push(7);
        st.push(0);
        st.push(3);
        // System.out.println(st.isFull()); //true
        st.push(10);//Stack is full
    }
}

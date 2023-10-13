import java.util.*;

public class Stack1 {
    public static void displayRevRec(Stack<Integer> s){
        if(s.size()==0)
            return;
        int top=s.pop();
        System.out.print(top+" ");
        displayRevRec(s);
        s.push(top);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int n=sc.nextInt(); //5
        for(int i=1;i<=n;i++){
            int x=sc.nextInt(); //1 2 3 4 5
            st.push(x); 
        }
        System.out.println(st); //[1, 2, 3, 4, 5]

        //Reverse Order
        Stack<Integer> rt=new Stack<>();
        while(st.size()>0){
            // int x=st.peek();
            // rt.push(x);
            // st.pop();

            rt.push(st.pop());
        }
        System.out.println(rt); //[5, 4, 3, 2, 1]

        //Copy contents of one stack to another
        Stack<Integer> gt=new Stack<>();
        while(rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println(gt); //[1, 2, 3, 4, 5]

        //Reverse contents of one stack and put them in same stack
        while(gt.size()>0){
            st.push(gt.pop());
        }
        System.out.println(st);//[5, 4, 3, 2, 1]

        /*
        Space:O(n)
        Time:O(n)
         */

        //Insert at bottom
        Stack<Integer> nt=new Stack<>();
        while(st.size()>0){
            nt.push(st.pop());
        }
        st.push(6);
        while(nt.size()>0){
            st.push(nt.pop());
        }
        System.out.println(st);//[6, 5, 4, 3, 2, 1]

        //Insert at specific index(here insert 16 at 1)
        Stack<Integer> temp=new Stack<>();
        while(st.size()>1){
            temp.push(st.pop());
        }
        st.push(16);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st); //[6, 16, 5, 4, 3, 2, 1]


        //Display Stack
        Stack<Integer> d=new Stack<>();
        while(st.size()>0){
            d.push(st.pop());
        }
        while(d.size()>0){
            int x=d.pop();
            System.out.print(x+" "); //6 16 5 4 3 2 1 
            st.push(x);
        }
        System.out.println();


        //Display stack using arrays
        int sz=st.size();
        int[] arr=new int[sz];
        for(int i=sz-1;i>=0;i--){
            arr[i]=st.pop();
        }
        for(int i=0;i<sz;i++){
            System.out.print(arr[i]+" ");//6 16 5 4 3 2 1
            st.push(arr[i]);
        }
        System.out.println();


        //Display stack recursively(Stacks are passed by reference,agar function mein kuch pop ya push kiya toh wahi change original stack mein bhi aa jati hai)
        /*
        Time:O(n)
        Space:O(n)(Bcoz of Call Stack)
         */
        displayRevRec(st); //1 2 3 4 5 16 6


        //Underflow:If stack is empty and we are trying to perform peek or pop function,then empty stack Exception occurs.This is called Stack Underflow.

        //Overflow:If stack is full and we are trying to push,then Stack Overflow occurs.It occurs when:
        //1)Actual memory is full
        //2)Implement using Arrays bcoz size of array is fixed.

        

    }
}

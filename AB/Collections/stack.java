import java.util.*;

class stack{
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();  
        Stack stack1 = new Stack();

        stack.push("Welcome");
        stack.push("To");
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");
        stack1.push("4");
        stack1.push("All");
        stack1.push("Geeks");

        System.out.println(stack.search("To")); //4

        System.out.print(stack+" "); //[Welcome, To, Geeks, For, Geeks]
        System.out.println();
        System.out.print(stack1+" "); //[4, All, Geeks]
        System.out.println();
        
        System.out.println("Element at top of"+" stack is: "+stack.peek()); //Element at top of stack is: Geeks
        System.out.print(stack+" "); //[Welcome, To, Geeks, For, Geeks]
        System.out.println();
        System.out.println("Popped element:"+stack.pop()); //Popped element:Geeks
        stack.pop();  
        System.out.print(stack+" "); //[Welcome, To, Geeks]
        System.out.println();


        Iterator itr=stack.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next()); 
            /*
            Welcome
            To 
            Geeks */ 
        }  


        for(int i = 0; i < stack.size(); i++){
            System.out.print(stack.get(i)+" "); //Welcome To Geeks
        }
        System.out.println();

        System.out.print(stack+" "); //[Welcome, To, Geeks]
        System.out.println();
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        /*
        Geeks
        To
        Welcome
         */
        System.out.print(stack+" ");

    }
}
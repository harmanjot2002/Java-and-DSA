import java.util.*;
/*
Enter no. of elements in linked list: 
6
Enter elements in linked list: 
9 2 8 9 7 0
Enter index of element to be removed from end: 
2
Kth element from last is: 7
Resultant Linked list is:  
9 2 8 9 0 
 */
class CremoveKthElementFromEnd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> ll=new LinkedList<>();
        System.out.println("Enter no. of elements in linked list: ");
        int n=sc.nextInt();
        System.out.println("Enter elements in linked list: ");
        for(int i=0;i<n;i++){
            ll.add(sc.nextInt());
        }
        System.out.println("Enter index of element to be removed from end: ");
        int k=sc.nextInt();
        Collections.reverse(ll);
        System.out.println("Kth element from last is: "+ll.remove(k-1));
        Collections.reverse(ll);
        System.out.println("Resultant Linked list is: ");
        for(Integer in:ll){
            System.out.print(in+" ");
        }
    }
}
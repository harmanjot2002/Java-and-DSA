import java.util.*;
/*
Enter no. of elements in first linked list: 3
Enter no. of elements in second linked list: 5
Enter elements of first linked list: 
8 0 2
Enter elements of second linked list: 
6 1 8 2 9
Resultant linked list is: 
0 1 2 2 6 8 8 9 
 */
class CmergeSort{
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        ArrayList<Integer> l3=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of elements in first linked list: ");
        int n=sc.nextInt();
        System.out.print("Enter no. of elements in second linked list: ");
        int x=sc.nextInt();
        System.out.println("Enter elements of first linked list: ");
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        System.out.println("Enter elements of second linked list: ");
        for(int i=0;i<x;i++){
            l2.add(sc.nextInt());
        }

        /*
        int i=0;
        while(i<n){
            l3.add(l1.get(i));
            i++;
        }
        int j=0;
        while(j<x){
            l3.add(l2.get(j));
            j++;
        }
        */

        l3.addAll(l1);
        l3.addAll(l2);
        
        Collections.sort(l3);
        System.out.println("Resultant linked list is: ");
        for(Integer in:l3){
            System.out.print(in+" ");
        }
    }
}
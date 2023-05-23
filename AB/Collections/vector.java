import java.util.*;

class vector{
    public static void main(String[] args) {
        Vector v=new Vector();
        Vector<Integer> v2 = new Vector<Integer>();

        v.add(2);
        v.add(3);
        for(int i=2;i<5;i++){
            v.add(i);
        }
        v.add(5,70);
        System.out.println(v);  //[2, 3, 2, 3, 4, 70]
        
        v.remove(3);
        System.out.println(v);  //[2, 3, 2, 4 ,70]
        
        System.out.println(v.size());  //5
        
        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");  //2 3 2 4 70

        System.out.println();
        Iterator itr=v.iterator();
        while(itr.hasNext())
            System.out.print(itr.next()); //232470

        // System.out.println();
        // for (Integer i : v)
        //     System.out.print(i + " ");//2 3 2 4 70 

        System.out.println();
        System.out.println("The Object that is replaced is: "+v.set(0, 21)); //The Object that is replaced is: 2

        System.out.println(v); //[21, 3, 2, 4, 70]
        v.insertElementAt(45, 1);
        System.out.println(v); //[21, 45, 3, 2, 4, 70]
        
        v.removeElementAt(1);
        System.out.println(v); //[21, 3, 2, 4, 70]
        
        System.out.println("Before sorting list:");
        System.out.println(v); //[21, 3, 2, 4, 70]
        Collections.sort(v);
        System.out.println("after sorting list:");
        System.out.println(v); //[2, 3, 4, 21, 70]
    }
}
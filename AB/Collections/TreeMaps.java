/*
Java program to print frequencies of all elements using TreeMap
 */

import java.util.*;

class TreeMaps{
    static void printFreq(int arr[]){
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("A", 1);
        treeMap.put("C", 3);
        treeMap.put("B", 2);

        int valueA = treeMap.get("A");
        System.out.println("Value of A: " + valueA); //Value of A: 1

        System.out.println(treeMap); //{A=1, B=2, C=3}
        treeMap.remove("B");
        System.out.println(treeMap); //{A=1, C=3}

        System.out.println(treeMap.containsKey("A")); //true
        System.out.println(treeMap.containsValue(3)); //true

        System.out.println(treeMap.entrySet()); //[A=1, C=3]
        System.out.println(treeMap.keySet()); //[A, C]
        System.out.println(treeMap.descendingKeySet()); //[C,A]
        
        System.out.println(treeMap.firstEntry()); //A=1
        System.out.println(treeMap.firstKey()); //A
        System.out.println(treeMap.lastKey()); //C   

        System.out.println(treeMap.headMap("B")); //{A=1}
        System.out.println(treeMap.tailMap("B")); //{C=3}

        System.out.println(treeMap.floorEntry("A")); //A=1
        System.out.println(treeMap.floorEntry("C")); //C=3
        System.out.println(treeMap.floorKey("A")); //A
        System.out.println(treeMap.higherEntry("A")); //C=3
        System.out.println(treeMap.lowerEntry("A")); //null
        

        System.out.println(treeMap.size()); //2

        System.out.println(treeMap.subMap("A","C")); //{A=1}

        System.out.println(treeMap.values()); //[1, 3]

        TreeMap<Integer,Integer> tm=new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            Integer c=tm.get(arr[i]);
            // If this is first occurrence of element 
            if(c==null)
                tm.put(arr[i],1);
            // If elements already exists in hash map
            else
                tm.put(arr[i],++c);
        }
        for(Map.Entry m:tm.entrySet())
            System.out.println("Frequency of "+m.getKey()+" is "+m.getValue());
    }
    public static void main(String[] args) {
        int arr[]={10,34,5,10,3,5,10};
        printFreq(arr);
    }
}
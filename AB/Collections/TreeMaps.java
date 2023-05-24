/*
Java program to print frequencies of all elements using TreeMap
 */

import java.util.*;

class TreeMaps{
    static void printFreq(int arr[]){
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
/*
Write a Java program to create a grade book for students. The program should allow adding student names and their corresponding grades. Implement this using a collection (Map) where the student names are keys and the grades are values. The program should also provide functionality to retrieve the grade of a specific student and calculate the average grade of all students.
 */
import java.util.*;

class CstudentGradeBook{
    public static void main(String[] args) {
        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("Harman",40);
        tm.put("Navreet",90);
        tm.put("Gurvansh",70);
        System.out.println(tm); //{Gurvansh=70, Harman=40, Navreet=90}

        if(tm.containsKey("Navreet")){
            System.out.println(tm.get("Navreet")); //90
        }

       System.out.println(tm.values()); //[70, 40, 90]
       int sum=0;
       for(Integer i:tm.values()){
            sum+=i;
       }
       System.out.println(sum); //200
       System.out.println(sum/3); //66
    }
}
/*
Write a Java program that takes a list of names as input and sorts them in alphabetical order. Implement this program using collections in Java.
 */
import java.util.*;
import java.io.*;

class CsortNames{
    public static void main(String[] args) throws IOException{
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        ArrayList<String> al=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(in.readLine());
        }     
    
        Collections.sort(al);
        for(String str:al)
            System.out.println(str);
    }
}
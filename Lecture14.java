import java.util.Scanner;

class ArraysExample{
    void demoArrays(){
        int[] ages=new int[3];
        float[] weights=new float[3];
        String[] names=new String[3];
        ages[0]=34;
        ages[1]=12;
        ages[2]=45;
        //ages[5]=43; //Out of bounds error
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
    }
}

public class Lecture14{
    public static void main(String[] args) {
        ArraysExample obj=new ArraysExample();
        obj.demoArrays();
    }
}
import java.util.Scanner;

class ArraysExample{
    void demoArrays(){
        int[] ages=new int[3];
        float[] weights=new float[3];
        String[] names={"Rahul","Raj","Mohan","iou"};
        ages[0]=34;
        ages[1]=12;
        ages[2]=45;
        //ages[5]=43; //Out of bounds error
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        //Length operation in array
        System.out.println(ages.length);
        System.out.println(weights.length);
        System.out.println(names.length);

        //Multi-Dimensional Arrays
        int[][] arr1=new int[5][3];
        int[][] matrix={{4,5,6},{3,4,5},{7,8,9}};
        System.out.println(matrix[0][0]);
        System.out.println(matrix[1][2]);

        //Traversing over arrays
        //1.For loop
        for(int i=0;i<3;i++){
            System.out.println(ages[i]);
        }
        // 2.For-each loop
        for(int age : ages){
            System.out.println(age);
        }
        //While loop
        int i=0;
        while(i<3){
            System.out.println(ages[i]);
            ++i;
        }

        //Traversing over multi-dimensional arr.
        for(int k=0;k<matrix.length;k++){
            for(int j=0;j<matrix[k].length;j++){
                System.out.println(matrix[k][j]);
            }
        }

    } 
}

public class Lecture14{
    public static void main(String[] args) {
        ArraysExample obj=new ArraysExample();
        obj.demoArrays();
    }
}
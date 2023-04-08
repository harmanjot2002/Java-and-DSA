import java.util.Scanner;

public class Lecture20{
    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    //1.Addition of 2 matrices
    static void add(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("Wrong Input-Addition not possible");
            return;
        }
        int[][] sum=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        printMatrix(sum);
    }

    //2.Multiplication of 2 matrices
    static void multiply(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if(c1!=r2){
            System.out.println("Multiplication not possible - wrong dimension ");
            return;
        }
        int[][] mul=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    mul[i][j]+=(a[i][k]*b[k][j]);
                }
            }
        }
        printMatrix(mul);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        int total = row * col;
        System.out.println("Please enter " + total + " elements now.");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the no of rows2 : ");
        int row2 = sc.nextInt();
        System.out.println("Enter the number of columns2 : ");
        int col2 = sc.nextInt();
        int arr2[][] = new int[row2][col2];
        int total2 = row2 * col2;
        System.out.println("Please enter " + total2 + " elements now.");
        for (int i2 = 0; i2 < row2; i2++) {
            for (int j2 = 0; j2 < col2; j2++) {
                arr2[i2][j2] = sc.nextInt();
            }
        }
        add(arr,row,col,arr2,row2,col2);    
       

        System.out.println("Enter the no of rows : ");
        int row3 = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int col3 = sc.nextInt();
        int arr3[][] = new int[row3][col3];
        int total3 = row3 * col3;
        System.out.println("Please enter " + total3 + " elements now.");
        for (int i = 0; i < row3; i++) {
            for (int j = 0; j < col3; j++) {
                arr3[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the no of rows4 : ");
        int row4 = sc.nextInt();
        System.out.println("Enter the number of columns2 : ");
        int col4 = sc.nextInt();
        int arr4[][] = new int[row4][col4];
        int total4 = row4 * col4;
        System.out.println("Please enter " + total4 + " elements now.");
        for (int i4 = 0; i4 < row4; i4++) {
            for (int j4 = 0; j4 < col4; j4++) {
                arr4[i4][j4] = sc.nextInt();
            }
        }
        multiply(arr3,row3,col3,arr4,row4,col4);
    }
}

/*
Enter the no of rows : 
2
Enter the number of columns : 
2
Please enter 4 elements now.
2 3
3 2
Enter the no of rows2 : 
2
Enter the number of columns2 : 
2
Please enter 4 elements now.
2 3
3 2
4 6 
6 4
Enter the no of rows :
3
Enter the number of columns : 
3
Please enter 9 elements now.
1 1 1
2 2 2
3 3 3
Enter the no of rows4 : 
3
Enter the number of columns2 : 
3
Please enter 9 elements now.
1 1 1
2 2 2
3 3 3
6 6 6 
12 12 12
18 18 18
 */
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
        
        int m,n;

        //Multiplication of matrices:
        System.out.println("enter the number of rows=");
        m=sc.nextInt();
        System.out.println("enter the number of columns=");
        n=sc.nextInt();
        int arr1[][]=new int[m][n];
        int arr3[][]=new int[m][n];
        int ans[][]=new int[m][n];
        int i,j,k;
        System.out.println("enter the first matrix element=\n");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the Second matrix element=\n");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                arr3[i][j]=sc.nextInt();
            }
        }
        System.out.println("multiply of the matrix=\n");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                ans[i][j]=0;
                for(k=0;k<n;k++){
                    ans[i][j]+=arr1[i][k]*arr3[k][j];
                }
            }
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println("");
        }
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
enter the number of rows=
3
enter the number of columns=
3
enter the first matrix element=

1 1 1
2 2 2
3 3 3
enter the Second matrix element=

1 1 1
2 2 2
3 3 3
multiply of the matrix=

6 6 6
12 12 12
18 18 18
 */
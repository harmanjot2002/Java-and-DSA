import java.util.*;

class matrixMultiplication{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][2];
        int b[][]=new int[2][1];
        int c[][]=new int[3][1];
        int i,j,k;
        System.out.println("Enter elements of first matrix: ");
        for(i=0;i<3;i++){
            for(j=0;j<2;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix: ");
        for(i=0;i<2;i++){
            for(j=0;j<1;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Multiplication of two matrices is: ");
        for(i=0;i<3;i++){
            for(j=0;j<1;j++){
                c[i][j]=0;
                for(k=0;k<2;k++){
                    c[i][j]+=(a[i][k]*b[k][j]);
                } 
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }        
    }
}
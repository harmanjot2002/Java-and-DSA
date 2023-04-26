import java.util.*;

class transpose{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][2];
        int i,j;
        System.out.println("Enter elements of matrix: ");
        for(i=0;i<3;i++){
            for(j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Given matrix is: ");
        for(i=0;i<3;i++){
            for(j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose of matrix is: ");
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
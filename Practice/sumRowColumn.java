import java.util.*;
/*
 Enter elements of matrix: 
1 2 3 4 5 6
Column wise sum is: 
9
12
Row wise sum is:
3
7
11
 */
class sumRowColumn{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][2];
        int i,j;
        System.out.println("Enter elements of matrix: ");
        for(i=0;i<3;i++){
            for(j=0;j<2;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Column wise sum is: ");
        for(i=0;i<2;i++){
            int scol=0;
            for(j=0;j<3;j++){
                scol+=a[j][i];
            }
            System.out.println(scol);
        }
        System.out.println("Row wise sum is: ");
        for(i=0;i<3;i++){
            int srow=0;
            for(j=0;j<2;j++){
                srow+=a[i][j];
            }
            System.out.println(srow);
        }
    }
}
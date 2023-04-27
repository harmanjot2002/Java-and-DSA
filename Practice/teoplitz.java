import java.util.*;
/*
    1     8     3     2     5
     5     1     8     3     2
     2     5     1     8     3
     3     2     5     1     8
     8     3     2     5     1

 */
class teoplitz{
    static boolean isToeplitz(int arr[][]){
        int d=arr[0][0];
        int i,j;
        for(i=0;i<5;i++){
        for(j=0;j<5;j++){
               if(i==j){
                    if(arr[i][j]!=d)
                        return false;
                }
            }
        }    
        return true;    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[5][5];
        int i,j;
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        if(isToeplitz(arr))
           System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}
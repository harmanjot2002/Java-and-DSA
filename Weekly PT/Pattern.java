/*
5
    555555555
    544444445
    543333345
    543222345
    543212345
    543222345
    543333345
    544444445
    555555555
*/
import java.util.*;
class Pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for(i=n;i>=1;i--){
            for(j=n;j>i;j--){
                System.out.print(j);
            }
            for(j=1;j<=2*i-1;j++){
                System.out.print(i);
            }
            for(j=i+1;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(i=1;i<n;i++){
            for(j=n;j>i;j--){
                System.out.print(j);
            }
            for(j=1;j<=2*i-1;j++){
                System.out.print(i+1);
            }
            for(j=i+1;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
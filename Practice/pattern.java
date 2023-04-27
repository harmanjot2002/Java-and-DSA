import java.util.*;
/*
5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5
*/

class pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for(i=n;i>=1;i--){
            for(j=n;j>i;j--)
                System.out.print(j);
            for(j=1;j<=(2*i-1);j++)
                System.out.print(i);
            for(j=i+1;j<=n;j++)
                System.out.print(j);
            System.out.println();
        }
        for(i=1;i<n;i++){
            for(j=5;j>i;j--)
                System.out.print(j);
            for(j=1;j<=(2*i-1);j++)
                System.out.print(i);
            for(j=i+1;j<=n;j++)
                System.out.print(j);
            System.out.println();
        }
    }
}
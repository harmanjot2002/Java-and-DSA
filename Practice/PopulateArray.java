import java.util.*;

/*
 6
 1 3 5 6 4 2

 9
 1 3 5 7 9 8 6 4 2
 */
class PopulateArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i+=2){
            System.out.print(i+" ");
        }
        if(n%2==0){
            for(int i=n;i>=2;i-=2){
                System.out.print(i+" ");
            }
        }
        else{
            for(int i=n-1;i>=2;i-=2){
                System.out.print(i+" ");
            }
        }
    }
}
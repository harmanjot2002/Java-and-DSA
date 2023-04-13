import java.util.*;

class rotationByOne{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A[]={3,9,7,8,12,6,15,5,4,10};
        //Left rotation
        /*
        int temp=A[0];
        for(int i=1;i<A.length;i++){
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        for(int i=0;i<A.length;i++)
            System.out.print(A[i]+" ");
        */


        //Right Rotation
        int temp=A[A.length-1];
        for(int i=A.length-1;i>0;i--){
            A[i]=A[i-1];
        }
        A[0]=temp;
        for(int i=0;i<A.length;i++)
            System.out.print(A[i]+" ");
    }
}
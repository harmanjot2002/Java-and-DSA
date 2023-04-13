import java.util.*;

class copyingAnArray{
    public static void main(String[] args) {
        int A[]={8,6,10,9,2};
        System.out.println("Length of A="+A.length);
        int len=A.length;
        int B[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            B[len-i-1]=A[i];
        }
        System.out.println("Length of B="+B.length);
        for(int i=0;i<B.length;i++){
            System.out.print(B[i]+" ");
        }
    }
}
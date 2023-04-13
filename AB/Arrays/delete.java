import java.util.*;

class delete{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A[]=new int[10];
        int n=6;
        int index=2;
        A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;
        for(int i=index+1;i<n;i++)
            A[i-1]=A[i];
        for(int i=0;i<n-1;i++)
            System.out.print(A[i]+" ");

    }
}
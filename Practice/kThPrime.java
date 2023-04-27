import java.util.*;

class kThPrime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int base=2;
        int arr[]=new int[k];
        int i=0;
        while(n>1){
            if(n%base==0){
                arr[i]=base;
                i++;
                n=n/base;
            }
            else{
                base++;
            }
        }
        System.out.println(arr[k-1]);
    }
}
class Reverse{
    int reverse(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }    
    int [] reverse(int A[]){
        int B[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            B[A.length-i-1]=A[i];
        }
        return B;
    }
    
    public static void main(String[] args) {
        Reverse r=new Reverse();
        System.out.println(r.reverse(435));
        int arr[]={1,2,3,4,5};
        int arr2[]=r.reverse(arr);
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    } 
}
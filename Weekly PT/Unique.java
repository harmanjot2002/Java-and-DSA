import java.util.*;

class unique{
    static boolean isUnique(int n){
        int ans=0;
        int i,j;
        String str=Integer.toString(n);
        int l=str.length();
        for(i=0;i<l-1;i++){
            for(j=i+1;j<l;j++){
                if(str.charAt(i)==str.charAt(j)){
                    ans=1;
                    break;
                }
            }
        }
        if(ans==0)
            return true;
        else
            return false; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;i<=m;i++){
            if(isUnique(i))
                System.out.println(i+" is Unique");
            else
                System.out.println(i+" is not Unique");
        }
    }
}
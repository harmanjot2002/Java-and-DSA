import java.util.*;
/*
5
121 34 56 78 909
121 is palindrome   
34 is not palindrome
56 is not palindrome
78 is not palindrome
909 is palindrome   
 */
class palindrome{
    static boolean isPalindrome(int n){
        int x=n;
        int sum=0;
        while(x>0){
            int rem=x%10;
            sum=(sum*10)+rem;
            x=x/10;
        }
        if(sum==n)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(isPalindrome(arr[i]))
                System.out.println(arr[i]+" is palindrome");
            else
            System.out.println(arr[i]+" is not palindrome");
        }
    }
}
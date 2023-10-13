import java.util.*;
public class Stack3 {
    //Check whether given sequence of brackets is balanced or not.
    public static boolean isBalanced(String str){
        Stack<Character> st=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.size()==0)
                    return false;
                if(st.peek()=='(')
                    st.pop();
            }
        }
        if(st.size()>0)
            return false;
        return true;
    }

    //Find minimum no. of brackets that we need to remove to make given bracket sequence balanced.


    //Remove all consecutive sequences of length greater than or equal to 2 that contains the same element.
    public static int[] removeConsSubSeq(int[] arr){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.size()==0 || st.peek()!=arr[i])
                st.push(arr[i]);
            else if(st.peek()==arr[i]){
                if(i==arr.length-1 || arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
        }
        int[] res=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }


    //Next Greater Element(O(n),O(n))
     public static int[] nextGreater(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        st.push(arr[n-1]);
        int res[]=new int[n];
        res[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && st.peek()<arr[i] ){
                st.pop();
            }
            if(st.size()==0)
                res[i]=-1;
            else
                res[i]=st.peek();
            st.push(arr[i]);
        }
        return res;
     }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String str=sc.nextLine();
        // System.out.println(isBalanced(str));

        // int[] arr={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        // int[] res=removeConsSubSeq(arr);
        // for(int i=0;i<res.length;i++){
            // System.out.print(res[i]+" ");
        // }

        int arr[]={1,3,2,1,8,6,3,4};
        // int res[]=new int[arr.length];
        // //O(n^2),O(1)
        // for(int i=0;i<arr.length;i++){
        //     res[i]=-1;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]>arr[i]){
        //             res[i]=arr[j];
        //             break;
        //         }
        //     }
        // }
        // for(int i=0;i<res.length;i++){
        //     System.out.print(res[i]+" "); //3 8 8 8 -1 -1 4 -1 
        // }

        int res[]=nextGreater(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" "); //3 8 8 8 -1 -1 4 -1 
        }
    }   
}

import java.util.*;

public class test {
    public static boolean validInvalid(int arr[]){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1)
                st.push(arr[i]);
            else{
                if(st.isEmpty()){
                    return false;
                }
                st.pop();
            }
        }
        return true;
    }


    public static int[] stockSpan(int n,int[] price){
        int[] span=new int[price.length];
        span[0]=1;
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=1;i<n;i++){
            while(!(st.empty()) && (price[i]>=price[st.peek()])){
                st.pop();
            }
            if(!st.empty()){
                span[i]=i-st.peek();
            }
            else{
                span[i]=i+1;
            }
            st.push(i);
        }
        return span;
    }


    public static int maxRectangleInHistogram(int arr[]){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int mxArea=0;
        for(int i=0;i<n;i++){
            while(!st.empty() && arr[i]<arr[st.peek()]){
                int height=arr[st.pop()];
                int width=st.empty()?i:i-st.peek()-1;
                mxArea=Math.max(mxArea,height*width);
            }
            st.push(i);
        }
        return mxArea;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while(t-->0) {
        //     int n = sc.nextInt();
        //     int arr[] = new int[n];
        //     for (int i = 0; i < arr.length; i++) {
        //         arr[i] = sc.nextInt();
        //     }
        //     System.out.println(validInvalid(arr));
        // }


        
        int n=6;
        int price[]={31,27,14,21,30,22}; //1 1 1 2 4 1
        int span[]=stockSpan(n, price);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }


        System.out.println();
        int heights[]={2,1,5,6,2,3};
        System.out.println(maxRectangleInHistogram(heights)); //10
    }
}

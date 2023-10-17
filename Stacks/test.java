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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(validInvalid(arr));
        }
    }
}

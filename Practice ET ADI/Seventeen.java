import java.util.*;
public class Seventeen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String strArr[]=str.split(" ");
        int arr[]=new int[strArr.length];
        for(int i=0;i<strArr.length;i++){
            arr[i]=Integer.parseInt(strArr[i]);
        }
        int ans=1;
        for(int i=0;i<arr.length;i++){
            int even=0;
            int odd=0;
            for(int j=0;j<arr.length;j++){
                if(j!=i){
                    if(j%2==0)
                        even+=arr[j];
                    else
                        odd+=arr[j];
                }
            }
            if(even==odd){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
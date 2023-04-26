import java.util.*;

class SecondMax{
    public static void main(String[] args) {
        int arr[]={2,36,5,1,17,8};
        int l=arr.length;
        int max=arr[0];
        int sm=arr[0];
        for(int i=1;i<l;i++){
            if(arr[i]>max){
                sm=max;
                max=arr[i];
            }
            else if((arr[i]>sm) && (arr[i]<max)){
                sm=arr[i];
            }
        }
        System.out.println(max+" "+sm);
    }
}
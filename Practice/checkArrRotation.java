import java.util.*;
/*
 3 4 5 1 2
 */
class checkArrRotation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={3,4,5,1,2};
        int min=arr[0];
        int min_index=0;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
                min_index=i;
            }
        }
        System.out.println(min_index);
    }
}
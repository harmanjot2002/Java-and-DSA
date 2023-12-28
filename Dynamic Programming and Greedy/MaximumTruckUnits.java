import java.util.*;
public class MaximumTruckUnits {
    public static int MaximumTruckUnits(int arr[][],int truckSize){
        int ans=0;
        Arrays.sort(arr,(a,b)->Integer.compare(b[1],a[1]));
        for(int[] box:arr){
            int boxes=box[0];
            int units=box[1];
            if(truckSize>boxes){
                ans+=boxes*units;
                truckSize-=boxes;
            }
            else{
                ans+=truckSize*units;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[][]={{5,10},{2,5},{4,7},{3,9}};
        int truckSize=10;
        System.out.println(MaximumTruckUnits(arr,truckSize)); //91
    }    
}
import java.util.*;
public class GoodPairs {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,1,1,3};
        HashMap<Integer,Integer> hm=new HashMap<>();
        int cnt=0;
        for(int num:arr){
            if(hm.containsKey(num)){
                cnt+=hm.get(num);
                hm.put(num,hm.get(num)+1);
            }
            else{
                hm.put(num,1);
            }
        }      
        System.out.println(cnt); //4
    }
}

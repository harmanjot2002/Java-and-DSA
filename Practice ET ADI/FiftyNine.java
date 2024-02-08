import java.util.*;

public class FiftyNine {
    /*
    Sample Input 1
    1 1 2 2 3 4 4
    Sample Output 1
    3
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] strArr=str.split(" ");
        int[] intArr=new int[strArr.length];
        for(int i=0;i<strArr.length;i++){
            intArr[i]=Integer.parseInt(strArr[i]);
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<intArr.length;i++){
            if(hm.containsKey(intArr[i])){
                hm.put(intArr[i],hm.get(intArr[i])+1);
            }
            else{
                hm.put(intArr[i],1);
            }
        }      
        for(Map.Entry<Integer,Integer> ele:hm.entrySet()){
            if(ele.getValue()==1){
                System.out.println(ele.getKey());
                break;
            }
        }  
    }
}
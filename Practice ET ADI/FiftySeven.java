import java.util.*;

public class FiftySeven {
    /*
    Sort array indices
    6
    2 6 4 8 2 6
    op:3 1 5 2 0 4
     */
    public static void sortIndices(int arr[],int n){
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(arr[i]);
        }
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],i);
        }
        for(int i=0;i<al.size();i++){
            if(hm.get(al.get(i))!=-1){
                System.out.print(hm.get(al.get(i))+" ");
                hm.put(al.get(i),-1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sortIndices(arr,n);
    }
}

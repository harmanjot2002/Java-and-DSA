import java.util.*;

public class ZeroSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //10
        ArrayList<Integer> al=new ArrayList<>(); //3 4 -7 3 1 3 1 -4 -2 -2
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                ArrayList<Integer> nal=new ArrayList<>();
                for(int k=i;k<=j;k++){
                    nal.add(al.get(k));
                }
                int sum=0;
                for(int s=0;s<nal.size();s++){
                    sum+=nal.get(s);
                }
                if(sum==0){
                    System.out.println(nal);
                }
            }
        }
    }
}

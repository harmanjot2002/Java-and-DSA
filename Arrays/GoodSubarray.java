import java.util.*;

public class GoodSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        int ans=0;
        for(int i=s;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                ArrayList<Integer> nal=new ArrayList<>();
                for(int k=j;k<i+j;k++){
                    nal.add(al.get(k));
                }
                HashSet<Integer> hs=new HashSet<>();
                hs.addAll(nal);
                if(hs.size()==s){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

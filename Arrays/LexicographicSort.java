import java.util.*;
public class LexicographicSort {
    public static void main(String[] args) {
        int n=15;
        String str[]=new String[n];
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=15;i++){
            str[i-1]=Integer.toString(i);
        }
        Arrays.sort(str);
        for(int i=0;i<15;i++){
            al.add(Integer.parseInt(str[i]));
        }
        System.out.println(al); //[1, 10, 11, 12, 13, 14, 15, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}

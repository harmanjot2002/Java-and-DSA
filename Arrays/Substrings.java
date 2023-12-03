import java.util.ArrayList;
import java.util.HashSet;

public class Substrings {
    public static int longestUniqueSubstring(String s){
        HashSet<Character> hs=new HashSet<>();
        int mx=0;
        int start=0;
        int end=0;
        int n=s.length();
        while(end<n){
            if(!hs.contains(s.charAt(end))){
                hs.add(s.charAt(end));
                mx=Math.max(mx,end-start+1);
                end++;
            }
            else{
                hs.remove(s.charAt(start));
                start++;
            }
        }
        return mx;
    }


    public static void allSubStrings(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void allSubsequence(String str){
        char[] charr=str.toCharArray();
        int n=charr.length;
        for(int i=0;i<Math.pow(2,n);i++){
            ArrayList<Character> al=new ArrayList<>();
            for(int j=0;j<n;i++){
                if((i & (1<<j))!=0){
                    al.add(charr[j]);
                }
            }
            System.out.println(al);
        }
    }
    public static void main(String[] args) {
        //Length of Longest substring without repeating characters
        // String str="chitkarac";
        // System.out.println(longestUniqueSubstring(str)); //7


        //Print all substrings
        // String str="abbd";
        // allSubStrings(str);
        /*
        a
        ab
        abb
        abbd
        b
        bb
        bbd
        b
        bd
        d
         */


         //generate subsequence
        String str="abc";
        char[] charr=str.toCharArray();
        int n=charr.length;
        for(int i=0;i<Math.pow(2,n);i++){
            ArrayList<Character> al=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i & (1<<j))!=0){
                    al.add(charr[j]);
                }
            }
            System.out.println(al);
        }
        /*
        []
        [a]   
        [b]   
        [a, b]
        [c]   
        [a, c]
        [b, c]
        [a, b, c]
        */
    }
}

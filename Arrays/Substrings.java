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
            for(int j=0;j<n;j++){
                if((i& 1<<j)!=0){
                    al.add(charr[j]);
                }
            }
            System.out.println(al);
        }
    }

    public static String longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        // Backtrack to find the actual LCS
        int i = n, j = m;
        StringBuilder result = new StringBuilder();
        while (i > 0 && j > 0) {
            if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                result.insert(0, text1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        return result.toString();
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
        // String str="abc";
        // allSubsequence(str);
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


        //Longest common subsequnece
        String ans=longestCommonSubsequence("babbab","abaaba");
        System.out.println(ans);
    }
}

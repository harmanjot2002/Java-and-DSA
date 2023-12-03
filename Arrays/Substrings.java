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

    public static void main(String[] args) {
        //Length of Longest substring without repeating characters
        String str="chitkarac";
        System.out.println(longestUniqueSubstring(str)); //7
    }
}

public class StringsPractice {
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        //Print all substrings of given string
        /*
        String str="abcd";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
        */

        //Toggle Case
        /*
        StringBuilder str2=new StringBuilder("Harmanjot Kaur");
        for(int i=0;i<str2.length();i++){
            boolean flag=true;
            char ch=str2.charAt(i);
            int asci=(int)ch;
            if(ch==' ')
                continue;
            if(asci>=97)
                flag=false;
            if(flag==true){
                asci+=32;
                char dh=(char)asci;
                str2.setCharAt(i, dh);
            }
            else{
                asci-=32;
                char dh=(char)asci;
                str2.setCharAt(i, dh);
            }
        }
        System.out.println(str2);
        */

        //Toggle case using strings
        /*
        String str3="Navreet Kaur";
        for(int i=0;i<str3.length();i++){
            boolean flag=true;
            char ch=str3.charAt(i);
            int asci=(int)ch;
            if(ch==' ')
                continue;
            if(asci>=97)
                flag=false;
            if(flag==true){
                asci+=32;
                char dh=(char)asci;
                str3=str3.substring(0,i)+dh+str3.substring(i+1);
            }
            else{
                asci-=32;
                char dh=(char)asci;
                str3=str3.substring(0,i)+dh+str3.substring(i+1);
            }
        }
        System.out.println(str3);
        */

        //Count Palindromic substrings
        /*
        String str="abbd";
        int cnt=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(isPalindrome(str.substring(i,j))){
                    System.out.print(str.substring(i,j)+" ");
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        */

        //Reverse each word in string
        //I ma na rotacude
        // String str="I am an educator";
        // String ans="";
        // StringBuilder sb=new StringBuilder("");
        // for(int i=0;i<str.length();i++){
        //     char ch=str.charAt(i);
        //     if(ch!=' '){
        //         sb.append(ch);
        //     }
        //     else{
        //         sb.reverse();
        //         ans+=sb;
        //         ans+=" ";
        //         sb.delete(0,sb.length());
        //     }
        // }
        // sb.reverse();
        // ans+=sb;
        // System.out.println(ans);
        

        //Compress string
        /*
        String str="aaabbbbcdddee";
        String ans=""+str.charAt(0);
        int cnt=1;
        for(int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            char prev=str.charAt(i-1);
            if(curr==prev){
                cnt++;
            }
            else{
                if(cnt>1)
                    ans+=cnt;
                cnt=1;
                ans+=curr;
            }
        }
        if(cnt>1)
            ans+=cnt;
        System.out.println(ans);
        */


        //Reverse string with preserved space positions
        String str="This is a long string with spaces in between all words";
        char[] charArr=str.toCharArray();
        int low=0;
        int high=charArr.length-1;
        while(low<high){
            if(charArr[low]==' '){
                low++;
            }
            else if(charArr[high]==' '){
                high--;
            }
            else{
                char temp=charArr[low];
                charArr[low]=charArr[high];
                charArr[high]=temp;
                low++;
                high--;
            }
        }
        for(Character i:charArr){
            System.out.print(i); //sdro wl l anee wtebni seca pshtiw gn irtsgno las isihT
        }
    }
}

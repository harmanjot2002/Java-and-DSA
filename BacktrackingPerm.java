public class BacktrackingPerm {
    public static void perm(String str,String perm,int ind){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            perm(newStr,perm+ch,ind+1);
        }
    }
    public static void main(String[] args) {
        String str="ABC";
        perm(str,"",0);
    }
}

import java.util.*;
/*\
racecar
cec 2-4
aceca 1-5
racecar 0-6
 */
public class Nineteen {
    public static boolean isPal(String str){
        String rev=new StringBuilder(str).reverse().toString();
        return rev.equals(str);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length()+1;j++){
                if(isPal(str.substring(i,j)) && str.substring(i,j).length()!=1){
                    al.add(str.substring(i,j)+" "+i+"-"+(j-1));
                }
            }
        }
        for(int i=al.size()-1;i>=0;i--){
            System.out.println(al.get(i));
        }
    }
}

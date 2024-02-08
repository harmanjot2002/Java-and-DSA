import java.util.*;
public class Sixty {
    /*
    Starting index in string
    Lorem ipsum dolor sit amet, consectetur adipiscing elit.
    Ipsum
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String sub=sc.next();
        str=str.toLowerCase();
        sub=sub.toLowerCase();
        if(str.contains(sub)){
            System.out.println(str.indexOf(sub));
        }
        else{
            System.out.println(-1);
        }
    }
}

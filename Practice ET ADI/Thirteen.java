import java.util.*;
public class Thirteen {
    /*
    Sample Input 1
    ABc CDeF GHi
    Sample Output 1
    086
    Sample Input 2
    ANil
    Sample Output 2
    0
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] strArr=str.split(" ");
        String ans="";
        for(String ele:strArr){
            int val=0;
            for(int i=0;i<ele.length();i++){
                char ch=ele.charAt(i);
                if(Character.isUpperCase(ch))
                    val+=ch-'A'+1;
                else
                    val-=ch-'a'+1;
            }
            if (val > 9) {
                val = 9;
            } else if (val < 0) {
                val = 0;
            }
            ans+=val;
        }
        System.out.println(ans);

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the space separated words: ");
        // String input = scanner.nextLine();
        // String[] words = input.split(" ");
        // String code = "";

        // for (String word : words) {
        //     int value = 0;
        //     for (int i=0;i<word.length();i++) {
        //         char c=word.charAt(i);
        //         if (Character.isUpperCase(c)) {
        //             value += c - 'A' + 1;
        //         } else {
        //             value -= c - 'a' + 1;
        //         }
        //     }
        //     if (value > 9) {
        //         value = 9;
        //     } else if (value < 0) {
        //         value = 0;
        //     }
        //     code+=value;
        // }

        // System.out.println("The code to open the treasure box is: " + code);
    }
}

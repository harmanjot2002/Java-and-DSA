import java.util.*;

public class Sixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        String[] l = s.split(" ");
        for (int i = l.length - 1; i >= 0; i--)
            System.out.println(i + 1 + " " + l[i]);
        if (n < l.length)
            System.out.println("Present");
        else
            System.out.println("Not Present");
    }

}

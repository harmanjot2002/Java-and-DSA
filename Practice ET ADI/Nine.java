import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String x = "YesYesYesYesYesYesYes";
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (x.indexOf(s) == -1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
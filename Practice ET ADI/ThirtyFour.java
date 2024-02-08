import java.util.Scanner;

/*
Sample Input 1
50

Sample Output 2
240.0
Sample Input 2
75
Sample Output 2
280.0
 */
public class ThirtyFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weightLimit = sc.nextInt();
        double maxValue=0;
        
        int neck=Math.min(weightLimit, 10);
        maxValue+=neck*6;
        weightLimit-=neck;

        int brace=Math.min(weightLimit, 20);
        maxValue+=brace*5;
        weightLimit-=brace;
        
        int ear=Math.min(weightLimit, 30);
        maxValue+=ear*4;
        weightLimit-=ear;
        System.out.println(maxValue);
    }
}

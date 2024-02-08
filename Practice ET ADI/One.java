import java.util.*;
/*
input:
4 // Number of Items
1 1 // Item 1 weight and profit
3 4 // Item 2 weight and profit
4 5 // Item 3 weight and profit
5 7 // Item 4 weight and profit
7 // capacity of the bag
Sample Output 2
9 // Maximum possible profit


Sample Input 1
3 // Number of Items
2 10 // Item 1 weight and profit
3 5 // Item 2 weight and profit
5 15 // Item 3 weight and profit
8 // capacity of the bag
Sample Output 1
25 // Maximum possible profit
 */
import java.util.*;

public class One {
    public static int maxProfit(int arr[][], int n, int w) {
        
        int pro[]=new int[n];
        int wei[]=new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                wei[i]=arr[i][0];
                pro[i]=arr[i][1];
            }
        }  

        int res = 0;
        HashMap<Double, List<Integer>> hm = new HashMap<>();
        TreeMap<Double, List<Integer>> tm = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            List<Integer> al = new LinkedList<>();
            al.add(pro[i]);
            al.add(wei[i]);
            hm.put((double) pro[i] / (double) wei[i], al);
        }
        tm.putAll(hm);
        for (var ele : tm.entrySet()) {
            if (ele.getValue().get(1) <= w) {
                res += ele.getValue().get(0);
                w -= ele.getValue().get(1);
            } else {
                res += (int) (ele.getValue().get(0) * ((double) w / ele.getValue().get(1)));
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int w = sc.nextInt();
        System.out.println(maxProfit(arr, n, w));
    }
}

import java.util.*;

public class FractionalKnapsackProblem {
    public static int FractionalKnapsack(int p[], int w[], int sack) {
        int ans = 0;
        HashMap<Double, List<Integer>> hm = new HashMap<>();

        for (int i = 0; i < p.length; i++) {
            int pro = p[i];
            int wei = w[i];
            double ratio = (double) pro / wei; // Use double for ratio to avoid precision loss
            List<Integer> al = new ArrayList<>();
            al.add(pro);
            al.add(wei);
            hm.put(ratio, al);
        }

        TreeMap<Double, List<Integer>> tm = new TreeMap<>(Collections.reverseOrder());
        tm.putAll(hm);

        for (Map.Entry<Double, List<Integer>> ele : tm.entrySet()) {
            if (ele.getValue().get(1) < sack) {
                ans += ele.getValue().get(0);
                sack -= ele.getValue().get(1);
            } else {
                ans += sack * ele.getKey(); // Use ele.getKey() for the ratio
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int p[] = { 120, 100, 60 };
        int w[] = { 17, 13, 8 };
        int sack = 20;
        System.out.println(FractionalKnapsack(p, w, sack)); //152

    }
}

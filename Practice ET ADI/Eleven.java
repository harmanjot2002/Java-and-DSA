import java.util.*;
/*
Input:
8
10 22 9 33 21 50 41 60
Output:
5
 */
public class Eleven {
    public static int lengthOfLIS(int[] nums) {
        TreeSet<Integer> lts = new TreeSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            var ele = lts.ceiling(nums[i]);
            if (ele != null)
                lts.remove(ele);
            lts.add(nums[i]);
        }
        System.out.println(lts);
        return lts.size();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(lengthOfLIS(arr));
    }
}

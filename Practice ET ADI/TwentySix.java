import java.util.*;

class TwentySix {
    static int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0)
            return 0;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int cnt=1;
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=end){
                cnt++;
                end=intervals[i][1];
            }
        }
        return intervals.length-cnt;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] intervals = new int[n][2];
        for (int i = 0; i < n; i++) {
            intervals[i][0] = scanner.nextInt();
            intervals[i][1] = scanner.nextInt();
        }

        System.out.println(eraseOverlapIntervals(intervals));
        scanner.close();
    }
}
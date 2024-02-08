import java.util.*;
/*
Sample Input 1
applepie
5
apple
pie
applep
ap
P
Sample Output 1
Yes

Sample Input 2
cars
1
car
Sample Output 2
No
 */
class TwentyNine {
    static boolean wordBreak(String s, List<String> wordDict) {
        if (s.isEmpty()) {
            return true;
        }
        Set<String> hs = new HashSet<>(wordDict);
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            if (hs.contains(prefix) && wordBreak(s.substring(i), wordDict)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();

        List<String> wordDict = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            wordDict.add(scanner.next());
        }

        if (wordBreak(s, wordDict)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}

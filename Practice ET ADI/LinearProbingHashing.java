import java.util.Scanner;
/*
Sample Input 1:
4
3 2 13 1
Sample Output 1:
1 2 3 13
Sample Input 2:
4
3 13 1 4
Sample Output 2:
4 1 3 13
 */
public class LinearProbingHashing {
    static int[] hashTable;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        hashTable = new int[5];
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            insert(num);
        }
        printHashTable();
        scanner.close();
    }

    private static void insert(int num) {
        int index = num % 5;
        while (hashTable[index] != 0) {
            index = (index + 1) % 5;
        }
        hashTable[index] = num;
    }

    private static void printHashTable() {
        for (int num : hashTable) {
            if(num!=0)
                System.out.print(num + " ");
        }
    }
}

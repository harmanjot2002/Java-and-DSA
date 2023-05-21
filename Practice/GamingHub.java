/* 
In a gaming hub, N number of players were playing the same type of game. All players
got stuck at the pillar level in the game, each with a different score. The owner of the gaming
hub announced that players can pass that level if they can break two pillars. Both pillars have
their own health points. The trick is to break the pillar at a time if a score equal to the pillar's
health is obtained by multiplying the player's current score with any number. The same trick is
to be used for both pillars. If no number can be multiplied by the player's score to make the
score equal to the pillar's health, then that player loses. If the player is not able to break both
pillars, then he will not be able to clear the level. Write a Java program to find the total number
of players who will clear that level of the game.
Input Format:
The first line of the input consists of an integer -num Players representing the number of
players (N).
The second lines consist of N space-separated integers - score1, score2, ..., scoreN,
representing the score of each player. The last line of the input consists of two integers -
health1, health2 representing the health of both the pillars respectively.
Output Format
Print the count of the players who will clear that level of the game
Sample Input 1
5
15 5 3 7 9
90 30
Sample Output 1
3
Explanation
Scores 15, 5 and 3 can be multiplied by another number to get 90 and 30 which will break the
pillar. So, the output is 3.
Sample Input 2
5
15 5 3 7 9
135 90
Sample Output 2
4
Explanation
Scores 15, 5, 3, 9 can be multiplied by another number to get 135 and 90 which will break the
pillar. So, the output is 4.
*/

import java.util.*;
class GamingHub{
    public static int fun(int n, int arr[], int x, int y){
        int i, count = 0;
        for(i = 0; i < n; i++){   
            if(x % arr[i] == 0 && y % arr[i] == 0)
            count++;
        }
        return count;
    }
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.print(fun(n, arr, x, y));
    }
}
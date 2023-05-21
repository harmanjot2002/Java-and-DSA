/*
 Q18: Andrew manages a pipe warehouse. He wishes to automate the process of transferring
the pipes from the warehouse to the carrier truck. There are N pipes with a length of 1 to 9 units
placed in the warehouse vertically along a wall. In the automated system, a drone picks the
pipes by length and carries them to the carrier truck. In each turn, the drone moves from left to
right to find the pipe, whose length is greater than the pipe on its left. After finding the pipe,
the drone takes the pipe to the carrier truck. The drone repeats this process until it has no more
pipes to pick or no pipe meets the above-said criteria. Write a Java program to output the length
of pipes, which will remain in the warehouse after the drone has completed this process.
Input Format
The first line of the input consists of an integer - numOfPipes, representing the number of
pipes in the warehouse (N).
The second line consists of N space-separated integers - len[0], len[1], .... len[N-1],
representing the length of the pipes.
Output Format
Print integers representing the length of the remaining pipes in the warehouse. Don’t print
any space between integers
Sample Input 1
5
4 5 2 1 3
Sample Output 1
421
Explanation
In the first turn, the drone picks the pipe with length 5 as 5 > 4. So, the remaining pipes are 4,
2, 1, and 3.
In the next turn, the drone picks the pipe with length 3 as 3 > 1. So, the remaining pipes are
4, 2, and 1.

DO NOT WRITE ANYTHING ON QUESTION PAPER EXCEPT ROLL NO.

CA109/2022 8 -2023

Sample Input 2
5
3 2 4 6 5
Sample Output 2
32
Explanation
In the first turn, the drone picks the pipe with length 4 as 4 > 2. So, the remaining pipes are 3,
2, 6, and 5.
In the next turn, the drone picks the pipe with length 6 as 6 > 2. So, the remaining pipes are 3,
2, and 5.
In the next turn, the drone picks the pipe with length 5 as 5 > 2. So, the remaining pipes are 3
and 2.
 */

import java.util.*;

class pipeWarehouse{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in) ;
        int n = scan.nextInt() ;
        int [] pipes = new int[n] ;
        for(int i = 0 ; i<n ; i++){
            pipes[i] = scan.nextInt() ;
        }
        System.out.print(pipes[0]) ;
        int temp = pipes[0];
        for(int i = 1 ; i<n ; i++){
            if(pipes[i]<temp){
                System.out.print(pipes[i]);
                temp = pipes[i];
            }
        }
    }
}
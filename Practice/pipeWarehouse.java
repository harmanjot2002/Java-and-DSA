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
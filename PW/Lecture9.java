import java.util.Scanner;

public class Lecture9{
    public static void main(String[] args) {
        int h=3,w=6, i, j;
		for(i = 1; i <= h; i++){
			for(j = 1; j <= w; j++){
				System.out.print("*");
			}
			System.out.println();
		}	



        for (i = 0; i < h; i++){
            System.out.println();
            for (j = 0; j < w; j++){
                if (i == 0 || i == h-1 || j== 0 || j == w-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
        } 
        System.out.println(); 
        System.out.println(); 

        for(i = 1; i <= h; i++){
			for(j = 1; j <= w; j++){ 
                if(j%2==0){
			        System.out.print(" ");
			    }
			    else{
			    	System.out.print("*"); 
                }
			}
			System.out.println(); 
        }

        
        System.out.println(); 
        System.out.println(); 
        int n=4;
        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
        System.out.println();
        } 


        for(i=1;i< n+1 ;i++){
            for(j=i; j < n+1 ;j++){
                System.out.print(j + " ");
            }
            for(int k=1; k < i ;k++){
                System.out.print(k + " ");
            }
        System.out.println();
        }


        System.out.println();
        System.out.println();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j+"");
            }
            System.out.println();
        } 

        System.out.println();
        System.out.println();
        
    }
}
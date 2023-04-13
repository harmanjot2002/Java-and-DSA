class pattern{
    public static void main(String[] args) {
        /*
        for(int i=1;i<=5;i++){
            for(int j=i+1;j<=5+i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        */

        /*
        int k=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.printf("%2d ",k);
                k++;
            }
            System.out.println("");
        }
        */

        /*
        int k=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%02d ",k);
                k++;
            }
            System.out.println(" ");
        }
        */


        /*
        int k=1;
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println(" ");
        }
        */

        /*
        for(int i=1;i<=5;i++){
            for(int s=0;s<i-1;s++){
                System.out.print("/");
            }
            for(int j=0;j<=5-i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        */


        for(int i=1;i<=5;i++){
            for(int s=1;s<=5-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
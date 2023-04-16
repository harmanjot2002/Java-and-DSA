class gcd{
    static int gcd(int x,int y){
        // int min=0;
        // int fact=1;
        // if(x<y)
        //     min=x;
        // else
        //     min=y;
        // for(int i=1;i<min;i++){
        //     if(x%i==0 && y%i==0){
        //         fact=i;
        //     }
        // }
        // return fact;
        while(x!=y){
            if(y<x)
                x=x-y;
            else
                y=y-x;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(gcd(35,56));
    }
}
class maxInArr{
    static int max(int arr[]){
        int max=arr[0];
        for(int x:arr){
            if(max<x){
                max=x;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,1,0};
        System.out.println(max(arr));
    }
}
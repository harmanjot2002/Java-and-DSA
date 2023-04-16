class sort{
    public static void main(String[] args) {
        String arr[]={"java","python","pythons","c"};
        java.util.Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
        int arr2[]={43,21,65,76,98,32,54,76};
        java.util.Arrays.sort(arr2);
        for(int x:arr2){
            System.out.print(x+" ");
        }
    }
}
import java.util.*;
/*
 2 4 3 1 3 4
2 1
4 2
3 2
1 1
 */
class frequency{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int freq[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int visited=-1;
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=visited;
                }
            }
            if(arr[i]!=visited){
                freq[i]=count;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=visited)
                System.out.println(arr[i]+" "+freq[i]);
        }
    }
}


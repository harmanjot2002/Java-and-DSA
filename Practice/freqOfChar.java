import java.util.*;

class freqOfChar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of characters: ");
        int n=sc.nextInt();
        char str[]=new char[n];
        int freq[]=new int[n];
        for(int i=0;i<n;i++)
            str[i]=sc.next().charAt(0);
        char visited='@';
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;i++){
                if(str[i]==str[j]){
                    count++;
                    str[j]=visited;
                }
            }
            if(str[i]!=visited)
                freq[i]=count;
        }
        for(int i=0;i<n;i++){
            if(str[i]!=visited)
                System.out.println(str[i]+" "+freq[i]);
        }
    }
}
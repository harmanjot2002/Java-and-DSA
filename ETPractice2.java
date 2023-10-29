import java.util.*;

public class ETPractice2 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int cntSetBits(String str){
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                cnt++;
            }
        }
        return cnt;
    }


    //Finding productive character pairs in a string
    public static String proCharaterPairs(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length()-1;i+=2){
           if(str.charAt(i)>str.charAt(i+1)){
            sb.append(str.charAt(i));
           }
           else{
            sb.append(str.charAt(i+1));
           }
        }
        if(str.length()%2!=0)
            sb.append(str.charAt(str.length()-1));
        return sb.toString();
    }


    

    public static void generateSubsequences(String input, String subsequence) {
        if (input.isEmpty()) {
            System.out.println(subsequence);
            return;
        }
        char firstChar = input.charAt(0);
        generateSubsequences(input.substring(1), subsequence + firstChar);
        generateSubsequences(input.substring(1), subsequence);
    }
        

    public static int funnyNumber(int n){
       while(n>0){
        String str=String.valueOf(n);
        int flag=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)<str.charAt(i-1)){
                flag=0;
                break;
            }
        }
        if(flag==1){
            return Integer.parseInt(str);
        }
        n--;
       }
       return 0;
    }



    public static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }



    public static int sumOfPrime(int n){
        int sum=0;
        for(int i=2;i<=n;i++){
            while(n%i==0){
                sum+=i;
                n=n/i;
            }
        }
        return sum;
    }


    public static int binSearch(String arr[],String str){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(str)){
                return i;
            }
        }
        return -1;
    }


    public static boolean isEqual(int[] arr){
        for(int i=0;i<arr.length;i++){
            while(arr[i]%2==0){
                arr[i]/=2;
            }
            while(arr[i]%3==0){
                arr[i]/=3;
            }
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[0]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Remove Strings from LinkedList Based on Comparison
        // int n=sc.nextInt();
        // LinkedList<String> ll=new LinkedList<>();
        // for(int i=0;i<n;i++){
        //     ll.add(sc.next());
        // }
        // String x=sc.next();
        // LinkedList<String> ans=new LinkedList<>();
        // for(String str:ll){
        //     if(str.compareTo(x)>0){
        //         ans.add(str);
        //     }
        // }
        // System.out.println(ans);


        //Java Program to Find the Length of the Longest String Using Recursion.
        // String str=sc.nextLine();
        // int cnt=0;
        // int mx=Integer.MIN_VALUE;
        // for(int i=0;i<str.length();i++){
        //     char ch=str.charAt(i);
        //     if(ch!=' '){
        //         cnt++;
        //         mx=Math.max(mx,cnt);
        //     }
        //     else{
        //         cnt=0;
        //     }
        // }
        // System.out.println(mx);


        //Removing Duplicate Characters from a String.
        // String str=sc.next();
        // String ans="";
        // for(int i=0;i<str.length()-1;i++){
        //     if(str.charAt(i)!=str.charAt(i+1)){
        //         ans+=str.charAt(i);
        //     }
        // }
        // ans+=str.charAt(str.length()-1);
        // System.out.println(ans);


        //Cost of groceries
        // int n=sc.nextInt();
        // int x=sc.nextInt();
        // int[] fresh=new int[n];
        // int[] cost=new int[n];
        // for(int i=0;i<n;i++){
        //     fresh[i]=sc.nextInt();
        // }
        // for(int i=0;i<n;i++){
        //     cost[i]=sc.nextInt();
        // }
        // int ans=0;
        // for(int i=0;i<n;i++){
        //     if(fresh[i]>=x){
        //         ans+=cost[i];
        //     }
        // }
        // System.out.println(ans);



        //Running with Alice and Bob
        // int n=sc.nextInt();
        // int al[]=new int[n];
        // int bo[]=new int[n];
        // for(int i=0;i<n;i++){
        //     al[i]=sc.nextInt();
        // }
        // for(int i=0;i<n;i++){
        //     bo[i]=sc.nextInt();
        // }
        // int cnt=0;
        // for(int i=0;i<n;i++){
        //     if((al[i]<=2*bo[i]) && (bo[i]<=2*al[i])){
        //         cnt++;
        //     }
        // }
        // System.out.println(cnt);


        //Message Processing
        // String str=sc.nextLine();
        // // str=str.replaceAll("\\s","");
        // str=str.replaceAll("( )+", "");
        // String ans=str.substring(0,1).toUpperCase()+str.substring(1);
        // System.out.println(str.trim());


        //Kth element from last in Linked list
        // Node head=null;
        // Node tail=null;
        // while(true){
        //     int in=sc.nextInt();
        //     if(in==-1){
        //         break;
        //     }
        //     Node val=new Node(in);
        //     if(head==null){
        //         head=val;
        //         tail=val;
        //     }
        //     else{
        //         tail.next=val;
        //         tail=val;
        //     }
        // }
        // int k=sc.nextInt();
        // Node slow=head;
        // Node fast=head;
        // for(int i=0;i<k;i++){
        //     fast=fast.next;
        // }
        // while(fast!=null){
        //     slow=slow.next;
        //     fast=fast.next;
        // }
        // System.out.println(slow.data);


        //Recursive Text Search Program
        // String base=sc.nextLine();
        // String occ=sc.nextLine();
        // int pos = base.indexOf(occ);
        // ArrayList<Integer> al=new ArrayList<>();
        // if (pos == -1)
        //     System.out.println("-1");
        // while (pos != -1) {
        //     al.add(pos);
        //     pos = base.indexOf(occ, pos + 1);
        // }
        // System.out.println(al);


        //Reversing a String with Preserved Space Positions.
        // String str=sc.nextLine();
        // char[] charr=str.toCharArray();
        // int low=0;
        // int high=charr.length-1;
        // while(low<high){
        //     if(charr[low]==' '){
        //         low++;
        //     }
        //     else if(charr[high]==' '){
        //         high--;
        //     }
        //     else{
        //         char temp=charr[low];
        //         charr[low]=charr[high];
        //         charr[high]=temp;
        //         low++;
        //         high--;
        //     }
        // }
        // for(Character i:charr){
        //     System.out.print(i);
        // }


        //Find productive character pairs in string
        // String str=sc.next();
        // System.out.println(proCharaterPairs(str));


        //triplet from linked list
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        // int ar[]=new int[a];
        // int br[]=new int[b];
        // int cr[]=new int[c];
        // for(int i=0;i<a;i++){
        //     ar[i]=sc.nextInt();
        // }
        // for(int i=0;i<b;i++){
        //     br[i]=sc.nextInt();
        // }
        // for(int i=0;i<c;i++){
        //     cr[i]=sc.nextInt();
        // }
        // int x=sc.nextInt();
        // for(int i=0;i<a;i++){
        //     for(int j=0;j<b;j++){
        //         for(int k=0;k<c;k++){
        //             if(ar[i]+br[j]+cr[k]==x){
        //                 System.out.print(ar[i]+" "+br[j]+" "+cr[k]);
        //             }
        //         }
        //     }
        // }


        //madhav
        // int n=sc.nextInt();
        // int m=sc.nextInt();
        // int h=3;
        // while(n>0){
        //     if(h%3==2 && h%m!=0){
        //         System.out.println(h);
        //         n--;
        //     }
        //     h++;
        // }


        // shortest string
        // int t = sc.nextInt();
        // sc.nextLine();
        // while (t-- > 0) {
        //     String str = sc.nextLine();
        //     int result = shortestString(str);
        //     System.out.println(result);
        // }


        //Smallest no. divisible by two numbers
        // int n1=sc.nextInt();
        // int n2=sc.nextInt();
        // for(int i=1;i<n1*n2;i++){
        //     if(i%n1==0 && i%n2==0){
        //         System.out.println(i);
        //         break;
        //     }
        // }


        //set bits count
        // int x=5;
        // int cnt=0;
        // for(int i=1;i<=x;i++){
        //     String ans=Integer.toBinaryString(i);
        //     cnt+=cntSetBits(ans);
        // } //1 1 2 1 2 
        // System.out.println(cnt);


       
        //subsequences
        // String input = "abc";
        // generateSubsequences(input, "");



        // int t=sc.nextInt();
        // while(t>0){
        //     int n=sc.nextInt();
        //     int ans=funnyNumber(n);
        //     System.out.println(ans);
        //     t--;
        // }


        // char[] keys={'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        // int n=sc.nextInt();
        // for(int i=0;i<n;i++){
        //     int cnt=0;
        //     for(int j=0;j<10;j++){
        //         char in=sc.next().charAt(0);
        //         if(in==keys[j]){
        //             cnt++;
        //         }
        //     }
        //     System.out.println(cnt);
        // }


        //left-right rotations
        // String str="Hello";
        // int n=str.length();
        // int d=4;
        // if(n<d){
        //     System.out.println(-1);
        // }
        // else{
        //     String left=str.substring(d)+str.substring(0,d);
        //     StringBuilder sb=new StringBuilder(str.substring(0,d));
        //     sb=sb.reverse();
        //     String right=sb.toString()+str.substring(d);
        //     System.out.println(left);
        //     System.out.println(right);
        // }


        
        //Character Insertion in string
    //     String str="TestString";
    //     int arr[]=new int[2];
    //     for(int i=0;i<2;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     StringBuilder sb=new StringBuilder(str);
    //     for (int i = 2 - 1; i >= 0; i--) {
    //         int index = arr[i];
    //         if (index >= 0 && index <= sb.length()) {
    //             sb = sb.insert(index, "*");
    //         } else {
    //             System.out.println("Invalid index: " + index);
    //         }
    //     }
    //    System.out.println(sb.toString());
       /*
        2 5
        Te*stS*tring
        */


        //Contact-Management System
        // int n=sc.nextInt();
        // sc.nextLine();
        // String names[]=new String[n];
        // String mobile[]=new String[n];
        // String email[]=new String[n];
        // for(int i=0;i<n;i++){
        //     String str=sc.nextLine();
        //     String[]strarr=str.split(" ");
        //     names[i]=strarr[0];
        //     mobile[i]=strarr[1];
        //     email[i]=strarr[2];
        // }
        // String find=sc.next();
        // int flag=0;
        // for(int i=0;i<n;i++){
        //     if(names[i].equals(find)){
        //         System.out.println(names[i]);
        //         System.out.println(mobile[i]);
        //         System.out.println(email[i]);
        //         flag=1;
        //         break;
        //     }
        // }
        // if(flag==0){
        //     System.out.println(-1);
        // }


        //Binary Search on songs
        // int n=sc.nextInt();
        // String[] arr=new String[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.next();
        // }
        // String str=sc.next();
        // System.out.println(binSearch(arr, str));


        // int t=sc.nextInt();
        // while(t-->0){
        //     int n=sc.nextInt();
        //     int arr[]=new int[n];
        //     for(int i=0;i<n;i++){
        //         arr[i]=sc.nextInt();
        //     }
        //     String st[]=new String[n];
        //     for(int i=0;i<n;i++){
        //         st[i]=String.valueOf(arr[i]);
        //     }
        //     Comparator <String> cmp=new Comparator<String>(){
        //         public int compare(String str1,String str2){
        //             String s1=str1+str2;
        //             String s2=str2+str1;
        //             return s2.compareTo(s1);
        //         }
        //     };
        //     Arrays.sort(st,cmp);
        //     String ans="";
        //     for(int i=0;i<n;i++){
        //         ans+=st[i];
        //     }
        //     System.out.println(ans);
        // }


        //Question-17
        // int t=sc.nextInt();
        // while(t-->0){
        //     String str=sc.next();
        //     str=str.replace("10","");
        //     str=str.replace("00","");
        //     System.out.println(str.length());
        // }


        //Question-34
        // int n=sc.nextInt();
        // int arr[]=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // if(isEqual(arr)){
        //     System.out.println("YES");
        // }
        // else{
        //     System.out.println("NO");
        // }


        //Generate subsequence
        String s=sc.next();
        char[] charr=s.toCharArray();
        int n=charr.length;
        for(int c=0;c<Math.pow(2,n);c++){
            ArrayList<Character> al=new ArrayList<>();
            for(int i=0;i<n;i++){
                if((c & (1<<i)) != 0){
                    al.add(charr[i]);
                }
            }
            System.out.println(al);
        }
    }
}



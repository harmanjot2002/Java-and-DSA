import java.util.*;
import java.io.*;


class STPractice{
    
    public static boolean isBalanced(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='{' || ch=='[' || ch=='('){
                st.push(ch);
            }
            else if(ch=='}'){
                if(st.empty() || st.peek()!='{'){
                    return false;
                }
                st.pop();
            }
            else if(ch==']'){
                if(st.empty() || st.peek()!='['){
                    return false;
                }
                st.pop();
            }
            else if(ch==')'){
                if(st.empty() || st.peek()!='('){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }

    public static boolean isPalindrome(String ans){
        int lo = 0;
        int hi = ans.length() - 1;
        if (ans.length() == 0) {
            return false;
        } 
        else {
            while (lo <= hi) {
                if (ans.charAt(lo) != ans.charAt(hi)) {
                    return false;
                }
                lo++;
                hi--;
            }
            return true;
        }
        // String str2="";
        // for(int i=0;i<str.length();i++){
        //     str2=str.charAt(i)+str2;
        // }
        // return str.equals(str2);
    }
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        /*
        aaabbbccds
        a3b3c2d1s1
         */
        /*
        String str=sc.next();
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<str.length()){
            int cnt=1;
            char ch=str.charAt(i);
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(j)==ch)
                    cnt++;
            }
            sb.append(ch);
            sb.append(cnt);
            i=i+cnt;
        }
        System.out.println(sb);
        */


        /*
        AbcdTY
        aBCDty
         */
        /*
        String str=sc.next();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z'){
                sb.append((char)(ch+32));
            }
            else{
                sb.append((char)(ch-32));
            }
        }
        System.out.println(sb);
        */


        /*
        6
        4
        3
        John: Tickets booked: 4
        Mike Tickets booked: not booked
         */
        /*
       int n=sc.nextInt();
       int a=sc.nextInt();
       int b=sc.nextInt();
       System.out.println("John: Tickets booked: "+a);
       if(n-a-b>=0){
        System.out.println("Mike Tickets booked: "+b);
       }
       else{
        System.out.println("Mike Tickets booked: not booked");
       }
       */


    
       /*
        5
        1 2 3 4 5
        -13
        java.lang.Exception: Subtract is less than Zero
        */
        /*
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       int diff=arr[0];
       for(int i=1;i<n;i++){
        diff=diff-arr[i];
       }
       System.out.println(diff);
       if(diff>=0)
        System.out.println("java.lang.Exception: Subtract is greater than equal to Zero");
        else
        System.out.println("java.lang.Exception: Subtract is less than Zero");
       */


       /*
        3
        1 2 3 4 5 6 -1
        4
        */
        /*
       int k=sc.nextInt();
       LinkedList<Integer> ll=new LinkedList();
       while(true){
        int n=sc.nextInt();
        if(n!=-1){
            ll.add(n);
        }
        else{
            ll.add(n);
            break;
        }
       }
       Collections.reverse(ll);
       System.out.println(ll.get(k));
       */


       /*
        2
        2
        40 40
        80

        40 40

        5
        10 2 6 8 4
        10
        
        4 6
        */
        /*
       int t=sc.nextInt();
       while(t>0){
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        Arrays.sort(arr);
        int left=0;
        int right=n-1;
        int l1=0;
        int r1=0;
        while(left<right){
            if(arr[left]+arr[right]>k){
                right--;
            }
            else if(arr[left]+arr[right]<k){
                left++;
            }
            else{
                l1=arr[left];
                r1=arr[right];
                left++;
                right--;
            }
        }
        System.out.println(l1+" "+r1);
        t--;
       }
       */


       /*
        5
        30 35 40 38 35
        1 2 3 1 1 END
        */
       /* 
       int n=sc.nextInt();
       int price[]=new int[n];
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
        price[i]=sc.nextInt();
       }
       arr[0]=1;
       for(int i=1;i<n;i++){
        arr[i]=1;
        for(int j=i-1;(j>=0) && (price[i]>=price[j]);j--){
            arr[i]++;
        }
       }
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
       System.out.print("END");
       */


       /*
        cbaeicde
        3
        */
        /*
       String str=sc.next();
       int cnt=0;
       int mx=0;
       for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                cnt++;
            }
            else{
                mx=Math.max(cnt,mx);
                cnt=0;
            }
       }
       System.out.println(mx);
       */



       /*
       String str=sc.next();
       int cnt=0;
       for(int i=0;i<str.length();i++){
        for(int j=i;j<=str.length();j++){
            String ans=str.substring(i,j);
            if(isPalindrome(ans))
                cnt++;
        }
       }
       System.out.println(cnt);
       */


       /*
        5
        -4 -1 0 3 10
        0 1 9 16 100 
        */
        /*
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
       }
       for(int i=0;i<arr.length;i++){
        arr[i]=arr[i]*arr[i];
       }
       Arrays.sort(arr);
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
       */


       /*
        4
        11 13 21 3
        13 21 -1 -1
        */
        /*
       int n=sc.nextInt();
       int arr[]=new int[n];
       int ans[]=new int[n];
       for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        ans[i]=-1;
       }
       for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
                ans[i]=arr[j];
                break;
            }
        }
       }
       for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+" ");
       }
       */


       /*
       String str=sc.next();
       char charArray[]=str.toCharArray();
       int freq[]=new int[str.length()];
       for(int i=0;i<str.length()-1;i++){
        for(int j=i+1;j<str.length();j++){
            if(charArray[i]==charArray[j]){
                freq[i]++;
            }
        }
       }
       int mx=freq[0];
       for(int i=0;i<freq.length;i++){
        if(mx<freq[i]){
            mx=i;
        }
       }
        System.out.println(charArray[mx]);
       */



       /*
       5
        8
        8
        9
        0
        3
        1
        */
        /*
       int n=sc.nextInt();
       int arr[]=new int[n];
       int freq[]=new int[n];
       for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
       }
       for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            if(arr[i]==arr[j]){
                freq[i]++;
            }
        }
       }
       int ans=0;
       for(int i=0;i<freq.length;i++){
        if(freq[i]>1){
            ans=1;
            System.out.println(ans);
            break;
        }
        else{
            System.out.println(ans);
            break;
        }
       }
       */


       /*
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       Arrays.sort(arr);
       int diff=arr[1]-arr[0];
       int ans=1;
       for(int i=2;i<n;i++){
        if(arr[i]-arr[i-1]!=diff){
            ans=0;
            System.out.println("No");
            break;
        }
        else{
            System.out.println("Yes");
            break;
        }
       }
       */


       /*
       String str=sc.next();
       System.out.println(isBalanced(str));
       */


       /*
       String str1=sc.next();
       String str2=sc.next();
       SortedSet<Character> ts=new TreeSet<>();
       for(int i=0;i<str1.length();i++){
        for(int j=0;j<str2.length();j++){
            if(str1.charAt(i)==str2.charAt(j)){
                break;
            }
            else if(j==str2.length()-1){
                ts.add(str1.charAt(i));
                break;
            }
        }
       }
       for(int i=0;i<str2.length();i++){
        for(int j=0;j<str1.length();j++){
            if(str1.charAt(j)==str2.charAt(i)){
                break;
            }
            else if(j==str1.length()-1){
                ts.add(str2.charAt(i));
                break;
            }
        }
       }
       Object arr[]=ts.toArray();
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println(ts);
       */


       /*
       String str1="Harmanjot Kaur";
       String str2="Kaur";
       int ind=str1.indexOf(str2);
       System.out.println(ind);
       */



       /*
       String s="abcabcbb";
       int max=0;
        for(int i=0;i<s.length();i++){
            int cnt=0;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)!=s.charAt(j)){
                    cnt++;
                    if(cnt>max){
                        max=cnt;
                    }
                }
            }
        }
       System.out.println(max);
       */



        /*
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int n=sc.nextInt();

        ArrayList<String> al=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(in.readLine());
        }     
    
        Collections.sort(al);
        for(String str:al)
            System.out.println(str);
        */


        /*
        int n=sc.nextInt();
        int k=sc.nextInt();
        int in[]=new int[n];
        String str[]=new String[n];
        for(int i=0;i<n;i++){
            in[i]=sc.nextInt();
            str[i]=sc.next();
        }
        if(k<n){
            System.out.println(str[k-1]);
        }
        else{
            System.out.println("Not found");
        }
        */


        /*
        String str="My!@#Ana%*#tomy";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
        */


        String str=sc.nextLine();
        String strArr[]=str.split("\\s");
        String rev="";
        for(String i:strArr){
            StringBuilder sb=new StringBuilder(i);
            sb.reverse();
            rev+=" "+sb.toString();
        }
        System.out.println(rev.trim());
    }
}
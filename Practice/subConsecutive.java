import java.util.*;
class subConsecutive{

    Scanner sc = new Scanner(System.in);
    public static final subConsecutive myarr = new subConsecutive();
    public static final int[] Arr = new int[5];
    public void input(){
        for(int i=0; i<5; i++){
            Arr[i]=sc.nextInt();
        }
    }
    public void max(){
        int max = 0;
        for (int i =0 ;i<5;i++){
            if (Arr[i] > max){
                max = Arr[i];
            }
        }
        System.out.println(max);
    }
    public void min(){
        int min = 10;
        for (int i =0 ;i<5;i++){
            if (Arr[i] < min){
                min = Arr[i];
            }
        }
        System.out.println(min);
    }
    public void subfn(){
        int sub = Arr[0];
        for (int i =1 ;i<5;i++){
            sub = sub - Arr[i];
        }
        System.out.println(sub);
        if (sub<0){
            System.out.print("Subtraction result is less than Zero");
        }
        else{
            System.out.print("Subtraction result is greater than or equal to Zero");
        }
    }
    public static void main(String[] args){
        
        myarr.input();
        myarr.max();
        myarr.min();
        myarr.subfn();
    }
}
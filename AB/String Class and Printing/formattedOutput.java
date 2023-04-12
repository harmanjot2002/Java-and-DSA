public class formattedOutput{
    public static void main(String[] args) {
        int x=10;
        float y=12.56f;
        char z='A';
        String str="Java Program";
        System.out.printf("%3$s %2$f %1$d",x,y,str);
        //System.out.printf("Hello %d %f %c %s\n",x,y,z,str);
        //%o,%x,%e for float value

         /*int a=10;//a=-10
        System.out.printf("%05d",a);*/
        
        /*float a=123.45f;//3.45f
        System.out.printf("%6.2f",a);*/
        
        String str1="Java";
        System.out.printf("%20s",str1);
    }
    
}
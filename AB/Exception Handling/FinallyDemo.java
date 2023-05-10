public class FinallyDemo {
    static void meth1()throws Exception{
        try{
            throw new Exception();
        }
        finally{
           //this message will definitly execute 
            System.out.println("Final Message");
        }
    }
    public static void main(String[] args) {
        try{
            meth1();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }   
}
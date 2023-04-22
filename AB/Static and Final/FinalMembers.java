class Test2{
    public final void show(){
        System.out.println();
    }
}
class Test1 extends Test2{
    //public void show(){}
    //gives error as final methods cannot be overloaded.
}

public class FinalMembers{
    /*final float PI;
    public FinalDemo(){
        PI=3.1425f;
    }*/
    public static void main(String[] args) {
        final float PI;
        PI=3.1425f;
        System.out.println(PI);
    }
}
class OuterLocal{
    int x=10;
    static int y=20;
    static class My{
        public void show(){
            System.out.println(y);
        }
    }
}

public class LocalStatic {
    public static void main(String[] args) {
        OuterLocal.My m=new OuterLocal.My();
        m.show();
    }
    
}
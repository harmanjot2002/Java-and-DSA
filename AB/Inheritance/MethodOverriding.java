class SuperClass{
    public void display(){
        System.out.println("Hello");
    }
}
class SubClass extends SuperClass{
    @Override
    public void display(){
        System.out.println("Hello Welcome");
    }
    public void display2(){
        System.out.println("Method of only sub class");
    }
}

public class MethodOverriding{
    public static void main(String[] args) {
        SuperClass sup=new SuperClass();
        sup.display();
        // sup.display2();

        SubClass sub=new SubClass();
        sub.display();
        // sub.display2();

        SuperClass su=new SubClass();
        su.display();
        // su.display2();

    }
}
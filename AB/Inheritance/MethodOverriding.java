class SuperClass{
    public void display(){
        System.out.println("Hello");
    }
}
class SubClass extends SuperClass{
    public void display(){
        System.out.println("Hello Welcome");
    }
}

public class MethodOverriding{
    public static void main(String[] args) {
        SuperClass sup=new SuperClass();
        sup.display();

        SubClass sub=new SubClass();
        sub.display();

        SuperClass su=new SubClass();
        su.display();

    }
}
class Parent{
    public Parent(){
        System.out.println("Constructor of Parent Class Called");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Constructor of Child Class Called");
    }
}
class GrandChild extends Child{
    public GrandChild(){
        System.out.println("Constructor of Grand Child Class Called");
    }
}

public class ConstructorInherit{
    public static void main(String[] args) {
        GrandChild c=new GrandChild();
    }
}
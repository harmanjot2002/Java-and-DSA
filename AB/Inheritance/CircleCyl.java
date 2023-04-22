class Circle{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}

class Cylinder extends Circle{
    public double height;
    public double volume(){
        return area()*height;
    }
}
public class CircleCyl{
    public static void main(String[] args) {
        Circle ci=new Circle();
        ci.radius=2;
        System.out.println(ci.area());
        Cylinder cy=new Cylinder();
        cy.radius=3;
        cy.height=4;
        System.out.println(cy.area());
    }
}
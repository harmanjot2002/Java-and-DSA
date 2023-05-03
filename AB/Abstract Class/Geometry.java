abstract class Shape{
    abstract double perimeter();
    abstract double area();
}

class Circle extends Shape{
    double r;
    @Override
    double perimeter(){
        return 2*Math.PI*r;
    }
    @Override
    double area(){
        return Math.PI*r*r;
    }
}

class Rectangle extends Shape{
    double length;
    double breadth;
    @Override
    double area(){
        return length*breadth;
    }
    double perimeter(){
        return 2*(length+breadth);
    }
}
class Geometry{
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=10;
        r.breadth=5;
        System.out.println(r.area());
        Shape s=r;
        System.out.println(s.area());
    }
}
class Cylinder{
    public double radius;
    public double height;
    public double lidArea(){
        return Math.PI*radius*radius;
    }
    public double totalSurfaceArea(){
        return 2*lidArea()+circumference();
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
    public double volume(){
        return radius*radius*radius;
    }
}

public class ClassCylinder{
    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        c.radius=7;
        c.height=10;
        System.out.println(c.lidArea());
    }
}
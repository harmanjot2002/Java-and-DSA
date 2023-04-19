class Class{
    double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}

class ClassCircle{
    public static void main(String[] args) {
        Class c=new Class();
        Class c2=new Class();
        c.radius=12;
        c2.radius=4;
        System.out.printf("%.4f",c.area());
        System.out.println();
        System.out.println(c.perimeter());
        System.out.printf("%.4f",c2.area());
        System.out.println();
        System.out.println(c2.perimeter());
    }
}
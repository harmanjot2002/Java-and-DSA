class Rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    boolean isSquare(){
        if(length==breadth)
            return true;
        return false;
    }
}
class classRectangle{
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=2;
        r.breadth=3;
        System.out.println(r.area());
        System.out.println(r.isSquare());
        if(r.isSquare()==true)
            System.out.println("This rectangle is also a square");
        else
            System.out.println("This rectangle is not a square");
    }
}
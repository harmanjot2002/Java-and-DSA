class ConstructorRectangle{
    private double length;
    private double breadth;
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public void setLength(double l){
        if(l>0)
            length=l;
        else    
            length=0;
    }
    public void setBreadth(double b){
        if(b>0)
            breadth=b;
        else    
            breadth=0;
    }
    public ConstructorRectangle(){

    }
    // public ConstructorRectangle(){
    //     length=1;
    //     breadth=2;
    // }
    public ConstructorRectangle(double l,double b){
        setLength(l);
        setBreadth(b);
    }
    public ConstructorRectangle(double s){
        length=breadth=s;
    }
    public double area(){
        return length*breadth;
    }
}
public class Constructors{
    public static void main(String[] args) {
        ConstructorRectangle cr=new ConstructorRectangle();
        System.out.println(cr.area());       
        ConstructorRectangle cr2=new ConstructorRectangle(3,2);
        System.out.println(cr2.area()); 
        ConstructorRectangle cr3=new ConstructorRectangle(3);
        System.out.println(cr3.area());             
    }
}
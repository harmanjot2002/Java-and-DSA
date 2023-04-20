class Data{
    private double length;
    private double breadth;
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public void setLength(int l){
        if(l>0)
            length=l;
        else    
            length=0;
    }
    public void setBreadth(int b){
        if(b>0)
            breadth=b;
        else    
            breadth=0;
    }
    public double area(){
        return getLength()*getBreadth();
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
}

public class DataHiding{
    public static void main(String[] args) {
        Data d=new Data();
        // d.length=2;
        // d.breadth=3;
        d.setLength(2);
        d.setBreadth(3);
        System.out.println(d.area());
        System.out.println(d.perimeter());
        System.out.println(d.getLength());
    }
}
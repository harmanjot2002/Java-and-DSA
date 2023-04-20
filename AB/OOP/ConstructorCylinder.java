class ConstructCylinder{
    private int radius;
    private int height;
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public void setRadius(int r){
        if(r>=0)
            radius=r;
        else
            radius=0;
    }
    public void setHeight(int h){
        if(h>=0)
            height=h;
        else
            height=0;
    }
    public ConstructCylinder(int r,int h){
        setRadius(r);
        setHeight(h);
    }
    public int lidArea(){
        return (int)Math.PI*radius*radius;
    }
    public int volume(){
        return lidArea()*height;
    }
}

public class ConstructorCylinder{
    public static void main(String[] args) {
        ConstructCylinder cc=new ConstructCylinder(2,3);
        System.out.println(cc.lidArea());
    }
}
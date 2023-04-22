class This{
    int length;
    int breadth;
    int x=1;
    This(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    void display(){
        System.out.println(length);
        System.out.println(breadth);
    }
}
class Super extends This{
    int height;
    int x=2;
    Super(int length,int breadth,int height){
        super(length,breadth);
        this.height=height;
    }
    void display(){
        System.out.println(length);
        System.out.println(breadth);
        System.out.println(height);
        System.out.println(x);
        System.out.println(super.x);
    }
}
public class ThisVsSuper{
    public static void main(String[] args) {
        This t=new This(2,3);
        t.display();
        Super s=new Super(5,6,4);
        s.display();
    }
}
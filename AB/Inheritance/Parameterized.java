class ParentParem{
    public ParentParem(){
        System.out.println("Non-Param of Parent");
    }
    public ParentParem(int x){
        System.out.println("Param of Parent "+x);
    }
}
class ChildParem extends ParentParem{
    public ChildParem(){
        System.out.println("Non-Param of Child");
    }
    public ChildParem(int x){
        System.out.println("Param of Child "+x);
    }
}
public class Parameterized{
    public static void main(String[] args) {
        ChildParem cp=new ChildParem(2);
    }
}
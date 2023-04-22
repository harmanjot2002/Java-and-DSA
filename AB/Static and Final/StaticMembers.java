class HondaCity{
    static long price=10;
    int x=2;
    void display(){
        System.out.println(price);
    }
    static double OnRoadPrice(String city){
        switch (city){
            case "Delhi":
                return price+price*0.1;
            case "Mumbai":
                return price+price*0.2;
            default:
                // return x;
                return price;
        }
    }
}

public class StaticMembers{
    public static void main(String[] args) {
        HondaCity h1=new HondaCity();
        HondaCity h2=new HondaCity();
        System.out.println(h1.OnRoadPrice("Delhi"));
        System.out.println(h1.price+" "+h1.x);
        System.out.println(h2.price+" "+h2.x);
        System.out.println(HondaCity.price);
        HondaCity.price=20;
        h1.x=30;
        System.out.println(h1.price+" "+h1.x);
        System.out.println(h2.price+" "+h2.x);
        System.out.println(HondaCity.price);
    }
}
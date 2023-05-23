@SuppressWarnings("unchecked")
class GenericWildcards<T>{
    T A[]=(T[]) new Object[10];
    int len=0;
    public void append(T v){
        A[len]=v;
        len++;
    }
    public void display(){
        for(int i=0;i<len;i++)
            System.out.println(A[i]);
    }
    static void fun(GenericWildcards<?> obj){
        obj.display();
    }
    public static void main(String[] args) {
        GenericWildcards <Integer> gw1=new GenericWildcards <>();
        gw1.append(19);
        gw1.append(25);
        GenericWildcards <String> gw2=new GenericWildcards <>();
        gw2.append("Hi");
        gw2.append("Hello");
        fun(gw1);
        fun(gw2);
    }
}

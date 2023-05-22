@SuppressWarnings("unchecked")
class GenericClassArray<T>{
    T A[]=(T[]) new Object[10];
    int len=0;
    public void append(T v){
        A[len]=v;
        len++;
    }
    public void display(){
        for(int i=0;i<len;i++){
            System.out.println(A[i]);
        }
    }
    public static void main(String[] args) {
        GenericClassArray<Integer> gc=new GenericClassArray<>();
        gc.append(19);
        gc.append(89);
        gc.append(56);
        gc.display();
    }
}
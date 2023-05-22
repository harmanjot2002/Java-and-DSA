class GenericClass<T>{
    private T obj;
    public void setData(T v){
        obj=v;
    }
    public T getData(){
        return obj;
    }
    public static void main(String[] args) {
        GenericClass<Integer> d=new GenericClass<>();
        d.setData(20);
        System.out.println(d.getData());
    }
}
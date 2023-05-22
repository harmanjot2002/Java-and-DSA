@SuppressWarnings("unchecked")
class GenericMethods<T>{
    static <E> void show(E[] list){
        for(E x:list)
            System.out.println(x);
    }
    public static void main(String[] args) {
        show(new String[]{"Hi","Good","Hello"});
        show(new Integer[]{10,20,90});
    }
}
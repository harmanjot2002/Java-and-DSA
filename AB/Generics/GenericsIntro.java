class GenericsIntro<T>{
    T data[]=(T[]) new Object[3];

    public static void main(String[] args) {
        GenericsIntro<String> gi=new GenericsIntro();        
        gi.data[0]="Hi";
        gi.data[1]="Hello";
        // gi.data[2]=10;      ->Compiler Error
        // gi.data[2]=new Integer(10);     ->Compiler Error

        String str=gi.data[0];
    }
}
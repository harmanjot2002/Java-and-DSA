public class Lecture5{
    public static void main(String[] args) {
        //1.Arithmetic Operators
        // declare variables p and q
        int p = 20, q = 10;
        int result;
        // addition operator
        result=p+q;
        System.out.println(result);
        // subtraction operator
        System.out.println(p - q); 
        // we can directly perform subtraction in print statement,no need to use result variable here 
        //multiplication operator
        System.out.println(p * q);
        // division operator
        System.out.println(p / q);
        // modulo operator
        System.out.println(p % q);


        //2.Relational Operators
        // == operator
        p=10;
        q=15;
        System.out.println(p == q); // false 	
        // != operator
        System.out.println(p != q); // true
        // > operator 	
        System.out.println(p > q); // false
        // < operator           
        System.out.println(p < q); // true
        // >= operator            
        System.out.println(p >= q); // false
        // <= operator
        System.out.println(p <= q); // true


        //3.Logical Operators
        // && operator
        p=15;
        q=10;
        int r=5;
        System.out.println((p > q) && (p > r)); // true
        System.out.println((p > q) && (p < r)); // false
        // || operator
        System.out.println((r < q) || (p < q)); // true
        System.out.println((p > q) || (q > r)); // true
        System.out.println((p < q) || (p < r)); // false
        // ! operator
        System.out.println(!(p == q)); // true
        System.out.println(!(p > q)); // false


        //4.Assignment Operators
        p=10;
        int o;
        // assign value using =
        o = p;
        System.out.println(o); // value of o is 10
        // assign value using =+
        o += p;
        System.out.println(o); // value of o is 20
        // assign value using =*
        o *= p;
        System.out.println(o); // value of o is 200


        //5.Unary Operators
        int s = 5;
        System.out.println("Post-Increment Operator");
        System.out.println(s++); // 5
        // / p's value is incremented to 6 after returning current value i.e; 5
        // initialized to 5
        int d = 5;
        System.out.println("Pre-Increment Operator");
        System.out.println(++d); //6
        // q is incremented to 6 and then it's value is returned


        //6.Bitwise Operators
        int f = 5;
        System.out.println(f<<2); 
        // Shifting the value of p towards the left two positions
    }
}

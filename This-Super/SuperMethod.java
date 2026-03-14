// super() is a keyword used to refer to the parent class (superclass).
// super always presnt in constructor but we cant see it like john cena

class A{
    public A(){
        super();
        System.out.println("In A");
    }
    public A(int x){
        super();
        System.out.println("In A int");
    }
}

class B extends A{
    public B(){     // Default constructor
        super(7);
        System.out.println("In B");
    }
    public B(int n){
        super(n);
        System.out.println("In B int");
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        // B obj = new B();  
        // Output  
        // In A
        // In B

        // B obj = new B(10);
        // Output  
        // In A.  // Why not giving this as int?????
        // In B int

        ///////// FROM HERE USING SUPER() METHOD

        // B obj = new B(10); 
        // Output  
        // In A int
        // In B int

        B obj = new B();
        // Output  
        // In A int
        // In B
    }
}
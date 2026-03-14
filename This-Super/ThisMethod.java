class A{
    public A(){
        System.out.println("Hello A");
    }
}

class B extends A{
    public B(){
        System.out.println("Hello B");
    }
    public B(int a, int b){
        this();
        System.out.println("Yo two value");
    }
    public B(int n){
        this(5,6);     // IT's use to call inner constructor of class
        System.out.println("Hello int B");
    }
}

public class ThisMethod {
    public static void main(String[] args) {
        B obj = new B(3);
    }
}

class A{
    public A(){
        System.out.println("In A");
    }
    public A(int x){
        System.out.println("In A int");
    }
}

class B extends A{
    public B(){     // Default constructor
        System.out.println("In B");
    }
    public B(int n){
        System.out.println("In B int");
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        B obj = new B();
    }
}
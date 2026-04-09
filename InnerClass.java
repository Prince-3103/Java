class A{
    int age;

    public void showA(){
        System.out.println("In Show A");
    }

    class B{
        public void showB(){
            System.out.println("IN show B");
        }
    }
}

public class InnerClass {
    public static void main(String[] args){
        A obj1 = new A();
        obj1.showA();

        // B obj2 = new B();    // We cant create object of B because it is an inner class

        A.B obj2 = obj1.new B();    // For using class B. we need object of A also

        obj2.showB();
    }
}

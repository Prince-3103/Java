package thread;

class A extends Thread{
    public void run(){
        for(int i=1; i<=100; i++){
            System.out.println("Hi");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=1; i<=100; i++){
            System.out.println("Hello");
        }
    }
}

public class startThread {
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();

        // Thread always start first
        obj1.start();
        obj2.start();
    }
}

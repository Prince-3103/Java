package thread;

// sleep() is a method that pauses a thread for a specific time.
// During this time, the thread does nothing and releases CPU.

class A extends Thread{
    public void run(){
        for(int i=1; i<=100; i++){
            System.out.println("Hi");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                // InterruptedException occurs when a sleeping or waiting thread is interrupted by another thread.
                // It signals that the thread should stop waiting and handle interruption
                
                System.out.println("Some Problem");
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=1; i<=100; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println("Some Problem");
            }
        }
    }
}

public class sleepThread {
    public static void main(String[] args){
        A t1 = new A();
        B t2 = new B();

        t1.start();

        try{
            Thread.sleep(5);
        }
        catch(InterruptedException e){
            System.out.println("Some interruption");
        }

        t2.start();
    }
}

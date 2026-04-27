package thread;

// Runnable -> defines task (no thread created here)
class Greet implements Runnable { 
    public void run(){   // run() contains thread work
        for(int i = 1; i <= 5; i++){
            System.out.println("Wassup");

            try{
                Thread.sleep(100);  // pauses current thread (100 ms)
            }
            catch(InterruptedException e){   // must handle (checked exception)
                System.out.println("Interrupted");
            }
        }
    }
}

public class runnable {
    public static void main(String[] args){

        // Creating task using class
        Runnable obj1 = new Greet();

        // Creating task using lambda (short way)
        Runnable obj2 = () -> {
            for(int i = 1; i <= 5; i++){
                System.out.println("Good evening");

                try{
                    Thread.sleep(100);  // delay for visibility
                }
                catch(InterruptedException e){
                    System.out.println("Interrupted");
                }
            }
        };

        // Thread -> executes Runnable task
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();   // starts new thread (calls run internally)
        t2.start();   // runs concurrently (order not guaranteed)
    }
}
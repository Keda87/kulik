package concurrency;

/**
 *
 * @author adiyatmubarak
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello threading!!");
    }
    
    public static void main(String[] args) {
        // Create thread by extending `Thread` class.
        MyThread t = new MyThread();
        t.start();
        
        // Craete thread with anonymous subclass.
        Thread t1 = new Thread() {

            @Override
            public void run() {
                System.out.println("Hello thread anon!");
            }
            
        };
        t1.start();
    }
    
}

package concurrency;

/**
 *
 * @author adiyatmubarak
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable running...");
    }
    
}


class MainRunnable {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable(), "Runnable 1");
        t.start();
        System.out.println(t.getName());
    }
}
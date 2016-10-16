package basicjava;

import basicjava.AsyncJob;

/**
 *
 * @author adiyatmubarak
 */
public class Main implements AsyncJob {
    
    
    public static void main(String[] args) {
        Main main = new Main();
        main.doIt("Hello world!", new Task() {

            @Override
            public void call() {
                System.out.println("Cool!!");
            }

            @Override
            public String me() {
                return "Adit";
            }
        });
    }

    @Override
    public void doIt(String message, Task task) {
        System.out.println(message);
        
        task.call();
        
        System.out.println(task.me());
    }

}

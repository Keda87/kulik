/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

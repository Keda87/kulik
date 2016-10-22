package basicjava;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by adiyatmubarak on 10/22/16.
 */

class FirstNewsReader implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(FirstNewsReader.class.getSimpleName() + " got the broadcast: " + arg);
    }
}


class SecondNewsReader implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(SecondNewsReader.class.getSimpleName() + " got the broadcast: " + arg);
    }
}


class News extends Observable {

    void broadcast() {
        String[] news = new String[] {"News 1", "News 2", "News 3"};
        for (String n: news) {
            setChanged();       // set changed.
            notifyObservers(n); // notify all observer for change.
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class ObserverObservableDemo {
    public static void main(String[] args) {
        FirstNewsReader reader1 = new FirstNewsReader();
        SecondNewsReader reader2 = new SecondNewsReader();
        News obj = new News();
        obj.addObserver(reader1);
        obj.addObserver(reader2);
        obj.broadcast();
    }
}

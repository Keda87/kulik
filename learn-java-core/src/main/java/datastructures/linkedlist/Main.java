package datastructures.linkedlist;

/**
 *
 * @author adiyatmubarak
 */
public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        
        l.insertFirst(1, 23.1);
        l.insertFirst(2, 25.1);
        l.insertFirst(3, 22.7);
        l.insertFirst(4, 53.9);
        
        l.displayList();
        
        while(!l.isEmpty()) {
            Node delNode = l.deleteFirst();
            System.out.println("Deleted..");
            l.displayList();
            System.out.println("");
        }
        
        l.displayList();
    }
}

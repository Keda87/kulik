package datastructures.doublelinkedlist;

/**
 *
 * @author adiyatmubarak
 */
public class DoubleLinkedList {
    Node first;
    Node last;
    
    /**
     * Insert initial data to a linked list.
     * @param input 
     */
    public void insertInitial(Node input) {
        input.next = last;
        input.prev = first;
        
        first = input;
        last = input;
    }
    
    /**
     * Insert data to front of linked list.
     * @param input 
     */
    public void insertFront(Node input) {
        if (isEmpty()) {
            insertInitial(input);
        } else {
            input.next = first;
            input.prev = input;
            first = input;
        }
    }
    
    /**
     * Insert data to the end of linked list.
     * @param input     :
     */
    public void insertLast(Node input) {
        if (isEmpty()) {
            insertInitial(input);
        } else {
            input.prev = last;
            last.next = input;
            last = input;
        }
    }
    
    /**
     * Insert data to the middle of linked list.
     * @param input     :
     * @param current   :
     */
    public void insertMiddle(Node input, Node current) {
        
    }
    
    public Node deleteFront() {
        return null;
    }
    
    public Node deleteLast() {
        return null;
    }
    
    public Node deleteMiddle(Node current) {
        return null;
    }
    
    /**
     * Check whether a linked list is empty.
     * @return 
     */
    public boolean isEmpty() {
        return first == null;
    }
    
    /**
     * Displaying entire data within linked list.
     */
    public void display() {
        
    }
    
}

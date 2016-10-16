package datastructures.linkedlist;

/**
 *
 * @author adiyatmubarak
 */
public class LinkedList {
    private Node first;

    public LinkedList() {
        this.first = null;
    }
    
    public boolean isEmpty() {
        return this.first == null;
    }
    
    public void insertFirst(int index, double value) {
        Node node = new Node(index, value);
        node.next = first;
        first = node;
    }
    
    public void displayList() {
        System.out.println("List (first --> last):");
        Node current = this.first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println("");
    }
    
    public Node deleteFirst() {
        Node tmp = this.first;
        this.first = this.first.next;
        return tmp;
    }
    
    
}

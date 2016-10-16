package datastructures.queue;

/**
 *
 * @author adiyatmubarak
 */
public class Queue {
    Node front;
    Node rear;
    
    public void insert(Node input) {
        if (isEmpty()) {
            this.front = input;
        } else {
            this.rear = input;
            this.rear.next = input;
        }
    }
    
    public Node remove() {
        Node tmp = this.front;
        this.front = this.front.next;
        return tmp;
    }
    
    public boolean isEmpty() {
        return this.front == null;
    }
}

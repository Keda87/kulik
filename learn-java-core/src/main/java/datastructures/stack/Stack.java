package datastructures.stack;

/**
 *
 * @author adiyatmubarak
 */
public class Stack {

    private NodeData top;

    public boolean isEmpty() {
        return this.top == null;
    }
    
    public void push(NodeData data) {
        data.next = this.top;
        this.top = data;
    }
    
    public NodeData pop() {
        NodeData tmp = this.top;
        this.top = this.top.next;
        return tmp;
    }
    
    public int peek() {
        return this.top.data;
    }
    
    public void displayStack() {
        NodeData current = this.top;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    
}

package datastructures.linkedlist;

/**
 *
 * @author adiyatmubarak
 */
public class Node {

    private int index;
    private double value;
    public Node next;

    public Node(int index, double value) {
        this.index = index;
        this.value = value;
    }
    
    public void displayNode() {
        System.out.println("{" + index + ":" + value + "}");
    }
    
}

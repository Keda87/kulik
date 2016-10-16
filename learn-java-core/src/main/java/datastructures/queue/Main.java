package datastructures.queue;

/**
 *
 * @author adiyatmubarak
 */
public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        Node tmp;
        
        tmp = new Node(1);
        q.insert(tmp);
        
        
        tmp = new Node(2);
        q.insert(tmp);
        
        tmp = new Node(3);
        q.insert(tmp);
        
        tmp = new Node(4);
        q.insert(tmp);
        
        tmp = new Node(5);
        q.insert(tmp);

        System.out.println("After insert: ");
        while(!q.isEmpty()) {
            System.out.print(q.front.data + " ");
        }
    }
}

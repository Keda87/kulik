package datastructures.stack;

/**
 *
 * @author adiyatmubarak
 */
public class Main {
    public static void main(String[] args) {
        Stack st = new Stack();
        NodeData data;
        
        System.out.println(st.isEmpty());
        
        data = new NodeData(12);
        st.push(data);
        
        data = new NodeData(11);
        st.push(data);
        
        data = new NodeData(15);
        st.push(data);
        
        st.pop();
        
        st.displayStack();
        
        System.out.println(st.isEmpty());
    }
}

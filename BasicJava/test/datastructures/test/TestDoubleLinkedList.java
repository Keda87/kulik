package datastructures.test;

import datastructures.doublelinkedlist.DoubleLinkedList;
import datastructures.doublelinkedlist.Node;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author adiyatmubarak
 */
public class TestDoubleLinkedList extends TestCase {

    private DoubleLinkedList dll;
    
    @Override
    protected void setUp() throws Exception {
        this.dll = new DoubleLinkedList();
    }

    @Test
    public void testDoubleLinkedListIsEmpty() {
        assertEquals(true, this.dll.isEmpty());
    }
    
    @Test
    public void testInitialDoubleLinkedList() {
        this.dll.insertFront(new Node(10));
        assertEquals(true, this.dll.isEmpty());
    }

}

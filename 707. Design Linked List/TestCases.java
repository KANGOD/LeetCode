import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
public class TestCases {
    /**
     * Input:
     * ["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get"]
     * [[],[1],[3],[1,2],[1],[1],[1]]
     * 
     * Expected:
     * [null,null,null,null,2,null,3]
     */
    @Test
    public void test123() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);
        assertEquals(2, myLinkedList.get(1));
        myLinkedList.deleteAtIndex(1);
        assertEquals(3, myLinkedList.get(1));
    }

    /*
     * ["MyLinkedList","addAtIndex","addAtIndex","addAtIndex","get"]
     * [[],[0,10],[0,20],[1,30],[0]]
     * 
     * [null,null,null,null,20]
     */
    @Test
    public void test_10_20_30() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtIndex(0, 10);
        myLinkedList.addAtIndex(0, 20);
        myLinkedList.addAtIndex(1, 30);
        assertEquals(20, myLinkedList.get(0));

    }

    /**
     * ["MyLinkedList","addAtTail","get"]
     * [[],[1],[0]]
     * 
     * [null,null,1]
     */
    @Test
    public void testAddAtTail() {

    }
}

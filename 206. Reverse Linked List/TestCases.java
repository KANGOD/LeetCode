import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCases {
    @Test
    public void test12() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtTail(1);
        myLinkedList.addAtTail(2);
        ListNode result = new Solution().reverseList(myLinkedList.thisList());
        assertEquals("[2,1]", result.toString());
    }

    @Test
    public void test12345() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtTail(1);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtTail(4);
        myLinkedList.addAtTail(5);
        ListNode result = new Solution().reverseList(myLinkedList.thisList());
        assertEquals("[5,4,3,2,1]", result.toString());
    }

    @Test
    public void testEmpty() {
        MyLinkedList myLinkedList = new MyLinkedList();
        ListNode result = new Solution().reverseList(myLinkedList.thisList());
        assertEquals(null, result);
        assertEquals("[]", result == null ? "[]" : result.toString());
    }
}
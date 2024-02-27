import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Stack
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        Deque<ListNode> stack = new ArrayDeque<>();
        ListNode cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }

        ListNode pop = stack.pop();
        ListNode dummy = new ListNode(0, pop);
        while (!stack.isEmpty()) {
            ListNode tmp = stack.pop();
            tmp.next = null; // otherwise would causes "Error - Found cycle in the ListNode"
            pop.next = tmp;
            pop = pop.next;
        }
        return dummy.next;
    }
}
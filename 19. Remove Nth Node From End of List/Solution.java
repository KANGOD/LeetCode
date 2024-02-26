/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode preHead = new ListNode(0, head);
        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) { // 特殊情况，n == sz，已经遍历到结尾。
            return head.next;
        }
        ListNode slow = preHead.next;
        // System.out.println("a# fast="
        //         + (fast == null ? null : fast.val)
        //         + ", slow="
        //         + (slow == null ? null : slow.val));

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        // 此时 fast 是倒数第二个节点。slow 是倒数第 n 个节点的前置节点。
        // System.out.println("b# fast="
        //         + (fast == null ? null : fast.val)
        //         + ", slow="
        //         + (slow == null ? null : slow.val));
        slow.next = slow.next.next;
        return preHead.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
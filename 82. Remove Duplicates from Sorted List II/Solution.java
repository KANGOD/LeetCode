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
class Solution {
    public static void main(String[] args) {
        // assertEquals(, args);
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode preHead = new ListNode(0, head);
        ListNode preCur = preHead;
        ListNode cur = head;
        while (cur != null && cur.next != null) { // Notice that both of them may becomes null.
            if (cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    cur.next = cur.next.next;
                }
                preCur.next = cur.next;
                cur = cur.next;
            } else {
                preCur = cur;
                cur = cur.next;
            }
        }
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
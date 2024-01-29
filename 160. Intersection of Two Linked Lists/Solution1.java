// time complexity O(m*n) // bad
// space complexity O(1)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution1 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == headB) return headA;

        ListNode curA = headA, curB = headB;
        while (curA != null) {
            // System.out.println("A: " + curA.val);
            while (curB != null) {
                // System.out.println("B: " + curB.val);
                if (curA == curB) {
                    return curA;
                }
                curB = curB.next;
            }
            curA = curA.next;
            curB = headB;
        }
        return null;
    }
}
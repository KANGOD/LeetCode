// time complexity O(m+n)
// space complexity O(1)

// 若相交，链表A: a+c, 链表B: b+c。 a+c+b+c = b+c+a+c 。则会在公共处c起点相遇。a+c+b = b+c+a。
// 若不相交，a+b = b+a 。因此相遇处是NULL。
// via. https://leetcode.cn/problems/intersection-of-two-linked-lists/solutions/10774/tu-jie-xiang-jiao-lian-biao-by-user7208t/comments/204752

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
public class Solution0 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == headB) return headA;

        ListNode curA = headA, curB = headB;
        while (curA != null || curB != null) {
            if (curA != null) {
                curA = curA.next;
            } else {
                curA = headB;
            }

            if (curB != null) {
                curB = curB.next;
            } else {
                curB = headA;
            }

            if (curA == curB) {
                return curA;
            }
        }
        return null;
    }
}
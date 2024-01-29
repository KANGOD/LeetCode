import java.util.HashSet;
import java.util.Set;

// time complexity O(m+n)
// space complexity O(m+n)

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
public class Solution2 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == headB) return headA;

        ListNode curA = headA, curB = headB;
        Set<ListNode> nodes = new HashSet<>();
        while (curA != null) {
            nodes.add(curA);
            curA = curA.next;
        }
        while (curB != null) {
            if (nodes.contains(curB)) {
                return curB;
            }
            curB = curB.next;
        }
        return null;
    }
}
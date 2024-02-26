import java.util.Deque;
import java.util.LinkedList;

/**
 * 力扣官方题解3
 * https://leetcode.cn/problems/remove-nth-node-from-end-of-list/solutions/450350/shan-chu-lian-biao-de-dao-shu-di-nge-jie-dian-b-61/
 *
 * 灵感启发摘录：
 * 如果我们能够得到的是倒数第 n 个节点的前驱节点而不是倒数第 n 个节点的话，删除操作会更加方便。
 * 因此我们可以考虑在初始时将 slow 指向哑节点，其余的操作步骤不变。
 * 这样一来，当 fast 遍历到链表的末尾时，slow 的下一个节点就是我们需要删除的节点。
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        Deque<ListNode> stack = new LinkedList<ListNode>();
        ListNode cur = dummy;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        for (int i = 0; i < n; ++i) {
            stack.pop();
        }
        ListNode prev = stack.peek();
        prev.next = prev.next.next;
        ListNode ans = dummy.next;
        return ans;
    }
}


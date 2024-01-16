class MyLinkedList {
    private ListNode mHead;

    public MyLinkedList() {
        System.out.println("ctor");
    }

    public int get(int index) {
        int i = 0;
        ListNode cur = mHead;
        while (cur != null) {
            if (i == index) {
                System.out.println("get: returnA " + cur.val);
                return cur.val;
            }
            cur = cur.next;
            i++;
        }
        System.out.println("get: returnB -1");
        return -1;
    }

    public void addAtHead(int val) {
        mHead = new ListNode(val, mHead);
        System.out.println("addAtHead: " + val + " mHead=" + mHead);
    }

    public void addAtTail(int val) {
        System.out.println("addAtTail: ENTER val=" + val + " mHead=" + mHead);
        if (mHead == null) {
            mHead = new ListNode(val);
            System.out.println("addAtTail: A " + val + " mHead=" + mHead);
            return;
        }
        ListNode cur = mHead;
        while (cur != null) {
            if (cur.next == null) {
                cur.next = new ListNode(val);
                System.out.println("addAtTail: B " + val + " mHead=" + mHead);
                break;
            } else {
                cur = cur.next;
            }
        }
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) { // The same to `addAtHead(int val)`
            mHead = new ListNode(val, mHead);
            System.out.println("addAtIndex: A index=0 val=" + val + " mHead=" + mHead);
            return;
        }
        int i = 0;
        ListNode prev = new ListNode(0, mHead);
        ListNode cur = mHead;
        while (cur != null) {
            if (i == index) {
                prev.next = new ListNode(val, cur);
                System.out.println("addAtIndex: B index=" + index + " val=" + val + " mHead=" + mHead);
                // break; // Error: Should not break, `i` should still continue to increase.
            }
            prev = cur;
            cur = cur.next;
            i++;
        }
        if (i == index) {
            prev.next = new ListNode(val);
            System.out.println("addAtIndex: C index=" + index + " val=" + val + " mHead=" + mHead);
        }
    }

    public void deleteAtIndex(int index) {
        if (mHead == null) {
            System.out.println("deleteAtIndex: A index=" + index);
            return;
        }
        if (index == 0) {
            mHead = mHead.next;
            System.out.println("deleteAtIndex: B index=" + index);
            return;
        }
        int i = 0;
        ListNode prev = new ListNode(0, mHead);
        ListNode cur = mHead;
        while (cur != null) {
            if (i == index) {
                prev.next = cur.next;
                System.out.println("deleteAtIndex: C index=" + index + " mHead=" + mHead);
                break;
            }
            prev = cur;
            cur = cur.next;
            i++;
        }
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            sb.append(val);
            ListNode cur = this;
            while (cur.next != null) {
                cur = cur.next;
                sb.append(", ").append(cur.val);
            }
            sb.append("]");
            return sb.toString();
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
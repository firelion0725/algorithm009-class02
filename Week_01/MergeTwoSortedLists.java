class MergeTwoSortedLists {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        helper(head, l1, l2);
        return head.next;
    }

    private void helper(ListNode result, ListNode l1, ListNode l2) {
        if (result == null) {
            return;
        }

        if (l1 == null) {
            result.next = l2;
            return;
        }

        if (l2 == null) {
            result.next = l1;
            return;
        }

        if (l1.val < l2.val) {
            result.next = l1;
            l1 = l1.next;
        } else {
            result.next = l2;
            l2 = l2.next;
        }
        helper(result.next, l1, l2);
    }


}
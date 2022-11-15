package medium;

import common.ListNode;

import java.util.List;

/**
 * Given the head of a linked list, return the list after sorting it in ascending order.
 */
public class _148_SortList {
    public ListNode sortList(ListNode head) {
        // use merge sort (n logn)
        if (head == null || head.next == null) {
            return head;
        }
        // find the middle for splitting linked list
        ListNode middle = findTheMiddle(head);

        // recursively find the middle, split and sort the left/right part of the middle
        ListNode right = sortList(middle.next);
        middle.next = null;
        ListNode left = sortList(head);

        // merge two parts
        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode current= dummy;

        while(left != null && right != null) {
            if (left.val < right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }
        if (left != null) {
            current.next = left;
        } else {
            current.next = right;
        }
        return dummy.next;
    }

    private ListNode findTheMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

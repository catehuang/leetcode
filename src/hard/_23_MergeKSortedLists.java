package hard;

import common.ListNode;

/**
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * Merge all the linked-lists into one sorted linked-list and return it.
 */
public class _23_MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        // divide and conquer
        // recursively find the middle of the list, compare the left list and right list, merge the left and right lists
        if (lists.length == 0) {
            return null;
        } else if (lists.length == 1) {
            return lists[0];
        }

        return mergeHelper(lists, 0, lists.length - 1);
    }

    private ListNode mergeHelper(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }

        int middle = start + (end - start) / 2;
        ListNode left = mergeHelper(lists, start, middle);
        ListNode right = mergeHelper(lists, middle + 1, end);
        return mergeTwoLists(left, right);
    }

    private ListNode mergeTwoLists(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (left != null && right != null) {
            if (left.val > right.val) {
                current.next = right;
                right = right.next;
            } else {
                current.next = left;
                left = left.next;
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
}

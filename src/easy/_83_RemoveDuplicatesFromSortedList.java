package easy;

import common.ListNode;

/** Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
 *  Return the linked list sorted as well.
 *
 *  Constraints: *
 *      The number of nodes in the list is in the range [0, 300].
 *      -100 <= Node.val <= 100
 *      The list is guaranteed to be sorted in ascending order.
 */
public class _83_RemoveDuplicatesFromSortedList {
    public ListNode remove(ListNode head) {
        if (head == null)
        {
            return null;
        }
        else if (head.next == null)
        {
            return head;
        }

        ListNode listNode = new ListNode(head.val);
        ListNode previous = listNode;

        head = head.next;

        while (head.next != null)
        {
            if (head.val != previous.val)
            {
                previous.next = head;
                previous = previous.next;
            }
            head = head.next;
        }

        if (head.val != previous.val)
        {
            previous.next = head;
        }
        else {
            previous.next = null;
        }

        return listNode;
    }
}

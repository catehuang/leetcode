package medium;

import common.ListNode;

/**
 * Given the head of a singly linked list and two integers left and right
 * where left <= right, reverse the nodes of the list from position left to position right (index starts from 1),
 * and return the reversed list.
 */
public class _92_ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) {
            return null;
        }

        ListNode prev = null;
        ListNode current = head;

        // 1 234 5
        // p c
        while (left > 1) {
            prev = current;
            current = current.next;
            left--;
            right--;
        }
        ListNode connection = prev;
        ListNode tail = current;

        while (right > 0) {
            ListNode next = current.next;
            // reverse direction p<-cn
            current.next = prev;
            // pointers move to the right
            prev = current;
            current = next;
            right--;
        }

        if (connection != null) {
            connection.next = prev;
        } else {
            head = prev;
        }
        tail.next = current;

        return head;
    }
}

package medium;

import common.ListNode;

/**
 * Given the head of a singly linked list, group all the nodes with odd indices together
 * followed by the nodes with even indices, and return the reordered list.
 * The first node is considered odd, and the second node is even, and so on.
 * Note that the relative order inside both the even and odd groups should remain
 * as it was in the input.
 * You must solve the problem in O(1) extra space complexity and O(n) time complexity.
 */
public class _328_OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddStarter;
        ListNode odd = new ListNode(0);
        oddStarter = odd;

        ListNode evenStarter;
        ListNode even = new ListNode(0);
        evenStarter = even;

        // walk two elements
        while (head != null && head.next != null) {
            odd.next = head;
            odd = odd.next;
            even.next = head.next;
            even = even.next;

            head = head.next;
            head = head.next;
        }
        if (head != null) {
            odd.next = head;
            odd = odd.next;
            even.next = null;
        }
        // connect odd and evenStarter
        odd.next = evenStarter.next;
        return oddStarter.next;
    }
}

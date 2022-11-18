package easy;

import common.ListNode;

public class _206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            // invite the next element to the game
            ListNode next = head.next;
            // reserve link from prev->head->next to prev<-head<-next
            head.next = prev;
            // setting for next run
            prev = head;
            head = next;
        }
        return prev;
    }
}

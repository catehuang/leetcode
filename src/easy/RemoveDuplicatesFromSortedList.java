package easy;

public class RemoveDuplicatesFromSortedList {
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

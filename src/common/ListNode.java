package common;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {

    }

    public ListNode(int val)
    {
        this.val = val;
    }

    public ListNode(int val, ListNode next)
    {
        this.val = val; this.next = next;
    }

    public ListNode createLinkedList(int[] nodes) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int i : nodes) {
            current.next = new ListNode(i);
            current = current.next;
        }

        //checkListNode(dummy.next);
        return dummy.next;
    }

    public void checkListNode(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
package easy;

import common.ListNode;

/**
 * Given the heads of two singly linked-lists headA and headB,
 * return the node at which the two lists intersect.
 * If the two linked lists have no intersection at all, return null.
 *
 * The judge will then create the linked structure based on these inputs and pass the two heads,
 * headA and headB to your program. If you correctly return the intersected node,
 * then your solution will be accepted.
 */
public class _160_IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null | headB == null) {
            return null;
        }
        ListNode a_pointer = headA;
        ListNode b_pointer = headB;

        while (!isEqual(a_pointer,b_pointer)) {
            if (a_pointer == null) {
                a_pointer = headB;
            } else {
                a_pointer = a_pointer.next;
            }

            if (b_pointer == null) {
                b_pointer = headA;
            } else {
                b_pointer = b_pointer.next;
            }
        }
        if (a_pointer != null) {
            a_pointer.next = null;
        }

        return a_pointer;
    }

    private boolean isEqual(ListNode a_pointer, ListNode b_pointer) {
        if (a_pointer == null && b_pointer == null) {
            return true;
        }
        while(a_pointer != null && b_pointer != null) {
            if (a_pointer.val != b_pointer.val) {
                return false;
            }
            a_pointer = a_pointer.next;
            b_pointer = b_pointer.next;
        }
        if (a_pointer != null || b_pointer != null) {
            return false;
        }
        return true;
    }
}

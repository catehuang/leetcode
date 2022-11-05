package medium;

import common.ListNode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class _2_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list;
        ListNode current;
        int add = 0;

        if (l1.val + l2.val > 9) {
            list = new ListNode((l1.val + l2.val) % 10);
            add = (l1.val + l2.val) /10;
        }
        else {
            list = new ListNode(l1.val + l2.val);
            add = 0;
        }
        current = list;

        while (l1.next != null) {
            l1 = l1.next;
            if (l2.next != null) {
                l2 = l2.next;
                if (l1.val + l2.val + add > 9) {
                    current.next = new ListNode((l1.val + l2.val + add) % 10);
                    add = (l1.val + l2.val + add) /10;
                }
                else {
                    current.next = new ListNode(l1.val + l2.val + add);
                    add = 0;
                }
            }
            else {
                if (l1.val + add > 9) {
                    current.next = new ListNode((l1.val + add) % 10);
                    add = (l1.val + l2.val + add) /10;
                }
                else {
                    current.next = new ListNode(l1.val + add);
                    add = 0;
                }
            }
            current = current.next;
        }
        while (l2.next != null) {
            l2 = l2.next;
            if (l2.val + add > 9) {
                current.next = new ListNode((l2.val + add) % 10);
                add = (l1.val + l2.val + add) /10;
            }
            else {
                current.next = new ListNode(l2.val + add);
                add = 0;
            }
            current = current.next;
        }
        if (add > 0) {
            current.next = new ListNode(add);
        }

        return list;
    }
}

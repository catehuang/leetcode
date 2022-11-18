package easy;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _206_ReverseLinkedListTest {

    _206_ReverseLinkedList reverseLinkedList;

    @BeforeEach
    public void setUp() {
        reverseLinkedList = new _206_ReverseLinkedList();
    }

    @Test
    public void reverseList_case_1() throws Exception {
        int[] nodes = new int[] {1, 2, 3, 4, 5};
        int[] exp = new int[] {5, 4, 3, 2, 1};

        ListNode listNode = new ListNode();
        ListNode head = listNode.createLinkedList(nodes);
        ListNode result = reverseLinkedList.reverseList(head);
        ListNode expected = listNode.createLinkedList(exp);

        while (expected != null) {
            assertEquals(expected.val, result.val);
            expected = expected.next;
            result = result.next;
        }

        assertFalse(result != null);
    }

    @Test
    public void reverseList_case_2() throws Exception {
        int[] nodes = new int[] {1, 2};
        int[] exp = new int[] {2, 1};

        ListNode listNode = new ListNode();
        ListNode head = listNode.createLinkedList(nodes);
        ListNode result = reverseLinkedList.reverseList(head);
        ListNode expected = listNode.createLinkedList(exp);

        while (expected != null) {
            assertEquals(expected.val, result.val);
            expected = expected.next;
            result = result.next;
        }

        assertFalse(result != null);
    }

    @Test
    public void reverseList_case_3() throws Exception {
        int[] nodes = new int[] {};
        int[] exp = new int[] {};

        ListNode listNode = new ListNode();
        ListNode head = listNode.createLinkedList(nodes);
        ListNode result = reverseLinkedList.reverseList(head);
        ListNode expected = listNode.createLinkedList(exp);

        while (expected != null) {
            assertEquals(expected.val, result.val);
            expected = expected.next;
            result = result.next;
        }

        assertFalse(result != null);
    }
}
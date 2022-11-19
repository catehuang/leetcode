package medium;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _92_ReverseLinkedList2Test {

    _92_ReverseLinkedList2 reverseLinkedList2;

    @BeforeEach
    public void setUp() {
        reverseLinkedList2 = new _92_ReverseLinkedList2();
    }

    @Test
    public void reverseBetween_case_1() throws Exception {
        int[] nodes = new int[] {1, 2, 3, 4, 5};
        ListNode listNode = new ListNode();
        ListNode head = listNode.createLinkedList(nodes);
        int left = 2;
        int right = 4;
        ListNode result = reverseLinkedList2.reverseBetween(head, left, right);

        int[] output = new int[] {1, 4, 3, 2, 5};
        ListNode expected = listNode.createLinkedList(output);

        while (expected != null) {
            assertEquals(expected.val, result.val);
            expected = expected.next;
            result = result.next;
        }
        assertFalse(result != null);
    }

    @Test
    public void reverseBetween_case_2() throws Exception {
        int[] nodes = new int[] {5};
        ListNode listNode = new ListNode();
        ListNode head = listNode.createLinkedList(nodes);
        int left = 1;
        int right = 1;
        ListNode result = reverseLinkedList2.reverseBetween(head, left, right);

        int[] output = new int[] {5};
        ListNode expected = listNode.createLinkedList(output);

        while (expected != null) {
            assertEquals(expected.val, result.val);
            expected = expected.next;
            result = result.next;
        }
        assertFalse(result != null);
    }
}
package medium;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _328_OddEvenLinkedListTest {

    _328_OddEvenLinkedList oddEvenLinkedList;

    @BeforeEach
    public void setUp() {
        oddEvenLinkedList = new _328_OddEvenLinkedList();
    }

    @Test
    public void oddEvenList_case_1() throws Exception {
        int[] nodes = new int[] {1, 2, 3, 4, 5};
        int[] outputs = new int[] {1, 3, 5, 2, 4};
        ListNode listNode = new ListNode();
        ListNode head = listNode.createLinkedList(nodes);
        ListNode result = oddEvenLinkedList.oddEvenList(head);
        ListNode expected = listNode.createLinkedList(outputs);

        while (expected != null) {
            assertEquals(expected.val, result.val);
            expected = expected.next;
            result = result.next;
        }
        assertFalse(result != null);
    }

    @Test
    public void oddEvenList_case_2() throws Exception {
        int[] nodes = new int[] {2, 1, 3, 5, 6, 4, 7};
        int[] outputs = new int[] {2, 3, 6, 7, 1, 5, 4};
        ListNode listNode = new ListNode();
        ListNode head = listNode.createLinkedList(nodes);
        ListNode result = oddEvenLinkedList.oddEvenList(head);
        ListNode expected = listNode.createLinkedList(outputs);

        while (expected != null) {
            assertEquals(expected.val, result.val);
            expected = expected.next;
            result = result.next;
        }
        assertFalse(result != null);
    }

    @Test
    public void oddEvenList_case_3() throws Exception {
        int[] nodes = new int[] {1, 2};
        int[] outputs = new int[] {1, 2};
        ListNode listNode = new ListNode();
        ListNode head = listNode.createLinkedList(nodes);
        ListNode result = oddEvenLinkedList.oddEvenList(head);
        ListNode expected = listNode.createLinkedList(outputs);

        while (expected != null) {
            assertEquals(expected.val, result.val);
            expected = expected.next;
            result = result.next;
        }
        assertFalse(result != null);
    }

    @Test
    public void oddEvenList_case_4() throws Exception {
        int[] nodes = new int[] {2};
        int[] outputs = new int[] {2};
        ListNode listNode = new ListNode();
        ListNode head = listNode.createLinkedList(nodes);
        ListNode result = oddEvenLinkedList.oddEvenList(head);
        ListNode expected = listNode.createLinkedList(outputs);

        while (expected != null) {
            assertEquals(expected.val, result.val);
            expected = expected.next;
            result = result.next;
        }
        assertFalse(result != null);
    }
}
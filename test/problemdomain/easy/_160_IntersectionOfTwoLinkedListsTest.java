package easy;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _160_IntersectionOfTwoLinkedListsTest {

    _160_IntersectionOfTwoLinkedLists intersectionOfTwoLinkedLists;

    @BeforeEach
    public void setUp() {
        intersectionOfTwoLinkedLists = new _160_IntersectionOfTwoLinkedLists();
    }

    @Test
    public void getIntersectionNode_case_1() throws Exception {
        int[] a = new int[] {4, 1, 8, 4, 5};
        int[] b = new int[] {5, 6, 1, 8, 4, 5};
        ListNode listNode = new ListNode();
        ListNode listA = listNode.createLinkedList(a);
        ListNode listB = listNode.createLinkedList(b);
        ListNode expected = new ListNode(1);
        assertEquals(expected.val, intersectionOfTwoLinkedLists.getIntersectionNode(listA, listB).val);
    }

    @Test
    public void getIntersectionNode_case_2() throws Exception {
        int[] a = new int[] {1, 9, 1, 2, 4};
        int[] b = new int[] {3, 2, 4};
        ListNode listNode = new ListNode();
        ListNode listA = listNode.createLinkedList(a);
        ListNode listB = listNode.createLinkedList(b);
        ListNode expected = new ListNode(2);
        assertEquals(expected.val, intersectionOfTwoLinkedLists.getIntersectionNode(listA, listB).val);
    }

    @Test
    public void getIntersectionNode_case_3() throws Exception {
        int[] a = new int[] {2, 6, 4};
        int[] b = new int[] {1, 5};
        ListNode listNode = new ListNode();
        ListNode listA = listNode.createLinkedList(a);
        ListNode listB = listNode.createLinkedList(b);
        assertNull(intersectionOfTwoLinkedLists.getIntersectionNode(listA, listB));
    }
}
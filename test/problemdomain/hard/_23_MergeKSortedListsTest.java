package hard;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _23_MergeKSortedListsTest {

    _23_MergeKSortedLists mergeKSortedLists;

    @BeforeEach
    public void setUp() {
        mergeKSortedLists = new _23_MergeKSortedLists();
    }

    @Test
    public void mergeKLists_case_1() throws Exception {
        int[][] l = new int[][] {
                {1, 4, 5},
                {1, 3, 4},
                {2, 6}
        };
        int[] o = new int[] {1, 1, 2, 3, 4, 4, 5, 6};

        ListNode[] list = new ListNode[l.length];
        for (int i = 0; i < l.length; i++) {
            list[i] = createListNode(l[i]);
        }

        ListNode output = createListNode(o);
        ListNode result = mergeKSortedLists.mergeKLists(list);

        while (output != null) {
            assertEquals(output.val, result.val);
            output = output.next;
            result = result.next;
        }
    }

    @Test
    public void mergeKLists_case_2() throws Exception {
        int[][] l = new int[][] {
                {}
        };
        int[] o = new int[] {};

        ListNode[] list = new ListNode[l.length];
        for (int i = 0; i < l.length; i++) {
            list[i] = createListNode(l[i]);
        }

        ListNode output = createListNode(o);
        ListNode result = mergeKSortedLists.mergeKLists(list);

        while (output != null) {
            assertEquals(output.val, result.val);
            output = output.next;
            result = result.next;
        }
    }

    private ListNode createListNode(int[] nums) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        //checkListNode(dummy.next);
        return dummy.next;
    }

    private void checkListNode(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
    }
}
package medium;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _148_SortListTest {

    _148_SortList sortList;

    @BeforeEach
    public void setUp() {
        sortList = new _148_SortList();
    }

    @Test
    public void sortList_case_1() throws Exception {
        int[] h = new int[] {4, 2, 1, 3};
        int[] e = new int[] {1, 2, 3, 4};
        ListNode head = sortList.sortList(createListNode(h));
        ListNode expected = createListNode(e);

        while (expected != null) {
            assertEquals(expected.val, head.val);
            expected = expected.next;
            head = head.next;
        }
    }

    @Test
    public void sortList_case_2() throws Exception {
        int[] h = new int[] {-1, 5, 3, 4, 0};
        int[] e = new int[] {-1, 0, 3, 4, 5};
        ListNode head = sortList.sortList(createListNode(h));
        ListNode expected = createListNode(e);

        while (expected.next != null) {
            assertEquals(expected.val, head.val);
            expected = expected.next;
            head = head.next;
        }
    }

    private ListNode createListNode(int[] nums) {
        ListNode listNode = new ListNode(0);
        ListNode current = listNode;
        for (int i = 0; i < nums.length; i++) {
            current.next = new ListNode(nums[i]);
            current = current.next;
        }

        //check_list_node(listNode.next);

        return listNode.next;
    }

    private void check_list_node(ListNode listNode) {
        System.out.println(listNode.val);
        while (listNode.next != null) {
            listNode = listNode.next;
            System.out.println(listNode.val);
        }
    }
}
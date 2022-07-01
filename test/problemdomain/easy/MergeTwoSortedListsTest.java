package easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    private MergeTwoSortedLists mergeTwoSortedLists;
    private int[] traverseNode(ListNode listNode) {
        ListNode current = listNode;
        int[] results = new int[10];
        int n = 0;

        if (current == null)
        {
            return null;
        }

        results[n++] = current.val;

        while (current.next != null)
        {
            current = current.next;
            results[n++] = current.val;
        }

        for (int x : results)
        {
            System.out.print(x + " ");
        }
        System.out.println();
        return results;
    }

    private ListNode createListNode(int[] list) {
        if (list == null)
        {
            return null;
        }

        ListNode listNode = new ListNode(list[0]);
        ListNode current = listNode;
        for (int i = 1; i < list.length; i++)
        {
            current.next = new ListNode(list[i]);
            current = current.next;
        }
        return listNode;
    }

    @BeforeEach
    void setUp() {
        this.mergeTwoSortedLists = new MergeTwoSortedLists();
    }

    @AfterEach
    void tearDown() {
        this.mergeTwoSortedLists = null;
    }

    @Test
    void testcase1() {
        int[] list1 = {1, 2 ,4};
        int[] list2 = {1, 3 ,4};
        int[] listExpected = {1, 1, 2, 3, 4, 4};
        ListNode output;

        ListNode listNode1 = createListNode(list1);
        //traverseNode(listNode1);

        ListNode listNode2 = createListNode(list2);
        //traverseNode(listNode2);

        ListNode listNodeExpected = createListNode(listExpected);
        //traverseNode(listNodeExpected);

        output = mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2);
        //traverseNode(output);

        while (output.next != null)
        {
            assertEquals(listNodeExpected.val, output.val);
            output = output.next;
            listNodeExpected = listNodeExpected.next;
        }
    }

    @Test
    void testcase2() {
        ListNode output;

        ListNode listNode1 = null;
        ListNode listNode2 = null;
        ListNode listNodeExpected = null;
        //traverseNode(listNodeExpected);

        output = mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2);
        //traverseNode(output);

        assertNull(output);
    }

    @Test
    void testcase3() {
        ListNode output;

        ListNode listNode1 = null;
        ListNode listNode2 = new ListNode(0);
        ListNode listNodeExpected = new ListNode(0);
        //traverseNode(listNodeExpected);

        output = mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2);
        //traverseNode(output);

        while (output.next != null)
        {
            assertEquals(listNodeExpected.val, output.val);
            output = output.next;
            listNodeExpected = listNodeExpected.next;
        }
    }

    @Test
    void testcase4() {
        int[] list1 = {-30,-27,-27,-23,-23,-22,-21,-21,-19,-19,-16,-16,-15,-13,-9,-9,-5,-5,-3,-2,0,5,5,6,6,7,7,8,9,9,11,11,12,16,20,22,23,23,24,25,25,26};
        int[] list2 = {-25,-25,-22,-20,-18,-17,-11,-2,-2,5,9,13,21,28,28,29};
        int[] listExpected = {-30,-27,-27,-25,-25,-23,-23,-22,-22,-21,-21,-20,-19,-19,-18,-17,-16,-16,-15,-13,-11,-9,-9,-5,-5,-3,-2,-2,-2,0,5,5,5,6,6,7,7,8,9,9,9,11,11,12,13,16,20,21,22,23,23,24,25,25,26,28,28,29};
        ListNode output;

        ListNode listNode1 = createListNode(list1);
        //traverseNode(listNode1);

        ListNode listNode2 = createListNode(list2);
        //traverseNode(listNode2);

        ListNode listNodeExpected = createListNode(listExpected);
        //traverseNode(listNodeExpected);

        output = mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2);
        //traverseNode(output);

        while (output.next != null)
        {
            assertEquals(listNodeExpected.val, output.val);
            output = output.next;
            listNodeExpected = listNodeExpected.next;
        }
    }
}
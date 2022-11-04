package easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _83_RemoveDuplicatesFromSortedListTest {

    private _83_RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList;

    private int[] traverseNode(ListNode listNode) {
    ListNode current = listNode;
    int[] results = new int[100];
    int n = 0; //index

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
        if (x != 0) {
            System.out.print(x + " ");
        }
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
        this.removeDuplicatesFromSortedList = new _83_RemoveDuplicatesFromSortedList();
    }

    @AfterEach
    void tearDown() {
        this.removeDuplicatesFromSortedList = null;
    }

    @Test
    void testcase1() {
        int[] list1 = {1, 1, 2};
        int[] listExpected = {1, 2};
        ListNode output;

        ListNode listNode1 = createListNode(list1);
        //traverseNode(listNode1);

        ListNode listNodeExpected = createListNode(listExpected);
        //traverseNode(listNodeExpected);

        output = removeDuplicatesFromSortedList.remove(listNode1);
        //traverseNode(output);

        while (listNodeExpected != null)
        {
            assertEquals(listNodeExpected.val, output.val);
            output = output.next;
            listNodeExpected = listNodeExpected.next;
        }
    }

    @Test
    void testcase2() {
        int[] list1 = {1, 1, 2, 3, 3};
        int[] listExpected = {1, 2, 3};
        ListNode output;

        ListNode listNode1 = createListNode(list1);
        //traverseNode(listNode1);

        ListNode listNodeExpected = createListNode(listExpected);
        traverseNode(listNodeExpected);

        output = removeDuplicatesFromSortedList.remove(listNode1);
        traverseNode(output);

        while (output != null)
        {
            assertEquals(listNodeExpected.val, output.val);
            output = output.next;
            listNodeExpected = listNodeExpected.next;
        }
    }

    @Test
    void testcase3() {
        int[] list1 = {1, 1, 1, 1, 1};
        int[] listExpected = {1};
        ListNode output;

        ListNode listNode1 = createListNode(list1);
        //traverseNode(listNode1);

        ListNode listNodeExpected = createListNode(listExpected);
        //traverseNode(listNodeExpected);

        output = removeDuplicatesFromSortedList.remove(listNode1);
        //traverseNode(output);

        while (output != null)
        {
            assertEquals(listNodeExpected.val, output.val);
            output = output.next;
            listNodeExpected = listNodeExpected.next;
        }
    }

    @Test
    void testcase4() {
        int[] list1 = {1, 2, 3, 4, 5};
        int[] listExpected = {1, 2, 3, 4, 5};
        ListNode output;

        ListNode listNode1 = createListNode(list1);
        //traverseNode(listNode1);

        ListNode listNodeExpected = createListNode(listExpected);
        //traverseNode(listNodeExpected);

        output = removeDuplicatesFromSortedList.remove(listNode1);
        //traverseNode(output);

        while (output != null)
        {
            assertEquals(listNodeExpected.val, output.val);
            output = output.next;
            listNodeExpected = listNodeExpected.next;
        }
    }

    @Test
    void testcase5() {
        int[] list1 = null;
        int[] listExpected = null;
        ListNode output;

        ListNode listNode1 = createListNode(list1);
        //traverseNode(listNode1);

        ListNode listNodeExpected = createListNode(listExpected);
        //traverseNode(listNodeExpected);

        output = removeDuplicatesFromSortedList.remove(listNode1);
        //traverseNode(output);

        while (output != null)
        {
            assertEquals(listNodeExpected.val, output.val);
            output = output.next;
            listNodeExpected = listNodeExpected.next;
        }
    }
}
package medium;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class _2_AddTwoNumbersTest {

    private _2_AddTwoNumbers addTwoNumbers;

    @BeforeEach
    public void setUp() {
        addTwoNumbers = new _2_AddTwoNumbers();
    }

    @Test
    public void addTwoNumbers_case_1() throws Exception {
        int[] l1 = new int[] {2, 4, 3};
        int[] l2 = new int[] {5, 6, 4};
        int[] expected = new int[] {7, 0, 8};

        ListNode result = addTwoNumbers.addTwoNumbers(buildList(l1), buildList(l2));
        ListNode expectedList = buildList(expected);
        for (int i = 0; i < expected.length; i++) {
            //System.out.println(result.val);
            //System.out.println(expectedList.val);
            assertEquals(expectedList.val, result.val);
            result = result.next;
            expectedList = expectedList.next;
        }
    }

    private ListNode buildList(int[] l) {
        ListNode list = new ListNode(l[0]);
        ListNode current = list;
        for(int i = 1; i < l.length; i++) {
            // System.out.println(l[i]);
            current.next = new ListNode(l[i]);
            current = current.next;
        }
        /*
        System.out.println(list.val);
        while (list.next != null) {
            list = list.next;
            System.out.println(list.val);
        }
        */
        return list;
    }

    @Test
    public void addTwoNumbers_case_2() throws Exception {
        int[] l1 = new int[] {0};
        int[] l2 = new int[] {0};
        int[] expected = new int[] {0};
        ListNode result = addTwoNumbers.addTwoNumbers(buildList(l1), buildList(l2));
        ListNode expectedList = buildList(expected);
        for (int i = 0; i < expected.length; i++) {
            //System.out.println(result.val);
            //System.out.println(expectedList.val);
            assertEquals(expectedList.val, result.val);
            result = result.next;
            expectedList = expectedList.next;
        }
    }

    @Test
    public void addTwoNumbers_case_3() throws Exception {
        int[] l1 = new int[] {9, 9, 9, 9, 9, 9, 9};
        int[] l2 = new int[] {9, 9, 9, 9};
        int[] expected = new int[] {8, 9, 9, 9, 0, 0, 0, 1};
        ListNode result = addTwoNumbers.addTwoNumbers(buildList(l1), buildList(l2));
        ListNode expectedList = buildList(expected);
        for (int i = 0; i < expected.length; i++) {
            //System.out.println(result.val);
            //System.out.println(expectedList.val);
            assertEquals(expectedList.val, result.val);
            result = result.next;
            expectedList = expectedList.next;
        }
    }

    @Test
    public void addTwoNumbers_case_4() throws Exception {
        int[] l1 = new int[] {2,4,9};
        int[] l2 = new int[] {5,6,4,9};
        int[] expected = new int[] {7,0,4,0,1};
        ListNode result = addTwoNumbers.addTwoNumbers(buildList(l1), buildList(l2));
        ListNode expectedList = buildList(expected);
        for (int i = 0; i < expected.length; i++) {
            //System.out.println(result.val);
            //System.out.println(expectedList.val);
            assertEquals(expectedList.val, result.val);
            result = result.next;
            expectedList = expectedList.next;
        }
    }

    @Test
    public void addTwoNumbers_case_5() throws Exception {
        int[] l1 = new int[] {3, 7};
        int[] l2 = new int[] {9, 2};
        int[] expected = new int[] {2, 0, 1};
        ListNode result = addTwoNumbers.addTwoNumbers(buildList(l1), buildList(l2));
        ListNode expectedList = buildList(expected);
        for (int i = 0; i < expected.length; i++) {
            //System.out.println(result.val);
            //System.out.println(expectedList.val);
            assertEquals(expectedList.val, result.val);
            result = result.next;
            expectedList = expectedList.next;
        }
    }
}
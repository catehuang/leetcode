package easy;

import common.ListNode;
import medium.easy._141_LinkedListCycle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _141_LinkedListCycleTest {

    _141_LinkedListCycle linkedListCycle;

    @BeforeEach
    void setUp() {
        this.linkedListCycle = new _141_LinkedListCycle();
    }

    @AfterEach
    void tearDown() {
        this.linkedListCycle = null;
    }

    @Test
    void hasCycleTest1() {
        int[] nums = {3,2,0,-4};
        ListNode head = new ListNode();
        ListNode current = head;
        for (int i: nums)
        {
            current.next = new ListNode(i);
            current = current.next;
        }
        int pos = 1;
        assertTrue(this.linkedListCycle.hasCycle(head, pos));
    }

    @Test
    void hasCycleTest2() {
        int[] nums = {1, 2};
        ListNode head = new ListNode();
        ListNode current = head;
        for (int i: nums)
        {
            current.next = new ListNode(i);
            current = current.next;
        }
        int pos = 0;
        assertTrue(this.linkedListCycle.hasCycle(head, pos));
    }

    @Test
    void hasCycleTest3() {
        ListNode head = new ListNode(1);
        int pos = -1;
        assertFalse(this.linkedListCycle.hasCycle(head, pos));
    }
}
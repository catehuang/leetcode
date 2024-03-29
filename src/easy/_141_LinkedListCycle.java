package easy;

import common.ListNode;

/**
 * There is a cycle in a linked list if there is some node in the list that can be reached again
 * by continuously following the next pointer. Internally, pos is used to denote the index of the node
 * that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 * Constraints:
 *      The number of the nodes in the list is in the range [0, 10^4].
 *      -10^5 <= Node.val <= 10^5
 *      pos is -1 or a valid index in the linked-list.
 */

public class _141_LinkedListCycle {
    /**
     * Given head, the head of a linked list, determine if the linked list has a cycle in it.
     * @param head the head of a linked list
     * @return true if there is a cycle in the linked list. Otherwise, return false
     */
    public boolean hasCycle(ListNode head, int pos) {
        int index = 0;
        while (head != null)
        {
            head = head.next;
            index++;
        }

        if (pos < index && pos > -1)
            return true;
        return false;

//        Set<ListNode> set = new HashSet<>();
//        while (head != null)
//        {
//            if (set.contains(head))
//                return true;
//            set.add(head);
//            head = head.next;
//        }
//        return false;
    }
}

package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists
{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode listNode, current;

        if (list1 == null && list2 == null)
        {
            return null;
        }
        else if (list1 == null && list2 != null)
        {
            return list2;
        }
        else if (list2 == null && list1 != null)
        {
            return list1;
        }
        else
        {
            if (list1.val <= list2.val)
            {
                listNode = new ListNode(list1.val);
                current = listNode;
                if (list1.next != null)
                {
                    list1 = list1.next;
                }
                else
                {
                    current.next = list2;
                    return listNode;
                }
            }
            else
            {
                listNode = new ListNode(list2.val);
                current = listNode;
                if (list2.next != null)
                {
                    list2 = list2.next;
                }
                else
                {
                    current.next = list1;
                    return listNode;
                }
            }
            current = listNode;
        }

        // both list1 and list2 and their next are not null
        while (list1.next != null)
        {
            if (list1.val <= list2.val)
            {
                current.next = new ListNode(list1.val);
                current = current.next;
                list1 = list1.next;
            }
            else
            {
                current.next = new ListNode(list2.val);
                current = current.next;
                if (list2.next != null)
                {
                    list2 = list2.next;
                }
                else
                {
                    current.next = list1;
                    return listNode;
                }
            }
        }
        // the last node of list1
        while (list1 != null)
        {
            if (list1.val <= list2.val)
            {
                current.next = new ListNode(list1.val);
                current = current.next;
                list1 = null;
            }
            else
            {
                current.next = new ListNode(list2.val);
                current = current.next;
                if (list2.next != null) {
                    list2 = list2.next;
                }
                else
                {
                    current.next = list1;
                    return listNode;
                }
            }
        }

        if (list2 != null)
        {
            current.next = list2;
        }

        return listNode;






        /* Accepted but slow
        ListNode results, current;
        int[] arr = new int[100];
        int n = 0;

        if (list1 == null && list2 == null)
        {
            return null;
        }

        if (list1 != null) {
            while (list1.next != null) {
                arr[n++] = list1.val;
                list1 = list1.next;
            }
            arr[n++] = list1.val;
        }

        if (list2 != null) {
            while (list2.next != null) {
                arr[n++] = list2.val;
                list2 = list2.next;
            }
            arr[n++] = list2.val;
        }

        int[] resize = new int[n];

        for (int i = 0; i < n; i++)
        {
            resize[i] = arr[i];
        }

        Arrays.sort(resize);

        results = new ListNode(resize[0]);
        current = results;
        for (int i = 1; i < n; i++)
        {
            current.next = new ListNode(resize[i]);
            current = current.next;
        }
        return results;
        */

        /* spent too long unacceptable
        if (list1.val > list2.val) {
            output = list2;
            list2 = list2.next;
        } else {
            output = list1;
            list1 = list1.next;
        }
        current = output.next;

        while (list1.next != null)
        {
            if (list2 != null)
            {
                if (list1.val > list2.val)
                {
                    current.next = list2;
                    list2 = list2.next;
                }
                else
                {
                    current.next = list1;
                    list1 = list1.next;
                }
                current = current.next;
            }
            else
            {
                current.next = list1;
                current = current.next;
                list1 = list1.next;
            }

        }

        return output;
        */
    }
}

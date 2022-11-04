package easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class _108_ConvertSortedArraytoBinarySearchTreeTest {

    _108_ConvertSortedArraytoBinarySearchTree c;
    Queue<TreeNode> queue;
    List<Integer> listExpected;
    List<Integer> listResults;

    @BeforeEach
    void setUp() {
        this.c = new _108_ConvertSortedArraytoBinarySearchTree();
        this.queue = new LinkedList<>();
        this.listExpected = new ArrayList<>();
        this.listResults = new ArrayList<>();
    }

    @AfterEach
    void tearDown() {
        this.c = null;
        this.queue = null;
        List<Integer> listExpected = null;
        List<Integer> listResults = null;
    }

    @Test
    void testcase1() {
        int[] nums = {-10,-3,0,5,9};
        TreeNode root = this.c.sortedArrayToBST(nums);
        TreeNode output = new TreeNode(0,
                new TreeNode(-10, null, new TreeNode(-3)),
                new TreeNode(5, null, new TreeNode(9)));
        BFS(listExpected, output);
        BFS(listResults, root);
        assertEquals(listExpected, listResults);
    }

    private void BFS(List<Integer> list, TreeNode treenode) {
        if (treenode == null)
            return;
        queue.clear();
        queue.offer(treenode);
        while (!queue.isEmpty())
        {
            TreeNode node = queue.poll();
            if (node.val != null)
                list.add(node.val);
            if (node.left != null)
                queue.offer(node.right);
            if (node.right != null)
                queue.offer((node.right));
        }
    }

    @Test
    void testcase2() {
        int[] nums = {1, 3};
        TreeNode output = new TreeNode(1, null, new TreeNode(3));
        BFS(listResults, this.c.sortedArrayToBST(nums));
        BFS(listExpected, output);
        assertEquals(listExpected, listResults);
    }
}
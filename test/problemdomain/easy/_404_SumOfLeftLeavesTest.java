package easy;

import common.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _404_SumOfLeftLeavesTest {

    _404_SumOfLeftLeaves sumOfLeftLeaves;

    @BeforeEach
    public void setUp() {
        sumOfLeftLeaves = new _404_SumOfLeftLeaves();
    }

    @Test
    public void sumOfLeftLeaves_case_1() throws Exception {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int expected = 24;
        assertEquals(expected, sumOfLeftLeaves.sumOfLeftLeaves(root));
    }

    @Test
    public void sumOfLeftLeaves_case_2() throws Exception {
        TreeNode root = new TreeNode(1);
        int expected = 0;
        assertEquals(expected, sumOfLeftLeaves.sumOfLeftLeaves(root));
    }

    @Test
    public void sumOfLeftLeaves_case_3() throws Exception {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int expected = 21;
        assertEquals(expected, sumOfLeftLeaves.sumOfLeftLeaves(root));
    }

    @Test
    public void sumOfLeftLeaves_case_4() throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        int expected = 2;
        assertEquals(expected, sumOfLeftLeaves.sumOfLeftLeaves(root));
    }

    @Test
    public void sumOfLeftLeaves_case_5() throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(null);
        root.right = new TreeNode(2);
        int expected = 0;
        assertEquals(expected, sumOfLeftLeaves.sumOfLeftLeaves(root));
    }

    @Test
    public void sumOfLeftLeaves_case_6() throws Exception {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(2);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(-1);
        root.left.left.left = new TreeNode(5);
        root.left.left.right = new TreeNode(1);
        root.right.left.right = new TreeNode(6);
        root.right.right.right = new TreeNode(8);

        int expected = 5;
        assertEquals(expected, sumOfLeftLeaves.sumOfLeftLeaves(root));
    }

    @Test
    public void sumOfLeftLeaves_case_7() throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        int expected = 4;
        assertEquals(expected, sumOfLeftLeaves.sumOfLeftLeaves(root));
    }

    @Test
    public void sumOfLeftLeaves_case_8() throws Exception {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(-4);
        root.right = new TreeNode(-3);
        root.left.right = new TreeNode(-1);
        root.right.left = new TreeNode(8);
        root.left.right.right = new TreeNode(3);
        root.right.left.right = new TreeNode(-9);
        root.left.right.right.left = new TreeNode(-2);
        root.right.left.right.left = new TreeNode(4);
        int expected = 2;
        assertEquals(expected, sumOfLeftLeaves.sumOfLeftLeaves(root));
    }
}
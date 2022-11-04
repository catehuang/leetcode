package easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _112_PathSumTest {

    _112_PathSum pathSum;

    @BeforeEach
    void setUp() {
        this.pathSum = new _112_PathSum();
    }

    @AfterEach
    void tearDown() {
        this.pathSum = null;
    }

    @Test
    void testcase1() {
        TreeNode n4 = new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null);
        TreeNode n8 = new TreeNode(4, new TreeNode(13), new TreeNode(4, null, new TreeNode(1)));
        TreeNode root = new TreeNode(5, n4, n8);

        assertTrue(this.pathSum.hasPathSum(root, 22));
    }

    @Test
    void testcase2() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        assertFalse(this.pathSum.hasPathSum(root, 5));

    }

    @Test
    void testcase3() {
        TreeNode root = new TreeNode(null);

        assertFalse(this.pathSum.hasPathSum(root, 0));
    }

    @Test
    void testcase4() {
        TreeNode root = new TreeNode(-5);

        assertFalse(this.pathSum.hasPathSum(root, 0));
        assertTrue(this.pathSum.hasPathSum(root, -5));
    }
}
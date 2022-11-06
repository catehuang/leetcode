package easy;

import common.TreeNode;
import medium.easy._94_BinaryTreeInorderTraversal;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _94_BinaryTreeInorderTraversalTest {

    private _94_BinaryTreeInorderTraversal binaryTreeInorderTraversal;
    private List<Integer> output;
    private int counter = 0;

    @BeforeEach
    void setUp() {
        this.binaryTreeInorderTraversal = new _94_BinaryTreeInorderTraversal();
        this.output = new ArrayList<>();
        counter = 1;
    }

    @AfterEach
    void tearDown() {
        this.binaryTreeInorderTraversal = null;
        this.output = null;
        counter = 0;
    }

    @Test
    void testcase1() {
        TreeNode n3 = new TreeNode(3, null, null);
        TreeNode n2 = new TreeNode(2, n3, null);
        TreeNode nn = new TreeNode(null, null, null);
        TreeNode n1 = new TreeNode(1, nn, n2);

        this.output.add(1);
        this.output.add(3);
        this.output.add(2);

        assertEquals(output, this.binaryTreeInorderTraversal.inorderTraversal(n1));
    }

    @Test
    void testcase2() {
        TreeNode nn = new TreeNode(null);
        assertEquals(output, this.binaryTreeInorderTraversal.inorderTraversal(nn));
    }

    @Test
    void testcase3() {
        TreeNode n1 = new TreeNode(1);
        this.output.add(1);
        assertEquals(this.output, this.binaryTreeInorderTraversal.inorderTraversal(n1));
    }

    @Test
    void testcase4() {
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2, n3, null);
        TreeNode nn = new TreeNode(null);
        TreeNode n1 = new TreeNode(1, n2, nn);

        this.output.add(3);
        this.output.add(2);
        this.output.add(1);

        assertEquals(output, this.binaryTreeInorderTraversal.inorderTraversal(n1));
    }
}
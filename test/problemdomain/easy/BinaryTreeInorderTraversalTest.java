package easy;

import com.sun.source.tree.Tree;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeInorderTraversalTest {

    private BinaryTreeInorderTraversal binaryTreeInorderTraversal;
    private TreeNode root;
    private List<Integer> output;
    private int counter = 0;

    @BeforeEach
    void setUp() {
        this.binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
        this.root = null;
        this.output = new ArrayList<>();
        counter = 1;
    }

    @AfterEach
    void tearDown() {
        this.binaryTreeInorderTraversal = null;
        this.root = null;
        this.output = null;
        counter = 0;
    }

    private void add(Integer newValue)
    {
        if (root == null)
        {
            root = new TreeNode(newValue);
        }
        else
        {
            add(newValue, root);
        }
    }

    private void add(Integer newValue, TreeNode current)
    {
        if (newValue == null)
        {
            newValue = 0;
        }

        if (current.left == null)
        {
            current.left = new TreeNode(newValue);
        }
        else if (current.right == null)
        {
            current.right = new TreeNode(newValue);
        }
        else
        {
            if (current.left.val == 0)
            {
                add(newValue, current.right);
            }
            else if (current.right.val == 0) {
                add(newValue, current.left);
            }
            else
            {
                add(newValue, current.left);
            }
        }
    }

    @Test
    void testcase1() {
        add(1);
        add(null);
        add(2);
        add(3);

        this.output.add(0);
        this.output.add(1);
        this.output.add(3);
        this.output.add(2);

        assertEquals(output, this.binaryTreeInorderTraversal.inorderTraversal(root));
    }

    @Test
    void testcase2() {
        add(null);
        output.add(null);
        assertEquals(output, this.binaryTreeInorderTraversal.inorderTraversal(root));
    }

    @Test
    void testcase3() {
        add(1);
        this.output.add(1);
        assertEquals(this.output, this.binaryTreeInorderTraversal.inorderTraversal(root));
    }

    @Test
    void testcase4() {
        add(1);
        add(2);
        add(null);
        add(3);

        this.output.add(3);
        this.output.add(2);
        this.output.add(1);
        this.output.add(0);

        assertEquals(output, this.binaryTreeInorderTraversal.inorderTraversal(root));
    }
}
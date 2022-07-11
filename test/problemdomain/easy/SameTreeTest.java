package easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {

    SameTree sameTree;
    TreeNode treeNode1;

    @BeforeEach
    void setUp() {
        this.sameTree = new SameTree();
        this.treeNode1 = new TreeNode();
    }

    @AfterEach
    void tearDown() {
        this.sameTree = null;
        this.treeNode1 = null;
    }
    

    @Test
    void testacase1() {
        TreeNode t1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode t2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertTrue(this.sameTree.isSameTree(t1, t2));
        }

    @Test
    void testacase2() {
        TreeNode t1 = new TreeNode(1, new TreeNode(2), null);
        TreeNode t2 = new TreeNode(1, null, new TreeNode(2));
        assertFalse(this.sameTree.isSameTree(t1, t2));
    }

    @Test
    void testacase3() {
        TreeNode t1 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode t2 = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        assertFalse(this.sameTree.isSameTree(t1, t2));
    }

    @Test
    void testacase4() {
        TreeNode t1 = new TreeNode(1, new TreeNode(), null);
        TreeNode t2 = new TreeNode(1, null, new TreeNode());
        assertFalse(this.sameTree.isSameTree(t1, t2));
    }
}
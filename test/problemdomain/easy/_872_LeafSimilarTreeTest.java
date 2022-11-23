package easy;

import common.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _872_LeafSimilarTreeTest {

    _872_LeafSimilarTree leafSimilarTree;

    @BeforeEach
    public void setUp() {
        leafSimilarTree = new _872_LeafSimilarTree();
    }

    private void addChild(TreeNode root, Integer child) {
        TreeNode childNode = new TreeNode(child);
        if (root.left == null) {
            root.left = childNode;
        } else {
            root.right = childNode;
        }
    }

    @Test
    public void leafSimilar_case_1() throws Exception {
        Integer[] nodes1 = new Integer[] {3,5,1,6,2,9,8,null,null,7,4};
        Integer[] nodes2 = new Integer[] {3,5,1,6,7,4,2,null,null,null,null,null,null,9,8};

        TreeNode root1 = new TreeNode(3);
        addChild(root1, 5);
        addChild(root1, 1);
        addChild(root1.left, 6);
        addChild(root1.left, 2);
        addChild(root1.right, 9);
        addChild(root1.right, 8);
        addChild(root1.left.right, 7);
        addChild(root1.left.right, 4);

        TreeNode root2 = new TreeNode(3);
        addChild(root2, 5);
        addChild(root2, 1);
        addChild(root2.left, 6);
        addChild(root2.left, 7);
        addChild(root2.right, 4);
        addChild(root2.right, 2);
        addChild(root2.right.right, 9);
        addChild(root2.right.right, 8);

        assertTrue(leafSimilarTree.leafSimilar(root1, root2));
    }

    @Test
    public void leafSimilar_case_2() throws Exception {
        TreeNode root1 = new TreeNode(3);
        addChild(root1, 5);
        addChild(root1, 1);
        addChild(root1.left, 6);
        addChild(root1.left, 7);
        addChild(root1.right, 4);
        addChild(root1.right, 2);
        addChild(root1.right.right, 9);
        addChild(root1.right.right, 11);

        TreeNode root2 = new TreeNode(3);
        addChild(root2, 5);
        addChild(root2, 1);
        addChild(root2.left, 6);
        addChild(root2.left, 2);
        addChild(root2.right, 9);
        addChild(root2.right, 8);
        addChild(root2.left.right, 7);
        addChild(root2.left.right, 4);

        assertFalse(leafSimilarTree.leafSimilar(root1, root2));
    }

    @Test
    public void leafSimilar_case_3() throws Exception {
        TreeNode root1 = new TreeNode(1);
        addChild(root1, 2);
        addChild(root1, 3);

        TreeNode root2 = new TreeNode(1);
        addChild(root2, 3);
        addChild(root2, 2);

        assertFalse(leafSimilarTree.leafSimilar(root1, root2));
    }
}
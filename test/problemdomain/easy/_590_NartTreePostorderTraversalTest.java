package easy;

import common.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _590_NartTreePostorderTraversalTest {

    _590_NartTreePostorderTraversal nartTreePostorderTraversal;

    @BeforeEach
    public void setUp() {
        nartTreePostorderTraversal = new _590_NartTreePostorderTraversal();
    }

    @Test
    public void postorder() throws Exception {
        Integer[] nodes = new Integer[] {1, null, 3, 2, 4, null, 5, 6};
        Integer[] outputs = new Integer[] {5, 6, 3, 2, 4, 1};
        List<Integer> expected = Arrays.stream(outputs).toList();

        _590_NartTreePostorderTraversal.Node root = new _590_NartTreePostorderTraversal.Node(nodes[0]);
        List<_590_NartTreePostorderTraversal.Node> layerOne = new ArrayList<>();
        layerOne.add(new _590_NartTreePostorderTraversal.Node(3));
        layerOne.add(new _590_NartTreePostorderTraversal.Node(2));
        layerOne.add(new _590_NartTreePostorderTraversal.Node(4));
        root.children = layerOne;

        List<_590_NartTreePostorderTraversal.Node> layerTwo = new ArrayList<>();
        layerTwo.add(new _590_NartTreePostorderTraversal.Node(5));
        layerTwo.add(new _590_NartTreePostorderTraversal.Node(6));
        root.children.get(0).children = layerTwo;

        List<Integer> results = nartTreePostorderTraversal.postorder(root);

        assertEquals(expected, results);

    }

}
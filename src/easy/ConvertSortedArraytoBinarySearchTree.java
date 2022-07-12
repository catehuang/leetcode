package easy;

/** Given an integer array nums where the elements are sorted in ascending order,
 *  convert it to a height-balanced binary search tree.  A height-balanced binary
 *  tree is a binary tree in which the depth of the two subtrees of every node never
 *  differs by more than one.
 *
 *  Constraints:
 *    1 <= nums.length <= 104
 *    -104 <= nums[i] <= 104
 *    nums is sorted in a strictly increasing order.
 */


public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;

        return createBST(nums, 0, nums.length - 1);
    }

    private TreeNode createBST(int[] nums, int left, int right)
    {
        if (left > right)
            return null;

        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = createBST(nums, left, mid - 1);
        node.right = createBST(nums, mid + 1, right);
        return node;
    }
}

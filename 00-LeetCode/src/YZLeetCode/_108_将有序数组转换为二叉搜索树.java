package YZLeetCode;

// https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
public class _108_将有序数组转换为二叉搜索树 {
	public TreeNode sortedArrayToBST(int[] nums) {
    return sortedArrayToBST(nums, 0, nums.length-1);
}

private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
    if (start > end) {
        return null;
    }
    int mid = start + (end-start) /2;
    TreeNode root = new TreeNode(nums[mid]);
    root.left = sortedArrayToBST(nums, start, mid-1);
    root.right = sortedArrayToBST(nums, mid + 1, end);

    return root;
}
	
}

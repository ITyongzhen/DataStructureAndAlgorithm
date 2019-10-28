package YZLeetCode;

// https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/
public class _783_二叉搜索树结点最小距离 {
	TreeNode pre;
	int min = Integer.MAX_VALUE;
	public int minDiffInBST(TreeNode root) {
        minDiff(root);
		return min;
    }
	
	private void minDiff(TreeNode node) {
		if (node == null) {
			return ;
		}
		minDiff(node.left);
		if (pre != null) {
			min = Math.min(min, node.val-pre.val);
		}
		pre = node;
		
		minDiff(node.right);
	}
	
}

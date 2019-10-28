package YZLeetCode;

// https://leetcode-cn.com/problems/longest-univalue-path/
public class _687最长同值路径 {
	int num ;

	public int longestUnivaluePath(TreeNode root) {
        num = 0;
        getLengethNode(root);
        return num;
    }
	
	private int getLengethNode(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int left = getLengethNode(node.left);
		int right = getLengethNode(node.right);
		int leftLength = 0;
		int rightLength = 0;
		if (node.left != null && node.val == node.left.val) {
			leftLength = left +1;
		}
		if (node.right != null && node.val == node.right.val) {
			rightLength = right + 1;
		}
		num = Math.max(num, leftLength + rightLength);
		return Math.max(leftLength, rightLength);
		
	}
}

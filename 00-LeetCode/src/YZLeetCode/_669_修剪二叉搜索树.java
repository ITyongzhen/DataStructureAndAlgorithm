package YZLeetCode;

// https://leetcode-cn.com/problems/trim-a-binary-search-tree/
public class _669_修剪二叉搜索树 {
	//[1,0,2]
	//1
	//2
	public TreeNode trimBST(TreeNode root, int L, int R) {
		
		if (root == null) {
			return root;
		}
		
		if (root.val<L) {
			return trimBST(root.right, L, R);
		}
		if (root.val > R ) {
			return trimBST(root.left, L, R);
		}
		root.left = trimBST(root.left, L, R);
		root.right = trimBST(root.right, L, R);
		return root;
    }
	
	
}

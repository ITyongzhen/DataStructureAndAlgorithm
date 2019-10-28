package YZLeetCode;

// https://leetcode-cn.com/problems/search-in-a-binary-search-tree/
public class _700_二叉树中的搜索 {
	public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)return null;
        if (root.val == val) {
			return root;
		}else if (root.val < val) {
			return searchBST(root.right, val);
		}else {
			return searchBST(root.left, val);
		}
        
    }
}

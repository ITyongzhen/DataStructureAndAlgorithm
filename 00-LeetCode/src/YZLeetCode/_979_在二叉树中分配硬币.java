package YZLeetCode;

//https://leetcode-cn.com/problems/distribute-coins-in-binary-tree/
public class _979_在二叉树中分配硬币 {
	int res = 0;
	 public int distributeCoins(TreeNode root) {
	        
		 dfs(root);
		 return res;
	    }
	 
	 private int dfs(TreeNode node) {
		 if (node == null) {
			return 0;
		}
		 
		 int L = dfs(node.left);
		 int R = dfs(node.right);
		 res += Math.abs(L) + Math.abs(R);
		 return node.val -1 + L + R;
		 
	 }
	 
}

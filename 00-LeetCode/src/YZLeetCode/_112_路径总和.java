package YZLeetCode;
import java.util.HashMap;
import java.util.HashSet;

import javax.print.attribute.standard.NumberOfDocuments;

//https://leetcode-cn.com/problems/path-sum/
public class _112_路径总和 {
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}
		
		sum-= root.val;
		if (root.left == null && root.right == null) {
			return sum==0;
		}
		return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
		
	}

	
//	HashSet<Integer> set;
//	 public boolean hasPathSum(TreeNode root, int sum) {
//		 if (root == null) {
//			return false;
//		}
//	       set = new HashSet<>();
//	        dfs(root, sum, 0);
//	        return set.contains(sum);
//	 }
//	 
//	 private void dfs(TreeNode node,int sum,int res) {
//		
//		 
//		 if (node == null) {
//			return;
//		 }
//		 
//		 res+=node.val;
//		 if (node.left== null && node.right == null) {
//			 set.add(res);
//		 }
//		
//		 dfs(node.left, sum, res);
//		 dfs(node.right, sum, res);
//		 
//	 }
//	 
}

package YZLeetCode;
//https://leetcode-cn.com/problems/path-sum-iii/

import java.util.HashMap;import javax.swing.RootPaneContainer;

public class _437_路径总和III {
	HashMap<TreeNode, Integer> map;
	public int pathSum(TreeNode root, int sum) {
		if (root == null) {
			return 0;
		}
		return paths(root, sum) + paths(root.left, sum)+paths(root.right, sum);
	}
	
	

	private int paths(TreeNode node, int sum) {
		if (node == null) {
			return 0;
		}
		
		int res = 0;
		if (node.val == sum) {
			res+=1;
		}
		
		res+= paths(node.left, sum-node.val);
		res+= paths(node.right, sum-node.val);
		return res;
	}
}

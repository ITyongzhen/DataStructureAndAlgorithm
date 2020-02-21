package YZLeetCode;

import java.util.HashMap;

import javax.swing.RootPaneContainer;

//https://leetcode-cn.com/problems/house-robber-iii/
public class _337_打家劫舍III {
	
	 public int rob(TreeNode root) {
		 
		 int[] result = robInternal(root);
		 return Math.max(result[0], result[1]);
		 
	 }
	
	 
	 public int[] robInternal(TreeNode root) {
		if (root == null) {
			return new int[2];
		}
		 
		int[] res = new int[2];
		int[] left = robInternal(root.left);
		int[] right = robInternal(root.right);
		res[0] = Math.max(left[0], left[1])+ Math.max(right[0], right[1]);
		res[1] = left[0] + right[0] + root.val;
		return res;
		
	}
	
	 public int rob2(TreeNode root) {
	        HashMap<TreeNode, Integer> map = new HashMap<>();
	        return robInternal2(root, map);
	    }
	 
	 public int robInternal2(TreeNode node, HashMap<TreeNode, Integer> map) {
		if (node == null) {
			return 0;
		}
		if (map.containsKey(node)) {
			return map.get(node);
		}
		
		int money = node.val;
		if (node.left!=null) {
			money += (robInternal2(node.left.left, map)) + (robInternal2(node.left.right, map));
		}
		if (node.right!=null) {
			money += (robInternal2(node.right.left, map)) + (robInternal2(node.right.right, map));
		}
		int res = Math.max(money, robInternal2(node.left, map) + robInternal2(node.right, map));
		map.put(node, res);
		return res;
	}
}

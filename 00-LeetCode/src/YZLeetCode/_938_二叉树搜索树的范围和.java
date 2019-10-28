package YZLeetCode;

import java.util.Stack;

//https://leetcode-cn.com/problems/range-sum-of-bst/
public class _938_二叉树搜索树的范围和 {
	 public int rangeSumBST2(TreeNode root, int L, int R) {
		 if (root == null) {
			 return 0;
		 }
		 if (root.val < L) {
			 return rangeSumBST2(root.right, L, R);
		 }
		 if (root.val > R) {
			 return rangeSumBST2(root.left, L, R);
		 }
return root.val + rangeSumBST2(root.left, L, R) + rangeSumBST2(root.right, L, R);
}


		Stack<Integer> stack = new Stack<>();
	 	public int rangeSumBST(TreeNode root, int L, int R) {
	 		process(root);
	 		int sum = 0;
	 		while (!stack.isEmpty()) {
	 			int k = stack.pop();
				if (L <= k && R >= k) {
					sum += k;
				}
				if (R>k) {
					break;
				}
			}
	 		
	        return sum;
	    }
	 	
	 	private void process(TreeNode node) {
			
	 		if (node == null) {
				return;
			}
	 		process(node.left);
	 		stack.push(node.val);
	 		process(node.right);
	 		
		}
	 	
}

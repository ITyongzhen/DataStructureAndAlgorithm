package YZLeetCode;

import java.util.Stack;

//https://leetcode-cn.com/problems/binary-search-tree-to-greater-sum-tree/
public class _1038_从二叉搜索树到更大和树 {
	int sum;
	 public TreeNode bstToGst(TreeNode root) {
	        inorderTraversal(root);
	       
	        return root;
	    }
	 
	
	 
	 private void inorderTraversal(TreeNode node) {
		 
		 if (node.right!=null) {
			 inorderTraversal(node.right);
		}
		 node.val = sum = sum+=node.val;
		 
		 if (node.left!=null) {
			 inorderTraversal(node.left);
			 
		}
		 
	 }
}

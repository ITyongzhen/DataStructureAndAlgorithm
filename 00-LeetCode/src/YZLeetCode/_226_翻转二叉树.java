package YZLeetCode;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode-cn.com/problems/invert-binary-tree/
public class _226_翻转二叉树 {
	public TreeNode invertTree3(TreeNode root) {
	    if (root == null) return null;
	    Queue<TreeNode> queue = new LinkedList<TreeNode>();
	    queue.add(root);
	    while (!queue.isEmpty()) {
	        TreeNode current = queue.poll();
	        TreeNode temp = current.left;
	        current.left = current.right;
	        current.right = temp;
	        if (current.left != null) queue.add(current.left);
	        if (current.right != null) queue.add(current.right);
	    }
	    return root;
	}


	public TreeNode invertTree2(TreeNode root) {
	       if (root == null) return null;
	       Queue<TreeNode> queue = new LinkedList<TreeNode>();
	       queue.add(root);
	       
	      while (!queue.isEmpty()) {
			TreeNode cur = queue.poll();
			// 交换
			TreeNode temp = cur.left;
			cur.left = cur.right;
			cur.right = temp;
			
			if (cur.left != null)queue.add(cur.left);
			if (cur.right != null)queue.add(cur.right);			
	       }
	       
	      
	       return root;
	    }
	
	 public TreeNode invertTree(TreeNode root) {
	       if (root == null) {
			return root;
	       }
		 
	       TreeNode left = invertTree(root.left);
	       TreeNode right = invertTree(root.right);
	       root.left = right;
	       root.right = left;
		 return root;
	    }
}

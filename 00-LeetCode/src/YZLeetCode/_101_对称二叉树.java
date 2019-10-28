package YZLeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class _101_对称二叉树 {
	 public boolean isSymmetric(TreeNode root) {
	     Queue<TreeNode> queue = new LinkedList<>();
	   queue.add(root);
	   queue.add(root);
	   while (!queue.isEmpty()) {
		TreeNode node1 = queue.poll();
		TreeNode node2 = queue.poll();
		if (node1 == null &&  node2 == null) continue;
		if (node1 == null ||  node2 == null) return false;
		if (node1.val != node2.val) {
			return false;
		}
		
		queue.add(node1.left);
		queue.add(node2.right);
		queue.add(node1.right);
		queue.add(node2.left);
		
	   }
	        
	     return true;   
	 }
	 
	
	 
//	 public boolean isSymmetric(TreeNode root) {
//	        return isSymmetric(root, root);
//	 }
//	 
//	 private boolean isSymmetric(TreeNode node1, TreeNode node2) {
//		if (node1 == null &&  node2 == null) return true;
//		if (node1 == null ||  node2 == null) return false;
//		return (node1.val == node2.val &&  isSymmetric(node1.left, node2.right) &&  isSymmetric(node1.right, node2.left));
//	}
}

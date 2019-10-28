package YZLeetCode;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
public class _104_二叉树的最大深度 {
	
	public int maxDepth2(TreeNode root) {
		 if (root == null) {
				return 0;
			}else {
				int leftHeight = maxDepth2(root.left);
				int rightHeight = maxDepth2(root.right);
				return Math.max(leftHeight, rightHeight) + 1;
				
			}
		
	}
	 public int maxDepth(TreeNode root) {
	     int deep = 0;   
	     if (root == null) {
			return deep;
		}
	     
	     Queue<TreeNode> queue = new LinkedList<>();
	     queue.offer(root);
	     
	     while (!queue.isEmpty()) {
	    	 int num = queue.size();
	    	 while (num>0) {
				TreeNode node = queue.poll();
				if (node.left != null) {
					queue.offer(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
				num--;
			}
	    	 deep++;
			
		}
	     
	     
		 
		 return deep;
	    }
	 
	 
	 
}

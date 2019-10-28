package YZLeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
public class _102_二叉树的层次遍历 {
	 public List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>> list = new ArrayList<>();
	        if (root == null) {
				return list;
			}
	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.offer(root);
	       while (!queue.isEmpty()) {
	    	   int num = queue.size();
	    	   List<Integer> list2 = new ArrayList<>();
	    	   while (num>0) {
	    		   TreeNode node = queue.poll();
	    		   list2.add(node.val);
	    		   if (node.left != null) {
					queue.offer(node.left);
	    		   }
	    		   if (node.right != null) {
					queue.offer(node.right);
	    		   }
				num--;
	    	   }
	    	   list.add(list2);
	        
	        
	       
	    }
	       return list;
	 }
}
